
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class Lines extends Applet
{
	public void paint(Graphics graphics)
	{
		graphics.drawLine(0, 0, 100, 100);
		graphics.drawLine(0, 100, 100, 0);
		graphics.drawLine(40, 25, 250, 180);
		graphics.drawLine(75, 90, 400, 400);
		graphics.drawLine(20, 150, 400, 40);
		graphics.drawLine(5, 290, 80, 19);
	}
}