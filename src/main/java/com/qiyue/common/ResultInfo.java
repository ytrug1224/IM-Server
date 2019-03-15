package com.qiyue.common;

import com.qiyue.utils.ThreadLocalUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 结果集返回bean
 * @author yindl
 *
 */
public class ResultInfo{
    public static final String KEY_LIST = "list";
    public static final String KEY_PRINT_HTTP_RESULT = "printHttpResult";
	protected boolean success = false;
	/**
	 * 用来存储表示特殊含义的信息
	 */
	protected Integer code = null;
	protected String message = null;
	protected Map<String, Object> data = new HashMap<String, Object>();

	public ResultInfo(){}

	public ResultInfo(boolean success){
		this.success = success;
		//用于RequestInterceptor中输出打印日志
        ThreadLocalUtil.setObject(KEY_PRINT_HTTP_RESULT, this);
	}

	public ResultInfo(String key, Object object){
        this(true);
		this.data.put(key, object);
	}
	
	public ResultInfo(List dataList){
        this(true);
        this.data.put(KEY_LIST, dataList);
    }
	
	public ResultInfo(boolean success, String key, Object object){
        this(success);
		this.data.put(key, object);
	}

	public ResultInfo(Integer code){
        this(true);
		this.code = code;
	}

	public ResultInfo(boolean success, int code){
        this(success);
		this.code = code;
	}
	
	public ResultInfo(boolean success, int code, String message){
        this(success);
        this.code = code;
        this.message = message;
    }
	
	public ResultInfo(boolean success, String message){
        this(success);
		this.message = message;
	}

	public ResultInfo(boolean success, String message, Map<String, Object> data){
        this(success, message);
		this.data = data;
	}

	public void setSuccess(boolean success){
		this.success = success;
	}

	public boolean isSuccess(){
		return success;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public Map<String, Object> getData(){
		return data;
	}

	public void setDataList(List list) {
	    data.put(KEY_LIST, list);
	}

    /**
     * 列表的所有数量，用于分页
     * @param allCount
     */
    public void setAllCount(int allCount) {
        data.put(CommonKey.KEY_ALL_COUNT, allCount);
    }

    /**
     * 列表的所有数量，用于分页
     * @param allCount
     */
    public void setAllCount(long allCount) {
        data.put(CommonKey.KEY_ALL_COUNT, allCount);
    }
	
	public void setData(Map<String, Object> data){
		this.data = data;
	}

	public void setData(String key, Object data){
		this.data.put(key, data);
	}

	public void addData(String key, Object data){
		this.data.put(key, data);
	}

	public Object getData(String key){
		return data.get(key);
	}

	public Integer getCode(){
		return code;
	}

	public void setCode(Integer code){
		this.code = code;
	}
}