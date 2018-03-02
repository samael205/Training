package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DoubleBuffer extends Applet
{
	int gap = 3;
	int my, mx;
	boolean flicker = true;
	Image buffer = null;
	int width, height;
	
	public void init()
	{
		Dimension dimension = getSize();
		
		width = (int) dimension.getWidth();
		height = (int) dimension.getHeight();
		
		buffer = createImage(width, height);
		
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent mouseEvent)
			{
				mx = mouseEvent.getX();
				my = mouseEvent.getY();
				
				flicker = true;
				repaint();
			}
		});
	}
	
	public void paint(Graphics graphics)
	{
		Graphics screengc = null;
		
		if(!flicker)
		{
			screengc = graphics;
			graphics = buffer.getGraphics();
		}
		
		graphics.setColor(Color.blue);
		graphics.fillRect(0, 0, width, height);
		
		graphics.setColor(Color.red);
		for(int i=0; i<width; i+=gap)
		{
			graphics.drawLine(i, 0, width - i, height);
		}
		
		for(int i=0; i<height; i+=gap)
		{
			graphics.drawLine(0, i, width, height - i);
		}
		
		graphics.setColor(Color.black);
		graphics.drawString("Press mouse button to double buffer", width/2, height/2);
		
		graphics.setColor(Color.yellow);
		graphics.fillOval(mx - gap, my - gap, gap*2+1, gap*2+1);
		
		if(!flicker)
		{
			screengc.drawImage(buffer, 0, 0, null);
		}
	}
	
	public void update(Graphics graphics)
	{
		paint(graphics);
	}
}
