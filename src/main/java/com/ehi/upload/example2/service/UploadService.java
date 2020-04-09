package com.ehi.upload.example2.service;

import com.ehi.upload.example2.model.dto.FileUploadDTO;
import com.ehi.upload.example2.model.dto.FileUploadRequestDTO;

/**
 * ClassName: UploadService
 *
 * @Author: WangYiHai
 * @Date: 2020/4/7 16:27
 * @Description: TODO
 */
public interface UploadService {

    /**
     * 普通上传
     * @param fileUploadRequestDTO
     * @return
     */
    FileUploadDTO upload(FileUploadRequestDTO fileUploadRequestDTO);

    /**
     * 断点上传
     * @param fileUploadRequestDTO
     * @return
     */
    FileUploadDTO breakpointUpload(FileUploadRequestDTO fileUploadRequestDTO);
}