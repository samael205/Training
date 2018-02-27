
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class Arcs extends Applet
{
	public void paint(Graphics graphics)
	{
		graphics.drawArc(10, 40, 70, 70, 0, 75);
		graphics.fillArc(100, 40, 70, 70, 0, 75);
		graphics.drawArc(10, 100, 70, 80, 0, 175);
		graphics.fillArc(100, 100, 70, 90, 0, 270);
		graphics.drawArc(200, 80, 80, 80, 0, 180);
	}
}