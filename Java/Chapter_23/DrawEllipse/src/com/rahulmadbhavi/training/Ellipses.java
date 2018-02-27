
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class Ellipses extends Applet
{
	public void paint(Graphics graphics)
	{
		graphics.drawOval(10, 10, 50, 50);
		graphics.fillOval(100, 10, 75, 50);
		graphics.drawOval(190, 10, 90, 30);
		graphics.fillOval(70, 90, 140, 100);
	}
}