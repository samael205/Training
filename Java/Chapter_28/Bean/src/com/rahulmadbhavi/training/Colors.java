
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

public class Colors extends Canvas implements Serializable
{
	transient private Color color;		// Not persistent.
	private boolean rectangular;		// Is persistent.

	public Colors()
	{
		addMouseListener(new MouseAdapter(){

			public void mousePressed(MouseEvent me)
			{
				if(me.getButton() == MouseEvent.BUTTON1)
				{
            		setRectangular(true);
          		}
				if(me.getButton() == MouseEvent.BUTTON3)
				{
            		setRectangular(false);
          		}          		
				
				change();
			}

		});

		rectangular = false;
		setSize(200, 100);
		change();
	}

	public boolean getRectangular()
	{
		return rectangular;
	}

	public void setRectangular(boolean rectangular)
	{
		this.rectangular = rectangular;
	}

	public void change()
	{
		color = randomColor();
		repaint();
	}

	public Color randomColor()
	{
		int r = (int)(256 * Math.random());
		int g = (int)(256 * Math.random());
		int b = (int)(256 * Math.random());

		return new Color(r, g, b);
	}

	public void paint(Graphics graphics)
	{
		Dimension dimension = getSize();

		int height = dimension.height;
		int width = dimension.width;

		graphics.setColor(color);

		if(rectangular)
		{
			graphics.fillRect(0, 0, width - 1, height - 1);
		}
		else
		{
			graphics.fillOval(0, 0, width - 1, height - 1);
		}
	}
}