
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class PaintMode extends Applet
{
	int chsX = 100, chsY =100;

	public PaintMode()
	{
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent me)
			{
				int x = me.getX();
				int y = me.getY();

				chsX = x - 10;
				chsY = y - 10;

				repaint();
			}

		});
	}

	public void paint(Graphics graphics)
	{
		graphics.drawLine(0, 0, 100, 100);
		graphics.drawLine(0, 100, 100, 0);

		graphics.setColor(Color.blue);
		graphics.drawLine(40, 25, 250, 180);
		graphics.drawLine(75, 90, 400, 400);

		graphics.setColor(Color.green);
		graphics.drawRect(10, 10, 60, 50);
		graphics.fillRect(100, 10, 60, 50);

		graphics.setColor(Color.red);
		graphics.drawRoundRect(190, 10, 60, 50, 15, 15);
		graphics.fillRoundRect(70, 90, 140, 100, 30, 40);

		graphics.setColor(Color.cyan);
		graphics.drawLine(20, 150, 400, 40);
		graphics.drawLine(5, 290, 80, 19);

		// XOR cross hairs
		graphics.setXORMode(Color.black);
		graphics.drawLine(chsX - 10, chsY, chsX + 10, chsY);
		graphics.drawLine(chsX, chsY - 10, chsX, chsY + 10);
		graphics.setPaintMode();
	}
}