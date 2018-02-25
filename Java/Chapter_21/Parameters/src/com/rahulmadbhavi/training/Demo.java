
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class Demo extends Applet
{
	String fontName;
	int fontSize;
	float leading;
	boolean active;

	// Initialize the string to be displayed
	public void start()
	{
		String param;

		fontName = getParameter("fontName");
		if(fontName == null)
		{
			fontName = "Not Found";
		}

		param = getParameter("fontSize");
		try
		{
			if(param != null)
			{
				fontSize = Integer.parseInt(param);
			}
			else
			{
				fontSize = 0;
			}
		}
		catch(NumberFormatException e)
		{
			fontSize = -1;
		}

		param = getParameter("leading");
		try
		{
			if(param != null)
			{
				leading = Float.valueOf(param).floatValue();
			}
			else
			{
				leading = 0;				
			}
		}
		catch(NumberFormatException e)
		{
			leading = -1;
		}

		param = getParameter("accountEnabled");
		if(param != null)
		{
			active = Boolean.valueOf(param).booleanValue();
		}
	}

	// Display parameters
	public void paint(Graphics graphics)
	{
		graphics.drawString("Font name      : " + fontName, 0, 10);
		graphics.drawString("Font size      : " + fontSize, 0, 26);
		graphics.drawString("Leading        : " + leading, 0, 42);
		graphics.drawString("Account active : " + active, 0, 58);
	}
}