package com.example.utils;

public class ParamUtils {

	//检查属性是否有NULL
	static public boolean examineOneNull(Object... params)
	{
		for(Object p : params)
		{
			if(p == null) return true;
		}
		return false;
	}
	
	//检查属性是否都是NULL
	static public boolean examineAllNull(Object... params)
	{
		for(Object p : params)
		{
			if(p != null) return false;
		}
		return true;
	}
}
