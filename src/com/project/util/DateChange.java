package com.project.util;

import java.sql.Date;

/**
 * 日期转换工具类
 * @author SYSTEM
 *
 */
public class DateChange {

	public static Date getDate(String str){
		if(str!=null&&str.matches("\\d{4}-\\d{2}-\\d{2}")){
			return Date.valueOf(str);
		}
		
		return null;
	}
}
