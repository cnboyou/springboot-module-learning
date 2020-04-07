package com.ehi.commom.model;

import java.io.Serializable;

/**
 * @author Mr_Wang
 * @PackageName:com.ehi.model
 * @ClassName:HttpClientResult
 * @Desciption:
 * @date 2020/4/7 22:31
 */
public class HttpClientResult implements Serializable {
    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;

    public HttpClientResult(int code) {
        this.code = code;
    }

    public HttpClientResult(int code, String content) {
        this.code = code;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
