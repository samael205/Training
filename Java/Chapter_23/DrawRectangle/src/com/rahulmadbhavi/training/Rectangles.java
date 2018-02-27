
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class Rectangles extends Applet
{
	public void paint(Graphics graphics)
	{
		graphics.drawRect(10, 10, 60, 50);
		graphics.fillRect(100, 10, 60, 50);
		graphics.drawRoundRect(190, 10, 60, 50, 15, 15);
		graphics.fillRoundRect(70, 90, 140, 100, 30, 40);
	}
}