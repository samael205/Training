
package com.rahulmadbhavi.training;

import java.text.*;
import java.util.*;

public class Demo
{
	public static void main(String args[])
	{
		Date date = new Date();
		SimpleDateFormat sdf;

		String formats[][] = 
		{
			{ "a",	"AM or PM." },
			{ "d",	"Day of month (1-31)." },
			{ "dd",	"Day of month (01-31)." },
			{ "h",	"Hour in AM/PM (1-12)." },
			{ "hh",	"Hour in AM/PM (1-12)." },
			{ "k",	"Hour in day (1-24)." },
			{ "kk",	"Hour in day (1-24)." },
			{ "m",	"Minute in hour (0-59)." },
			{ "s",	"Second in minute (0-59)." },
			{ "w",	"Week of year." },
			{ "y",	"Year." },
			{ "z",	"Time zone." },
			{ "D",	"Day of year (1-366)." },
			{ "E",	"Day of week." },
			{ "F",	"Day of week in month." },
			{ "G",	"Era (AD/ BC)." },
			{ "H",	"Hour in day (0-23)." },
			{ "K",	"Hour in AM/ PM (0-11)." },
			{ "M",	"Month." },
			{ "S",	"Millisecond in second." },
			{ "W",	"Week of month." },
			{ "Z",	"RFC822 Time Zone format." },
			{ "hh:mm:ss", "hh:mm:ss"},
			{ "dd MMM yyyy hh:mm:ss zzz", "dd MMM yyyy hh:mm:ss zzz"},
			{ "E MMM dd yyyy", "E MMM dd yyyy"},
			{ "dd/MM/yyyy hh:mm:ss.SSS", "dd/MM/yyyy hh:mm:ss.SSS"}
		};

		for(String format[] : formats)
		{
			sdf = new SimpleDateFormat(format[0]);
			System.out.println(String.format("%-25s (%-25s) : %s", format[0], format[1], sdf.format(date)));
		}
	}
}