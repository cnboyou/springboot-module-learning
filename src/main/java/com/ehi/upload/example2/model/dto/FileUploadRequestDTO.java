package com.ehi.upload.example2.model.dto;

import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: FileUploadRequestDTO
 *
 * @Author: WangYiHai
 * @Date: 2020/4/7 10:10
 * @Description: TODO
 */
public class FileUploadRequestDTO {
    /**
     *上传文件的文件名称
     */
    private String name;
    /**
     *任务ID
     */
    private String id;
    /**
     *总分片数量
     */
    private Integer chunks;
    /**
     *当前为第几块分片
     */
    private Integer chunkNumber;
    /**
     *按多大的文件粒度进行分片
     */
    private Long chunkSize;
    /**
     *分片对象
     */
    private MultipartFile file;
    /**
     * MD5
     */
    private String md5;
    /**
     *当前分片大小
     */
    private Long currentChunkSize = 0L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getChunks() {
        return chunks;
    }

    public void setChunks(Integer chunks) {
        this.chunks = chunks;
    }

    public Integer getChunkNumber() {
        return chunkNumber;
    }

    public void setChunkNumber(Integer chunkNumber) {
        this.chunkNumber = chunkNumber;
    }

    public Long getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(Long chunkSize) {
        this.chunkSize = chunkSize;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Long getCurrentChunkSize() {
        return currentChunkSize;
    }

    public void setCurrentChunkSize(Long currentChunkSize) {
        this.currentChunkSize = currentChunkSize;
    }
}