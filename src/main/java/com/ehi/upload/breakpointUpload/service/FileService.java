package com.ehi.upload.breakpointUpload.service;

import com.ehi.upload.breakpointUpload.exception.ServiceException;
import com.ehi.upload.breakpointUpload.model.UploadReturnInfo;
import com.ehi.upload.breakpointUpload.utils.FileUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/8 16:22
 * @Description: TODO
 */

/**
 * @className: FileService
 * @packageName: com.thirtydays.pdioms.resource.base.task.service
 * @description: File Service
 * @author: linxuejun
 * @date: 2019-07-04 16:54
 * @version: V1.0
 */
@Service
public class FileService implements InitializingBean {

    private static Logger LOGGER = (Logger) LoggerFactory.getLogger(FileService.class.getName());

    private String uploadRootPath;
    @Value("${upload.return.root.url}")
    private String uploadReturnRootUrl;
    private String fileDir;
    private String imageDir;

    public UploadReturnInfo uploadFile(InputStream in, String fileName, Integer fileLength, Integer position) throws Exception{

        Assert.isTrue(in != null, "文件流不为NULL");

        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
        String todayStr = dataFormat.format(new Date());

        //通过文件后缀判断是否是图片
        String fileSuffix = FileUtils.extractSuffix(fileName);

        //文件存储路径
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('/').append(todayStr).append('/').append(fileDir);
        String fileStoreSubpath = stringBuilder.toString();

        stringBuilder.delete(0, stringBuilder.length());
        String fileStoreDirPath = stringBuilder.append(uploadRootPath).append(fileStoreSubpath).toString();

        //文件返回URL路径
        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append(uploadReturnRootUrl).append(fileStoreSubpath);
        String uploadReturnUrl = stringBuilder.toString();

        String md5Val = null;
        UploadReturnInfo returnInfo = null;
        try{
            if(null == fileLength || null == position) {
                md5Val = storeFile(in, fileStoreDirPath, fileName);

                File md5NameFile = new File(fileStoreDirPath + md5Val + fileSuffix);

                if(md5NameFile.exists()){
                    new File(fileStoreDirPath + fileName).delete();
                }else{
                    new File(fileStoreDirPath + fileName).renameTo(md5NameFile);
                }

                fileName = md5Val + fileSuffix;
                returnInfo = new UploadReturnInfo(uploadReturnUrl + fileName, fileStoreDirPath + fileName, md5Val);
                returnInfo.setFinished(true);
            }else{
                returnInfo = saveFile(in, fileLength, fileStoreDirPath + fileName, position);
                if(returnInfo.getFinished()){
                    returnInfo.setAbsolutePath(fileStoreDirPath + returnInfo.getMd5() + fileSuffix);
                    returnInfo.setUrl(uploadReturnUrl + returnInfo.getMd5() + fileSuffix);
                }
            }

        }catch (ServiceException e){
            throw new ServiceException("500", "保存文件出错!");
        }

        return returnInfo;
    }

    public UploadReturnInfo uploadFile(MultipartFile file, Integer fileLength, Integer position) throws Exception{
        return uploadFile(file.getInputStream(), file.getOriginalFilename(), fileLength, position);
    }


    protected String storeFile(InputStream in, String storePath, String fileName) throws Exception {

        File storePathFile = new File(storePath);
        if(!storePathFile.exists()){
            storePathFile.mkdirs();
        }

        MessageDigest md5Digest = DigestUtils.getMd5Digest();
        FileOutputStream fileOutputStream = new FileOutputStream(storePath + fileName);
        byte [] buf = new byte[1024];
        Integer len = 0;
        while((len = in.read(buf)) != -1) {
            md5Digest.update(buf, 0, len);
            fileOutputStream.write(buf, 0, len);
        }

        fileOutputStream.close();

        //计算MD5
        byte [] resultBytes = md5Digest.digest();
        StringBuilder stringBuilder = new StringBuilder();

        for (byte b : resultBytes) {
            int a = b & 0xff;

            String hex = Integer.toHexString(a);

            if (hex.length() == 1) {
                hex = 0 + hex;
            }
            stringBuilder.append(hex);
        }

        return stringBuilder.toString();
    }

    /**
     * 保存文件数据（支持从指定位置开始保存）
     * @param in 数据输入流
     * @param fileLength 文件大小
     * @param targetFilePath 目标文件
     * @param position 断点续传位置
     * @return
     * @return Boolean  成功或失败
     * @author caiwenhao
     * @date 2019年7月4日 下午7:21:15
     * @version  [1.0, 2019年7月4日]
     * @since  version 1.0
     */
    public UploadReturnInfo saveFile(InputStream in, long fileLength, String targetFilePath, long position) throws Exception{

        UploadReturnInfo returnInfo = null;
        try
        {
            File storePathFile = new File(targetFilePath.substring(0, targetFilePath.lastIndexOf(File.separator)));
            if (!storePathFile.exists()) {
                storePathFile.mkdirs();
            }

            String fileSuffix = FileUtils.extractSuffix(targetFilePath);

            if (position >= fileLength) {
                LOGGER.warn("Invalid task position,target task path:{}", targetFilePath);
                //return false;
                throw new ServiceException("400", "position不能大于文件大小");
            }

            String actualFilePath = targetFilePath +  (position < fileLength ? ".tmp" : "");
            RandomAccessFile targetFile = new RandomAccessFile(actualFilePath, "rw");
            if (position >= 0) {
                targetFile.seek(position);
            }

            int b = 0;
            while((b = in.read()) >= 0) {
                targetFile.write(b);
            }

            long length = targetFile.length();
            targetFile.close();

            returnInfo = new UploadReturnInfo();
            if (fileLength <= length) {
                // 在rename之前需要保证文件资源不被占用，否则会失败，所以在此之前将targetFile关闭掉
                // 计算MD5值
                FileInputStream fileInputStream = new FileInputStream(new File(actualFilePath));
                String md5 = DigestUtils.md5Hex(fileInputStream);
                fileInputStream.close();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(storePathFile.getAbsolutePath()).append(File.separator).append(md5).append(fileSuffix);
                new File(actualFilePath).renameTo(new File(stringBuilder.toString()));
                returnInfo.setMd5(md5);
                returnInfo.setFinished(true);
            } else {
                // TODO 未上传完，是否返回失败
                //返回新的position
                returnInfo.setFinished(false);
                returnInfo.setPosition((int) length);
            }

        }
        catch (FileNotFoundException e)
        {
            LOGGER.error("File not found, target task path:{}", targetFilePath);
            throw new ServiceException("500", "保存文件失败");
            //return false;
        }
        catch (IOException e)
        {
            LOGGER.error("Save task failed, target task path:{}", targetFilePath);
            //return false;
            throw new ServiceException("500", "保存文件失败");
        }

        return returnInfo;
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:upload.properties");
        Properties property = PropertiesLoaderUtils.loadProperties(resource);

        this.fileDir = FileUtils.addPathSeparetor2End((String) property.get("upload.file.dir"));
        this.imageDir = FileUtils.addPathSeparetor2End((String) property.get("upload.image.dir"));
        this.uploadReturnRootUrl = FileUtils.addPathSeparetor2End(this.uploadReturnRootUrl);
        this.uploadRootPath = FileUtils.addPathSeparetor2End((String) property.get("upload.root.path"));
    }
}
