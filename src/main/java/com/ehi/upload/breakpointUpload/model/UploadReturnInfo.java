/**
 * projectName: pdioms-resource
 * fileName: UploadReturnInfo.java
 * packageName: com.thirtydays.pdioms.resource.base.task.model
 * date: 2019-07-04 17:06
 * copyright(c) 2015-2019 三十天科技
 */
package com.ehi.upload.breakpointUpload.model;

public class UploadReturnInfo {

    private String url;
    private String absolutePath;
    private String md5;
    private Boolean finished;
    private Integer position;

    public UploadReturnInfo(String url, String absolutePath, String md5){
        this.absolutePath = absolutePath;
        this.url = url;
        this.md5 = md5;
    }

    public UploadReturnInfo(){

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
