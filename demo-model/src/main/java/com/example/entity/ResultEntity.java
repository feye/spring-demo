package com.example.entity;

import java.util.HashMap;

public class ResultEntity extends HashMap<String, Object>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4744398623842403080L;

	/**
	 * 设置结果代码
	 * 
	 * @param code
	 */
	public void setCode(int code) {
		this.put("code", code);
	}

	public int getCode() {
		return (Integer) this.get("code");
	}
	/**
	 * 设置需要显示的消息
	 * 
	 * @param msg
	 */
	public void setMsg(String msg) {
		this.put("message", msg);
	}

	public String getMsg() {
		return (String) this.get("message");
	}
	
	public void setCodeAndMsg(ErrorCode error) {
		setCode(error.getCode());
		setMsg(error.getMessage());
	}
}
