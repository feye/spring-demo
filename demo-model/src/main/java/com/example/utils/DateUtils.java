package com.example.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	/**
	 * 计算当前日期所在周的周一
	 * 
	 * @param date
	 *            当前日期
	 * @return 周一的日期
	 */
	public static Date calcWeekMonday(Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()); // Monday
		return c.getTime();
	}

	/**
	 * 计算当前日期所在周的周日
	 * 
	 * @param date
	 *            当前日期
	 * @return 周日的日期
	 */
	public static  Date calcWeekSunday(Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() + 6); // Sunday
		return c.getTime();
	}

	/**
	 * 计算当前日期所在月的第一天
	 * 
	 * @param date
	 *            当前日期
	 * @return 月第一天
	 */
	public static  Date calcMonthFirst(Date date) {
		Calendar c = GregorianCalendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		return c.getTime();
	}

	/**
	 * 计算当前日期所在月的最后一天
	 * 
	 * @param date
	 *            当前日期
	 * @return 最后一天
	 */
	public static  Date calcMonthLast(Date date) {
		Calendar c = GregorianCalendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return c.getTime();
	}

}
