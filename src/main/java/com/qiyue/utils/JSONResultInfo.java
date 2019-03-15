package com.qiyue.utils;

public class JSONResultInfo {

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;
    // 不使用
    private String ok;

    public static JSONResultInfo build(Integer status, String msg, Object data) {
        return new JSONResultInfo(status, msg, data);
    }

    public static JSONResultInfo ok(Object data) {
        return new JSONResultInfo(data);
    }

    public static JSONResultInfo ok() {
        return new JSONResultInfo(null);
    }
    
    public static JSONResultInfo errorMsg(String msg) {
        return new JSONResultInfo(500, msg, null);
    }
    
    public static JSONResultInfo errorMap(Object data) {
        return new JSONResultInfo(501, "error", data);
    }
    
    public static JSONResultInfo errorTokenMsg(String msg) {
        return new JSONResultInfo(502, msg, null);
    }
    
    public static JSONResultInfo errorException(String msg) {
        return new JSONResultInfo(555, msg, null);
    }

    public JSONResultInfo() {

    }

    public JSONResultInfo(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public JSONResultInfo(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

}
