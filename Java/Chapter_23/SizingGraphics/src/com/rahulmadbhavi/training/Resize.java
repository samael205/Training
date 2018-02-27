
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Resize extends Applet
{
	final int inc = 25;
	int max = 500;
	int min = 200;
	Dimension dimension;

	public Resize()
	{
		addMouseListener(new MouseAdapter(){

			public void mouseReleased(MouseEvent me)
			{
				int width = (dimension.width + inc) > max ? min : (dimension.width + inc);
				int height = (dimension.height + inc) > max ? min : (dimension.height + inc);
				setSize(new Dimension(width, height));
			}

		});
	}

	public void paint(Graphics graphics)
	{
		dimension = getSize();

		graphics.drawLine(0, 0, dimension.width - 1, dimension.height - 1);
		graphics.drawLine(0, dimension.height - 1, dimension.width - 1, 0);
		graphics.drawRect(0, 0, dimension.width - 1, dimension.height - 1);
	}
}