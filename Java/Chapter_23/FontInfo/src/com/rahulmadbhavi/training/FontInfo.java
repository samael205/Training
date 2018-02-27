
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class FontInfo extends Applet
{
	public void paint(Graphics graphics)
	{
		Font font = graphics.getFont();

		String fontName = font.getName();
		String fontFamily = font.getFamily();
		int fontSize = font.getSize();
		int fontStyle = font.getStyle();

		String message = "Font: " + fontName;
		message += ", Family: " + fontFamily;
		message += ", Size: " + fontSize;
		message += ", Style: ";

		if((fontStyle & Font.BOLD) == Font.BOLD)
		{
			message += "Bold ";
		}
		if((fontStyle & Font.ITALIC) == Font.ITALIC)
		{
			message += "Italic ";
		}
		if((fontStyle & Font.PLAIN) == Font.PLAIN)
		{
			message += "Plain ";
		}

		graphics.drawString(message, 4, 16);
	}
}
