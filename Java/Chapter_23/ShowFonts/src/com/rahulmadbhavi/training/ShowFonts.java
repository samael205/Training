
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class ShowFonts extends Applet
{
	public void paint(Graphics graphics)
	{
		String message = "";
		String fontList[];

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontList = ge.getAvailableFontFamilyNames();

		for(String font : fontList)
		{
			message += font + " ";
		}

		graphics.drawString(message, 4, 16);
	}	
}