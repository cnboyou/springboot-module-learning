package com.ehi.file.upload.commonUpload.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
public class FileService {

    private static Logger LOGGER = (Logger) LoggerFactory.getLogger(FileService.class.getName());

    public void uploadFile(MultipartFile file) {
        String filename = file.getOriginalFilename();
        File newFile = new File("D:\\test\\" + filename);
        try {
            file.transferTo(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
