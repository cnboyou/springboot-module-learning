package com.ehi.file.upload.example2.model.dto;

import java.util.List;
import java.util.Map;

/**
 * ClassName: FileUploadDTO
 *
 * @Author: WangYiHai
 * @Date: 2020/4/7 10:10
 * @Description: TODO
 */
public class FileUploadDTO {

    private String absolutePath;

    private Integer mtime;

    private Boolean finished;

    private Integer code;

    private Map<Integer,String> chunkMd5Info;

    private List<Integer> missChunks;

    private Long currentChunkSize;

    private String fileExt;

    private String fileId;

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public Integer getMtime() {
        return mtime;
    }

    public void setMtime(Integer mtime) {
        this.mtime = mtime;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<Integer, String> getChunkMd5Info() {
        return chunkMd5Info;
    }

    public void setChunkMd5Info(Map<Integer, String> chunkMd5Info) {
        this.chunkMd5Info = chunkMd5Info;
    }

    public List<Integer> getMissChunks() {
        return missChunks;
    }

    public void setMissChunks(List<Integer> missChunks) {
        this.missChunks = missChunks;
    }

    public Long getCurrentChunkSize() {
        return currentChunkSize;
    }

    public void setCurrentChunkSize(Long currentChunkSize) {
        this.currentChunkSize = currentChunkSize;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}