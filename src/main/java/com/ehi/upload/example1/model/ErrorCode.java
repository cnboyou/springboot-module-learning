package com.ehi.upload.example1.model;


public enum ErrorCode 
{
	INVALID_REQ_PARAMS("000400", "Invalid parameter."),
	PERMISSION_DENY("000403","Access denied."),
	NO_FOUND("000404","Not found"),
	SERVER_EXCEPTION("000500", "The server is busy. Please try again later."),
	SYSTEM_ERROR("000501", "System error."),
	
	USER_NOT_EXIST("001001", "用户不存在"),
	USERNAME_OR_PRASSWORD_NOT_CORRECT("001002", "用户名或密码不正确"),
	REFUSE_TO_LOGIN_TWICE("001003", "不允许重复登录"),
	LOGIN_IN_SOMEWHERE_ELSE("001004", "您已在别处登录"),

	MEMBER_NOT_EXIST("100001", "该成员不存在"),

	UPLOAD_FILE_FAILED("200001", "上传文件失败"),
	
	PURCHASE_RECORD_REACH_THE_MAX_ROW("300001", "采购记录已超过最大允许行数"),

	PERMISSION_FALIED("300002", "权限不符合"),


	;
	
    private String code;
    
    private String msg;
    
    /** 产品错误码前缀 */
    private ErrorCode(String errCode, String errMsg)
    {
        this.code = errCode;
        this.msg = errMsg;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
    
}
