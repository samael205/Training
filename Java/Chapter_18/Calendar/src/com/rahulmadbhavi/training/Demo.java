
package com.rahulmadbhavi.training;

import java.util.*;

class Demo
{
	public static void main(String args[])
	{
		System.out.println();

		System.out.println("Calendar.JANUARY         : " + Calendar.JANUARY);
		System.out.println("Calendar.FEBRUARY        : " + Calendar.FEBRUARY);
		System.out.println("Calendar.MARCH           : " + Calendar.MARCH);
		System.out.println("Calendar.APRIL           : " + Calendar.APRIL);
		System.out.println("Calendar.MAY             : " + Calendar.MAY);
		System.out.println("Calendar.JUNE            : " + Calendar.JUNE);
		System.out.println("Calendar.JULY            : " + Calendar.JULY);
		System.out.println("Calendar.AUGUST          : " + Calendar.AUGUST);
		System.out.println("Calendar.SEPTEMBER       : " + Calendar.SEPTEMBER);
		System.out.println("Calendar.OCTOBER         : " + Calendar.OCTOBER);
		System.out.println("Calendar.NOVEMBER        : " + Calendar.NOVEMBER);
		System.out.println("Calendar.DECEMBER        : " + Calendar.DECEMBER);
		System.out.println();

		System.out.println("Calendar.AM              : " + Calendar.AM);
		System.out.println("Calendar.PM              : " + Calendar.PM);
		System.out.println();

		System.out.println("Calendar.SUNDAY          : " + Calendar.SUNDAY);
		System.out.println("Calendar.MONDAY          : " + Calendar.MONDAY);
		System.out.println("Calendar.TUESDAY         : " + Calendar.TUESDAY);
		System.out.println("Calendar.WEDNESDAY       : " + Calendar.WEDNESDAY);
		System.out.println("Calendar.FRIDAY          : " + Calendar.THURSDAY);
		System.out.println("Calendar.SATURDAY        : " + Calendar.FRIDAY);
		System.out.println("Calendar.SUNDAY          : " + Calendar.SATURDAY);
		System.out.println();

		Calendar calendar = Calendar.getInstance();

		System.out.println("calendar = " + calendar);
		System.out.println();

		System.out.println("calendar.get(Calendar.DATE)  : " + calendar.get(Calendar.DATE));
		System.out.println("calendar.get(Calendar.MONTH) : " + calendar.get(Calendar.MONTH));
		System.out.println("calendar.get(Calendar.YEAR)  : " + calendar.get(Calendar.YEAR));
		System.out.println();

		System.out.println("calendar.get(Calendar.WEEK_OF_MONTH)  : " + calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("calendar.get(Calendar.WEEK_OF_YEAR)   : " + calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println();

		System.out.println("calendar.get(Calendar.DAY_OF_WEEK)           : " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)  : " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println();

		System.out.println("calendar.get(Calendar.DAY_OF_MONTH)  : " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("calendar.get(Calendar.DAY_OF_YEAR)   : " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println();

		System.out.println("calendar.get(Calendar.HOUR)        : " + calendar.get(Calendar.HOUR));
		System.out.println("calendar.get(Calendar.HOUR_OF_DAY) : " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("calendar.get(Calendar.MINUTE)      : " + calendar.get(Calendar.MINUTE));
		System.out.println("calendar.get(Calendar.SECOND)      : " + calendar.get(Calendar.SECOND));
		System.out.println("calendar.get(Calendar.MILLISECOND) : " + calendar.get(Calendar.MILLISECOND));
		System.out.println("calendar.get(Calendar.ZONE_OFFSET) : " + calendar.get(Calendar.ZONE_OFFSET));
		System.out.println();
	}
}