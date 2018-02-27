
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class MultiLine extends Applet
{
	int curX = 0, curY = 0;

	public void init()
	{
		Font font = new Font("SansSerif", Font.PLAIN, 12);
		setFont(font);
	}

	public void paint(Graphics graphics)
	{
		FontMetrics fm = graphics.getFontMetrics();

		nextLine("This is on line one.", graphics);
		nextLine("This is on line two.", graphics);
		sameLine(" This is on same line.", graphics);
		sameLine(" This, too.", graphics);
		nextLine("This is on line three.", graphics);
	}

	// Advance to next line
	void nextLine(String string, Graphics graphics)
	{
		FontMetrics fm = graphics.getFontMetrics();

		curX = 0;
		curY += fm.getHeight();

		graphics.drawString(string, curX, curY);

		curX = fm.stringWidth(string);
	}

	// Display on same line
	void sameLine(String string, Graphics graphics)
	{
		FontMetrics fm = graphics.getFontMetrics();

		graphics.drawString(string, curX, curY);

		curX += fm.stringWidth(string);
	}
}