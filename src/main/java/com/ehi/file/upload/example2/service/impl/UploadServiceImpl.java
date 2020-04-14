package com.ehi.file.upload.example2.service.impl;

import com.ehi.file.upload.example2.model.dto.FileUploadDTO;
import com.ehi.file.upload.example2.model.dto.FileUploadRequestDTO;
import com.ehi.file.upload.example2.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ClassName: UploadServiceImpl
 *
 * @Author: WangYiHai
 * @Date: 2020/4/7 16:28
 * @Description: TODO
 */
@Service
public class UploadServiceImpl implements UploadService {
    private static final Logger logger = LoggerFactory.getLogger(UploadServiceImpl.class);

    /**
     * 普通上传
     *
     * @param fileUploadRequestDTO
     * @return
     */
    @Override
    public FileUploadDTO upload(FileUploadRequestDTO fileUploadRequestDTO) {
        return null;
    }

    /**
     * 断点上传
     *
     * @param param
     * @return
     */
    @Override
    public FileUploadDTO breakpointUpload(FileUploadRequestDTO param) {
        RandomAccessFile accessTmpFile = null;
        try {
            //String uploadPath = MyUploadUtil.getTdAbsolutePath();
            String uploadPath ="";
            String fileName = param.getFile().getOriginalFilename();
            //创建临时文件
            String tempFileName = fileName + "_tmp";
            File tmpDir = new File(uploadPath);
            if (!tmpDir.exists()) {
                tmpDir.mkdirs();
            }
            File tmpFile = new File(uploadPath, tempFileName);

            accessTmpFile = new RandomAccessFile(tmpFile, "rw");
            //分片大小，与前端一致
            /*long chunkSize = Objects.isNull(param.getChunkSize()) ? 5 * 1024 * 1024
                    : param.getChunkSize();*/
            long chunkSize = param.getChunkSize();
            long offset = chunkSize * param.getChunkNumber();
            //定位到该分片的偏移量
            accessTmpFile.seek(offset);
            //写入该分片数据
            accessTmpFile.write(param.getFile().getBytes());
            accessTmpFile.close();
            boolean isOk = this.checkAndSetUploadProgress(param, uploadPath);
            //return isOk;
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {

        }

        return null;
        //return false;
    }

    /**
     * 文件重命名
     * @param toBeRenamed   被重命名文件
     * @param toFileNewName 重命名名称
     * @return
     */
    public FileUploadDTO renameFile(File toBeRenamed, String toFileNewName) {
        //检查要重命名的文件是否存在，是否是文件
        FileUploadDTO fileUploadDTO = new FileUploadDTO();
        if (!toBeRenamed.exists() || toBeRenamed.isDirectory()) {
            logger.info("File does not exist: {}", toBeRenamed.getName());
            fileUploadDTO.setFinished(false);
            return fileUploadDTO;
        }

        String ext = toFileNewName.substring(toFileNewName.lastIndexOf(".")+1, toFileNewName.length());
        String parentDir = toBeRenamed.getParent();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(parentDir).append(File.separator).append(toFileNewName);
        File newFile = new File(stringBuilder.toString());
        boolean renameStatus = toBeRenamed.renameTo(newFile);

        fileUploadDTO.setFinished(renameStatus);
        fileUploadDTO.setAbsolutePath(stringBuilder.toString());
        fileUploadDTO.setCurrentChunkSize(newFile.length());
        fileUploadDTO.setFileExt(ext);
        fileUploadDTO.setFileId(toFileNewName);

        return fileUploadDTO;
    }

    /**
     * 检查并修改文件上传进度
     * @param param
     * @param uploadDirPath
     * @return
     */
    public boolean checkAndSetUploadProgress(FileUploadRequestDTO param, String uploadDirPath) {
        String fileName = param.getFile().getOriginalFilename();
        File confFile = new File(uploadDirPath, fileName + ".conf");
        byte isComplete = 0;
        RandomAccessFile accessConfFile = null;
        try {
            accessConfFile = new RandomAccessFile(confFile, "rw");
            //把该分段标记为 true 表示完成
            System.out.println("set part " + param.getChunkNumber() + " complete");
            //创建conf文件文件长度为总分片数，每上传一个分块即向conf文件中写入一个127，那么没上传的位置就是默认0,已上传的就是Byte.MAX_VALUE 127
            accessConfFile.setLength(param.getChunks());
            accessConfFile.seek(param.getChunkNumber());
            accessConfFile.write(Byte.MAX_VALUE);
            accessConfFile.close();

            //completeList 检查是否全部完成,如果数组里是否全部都是127(全部分片都成功上传)
            //byte[] completeList = FileUtils.readFileToByteArray(confFile);
            byte[] completeList = null;
            isComplete = Byte.MAX_VALUE;
            for (int i = 0; i < completeList.length && isComplete == Byte.MAX_VALUE; i++) {
                //与运算, 如果有部分没有完成则 isComplete 不是 Byte.MAX_VALUE
                isComplete = (byte) (isComplete & completeList[i]);
                System.out.println("check part " + i + " complete?:" + completeList[i]);
            }

        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        } finally {
        }
        if (isComplete == Byte.MAX_VALUE) {
            confFile.delete();
            return true;
        }
        return false;
    }
}