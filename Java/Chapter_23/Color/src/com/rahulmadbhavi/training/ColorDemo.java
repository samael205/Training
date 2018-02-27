
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class ColorDemo extends Applet
{
	public void paint(Graphics graphics)
	{
		Color colorRed = new Color(255, 100, 100);
		Color colorGreen = new Color(100, 255, 100);
		Color colorBlue = new Color(100, 100, 255);

		graphics.setColor(colorRed);
		graphics.drawLine(0, 0, 100, 100);
		graphics.drawLine(0, 100, 100, 0);

		graphics.setColor(colorGreen);
		graphics.drawLine(40, 25, 250, 180);
		graphics.drawLine(75, 90, 400, 400);

		graphics.setColor(colorBlue);
		graphics.drawLine(20, 150, 400, 40);
		graphics.drawLine(5, 290, 80, 19);

		graphics.setColor(Color.red);
		graphics.drawOval(10, 10, 50, 50);
		graphics.fillOval(70, 90, 140, 100);

		graphics.setColor(Color.blue);
		graphics.drawOval(190, 10, 90, 30);
		graphics.drawRect(10, 10, 60, 50);

		graphics.setColor(Color.cyan);
		graphics.fillRect(100, 10, 60, 50);
		graphics.drawRoundRect(190, 10, 60, 50, 15, 15);
	}
}