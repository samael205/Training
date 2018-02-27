
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;

public class Polygon extends Applet
{
	public void paint(Graphics graphics)
	{
		int xPoints[] = {30, 200, 30, 200, 30};
		int yPoints[] = {30, 30, 200, 200, 30};

		graphics.drawPolygon(xPoints, yPoints, xPoints.length);
	}
}