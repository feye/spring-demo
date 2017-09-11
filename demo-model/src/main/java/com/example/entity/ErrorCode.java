package com.example.entity;

public enum ErrorCode
{
	// 此处添加error code定义
	SUCCESS(0, "Suceess"),
	/*----------------database 相关错误码---------------*/
	ERROR_DATABASE_QUERY(1, "database query failed"),
	ERROR_DATABASE_INSERT(2, "database insert failed"),
	ERROR_DATABASE_UPDATE(3, "database update failed"),
	/*----------------request param 相关错误码---------------*/
	ERROR_PARAM_INCOMPLETE(101, "request param incomplete"),
	ERROR_PARAM_INVALID(102, "request param invalid"),
	;
	/*--------------------------------------------------------*/
	private Integer code;
	private String message;

	private ErrorCode(Integer code, String message)
	{
		this.code = code;
		this.message = message;
	}

	public Integer getCode()
	{
		return code;
	}

	public void setCode(Integer code)
	{
		this.code = code;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

}
