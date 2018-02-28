package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ScrollBarDemo extends Applet implements AdjustmentListener, MouseMotionListener
{
	String message = "";
	Scrollbar verticalBar, horizontalBar;
	
	public void init()
	{
		int width 	= Integer.parseInt(getParameter("width"));
		int height 	= Integer.parseInt(getParameter("height"));
		
		verticalBar 	= new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, height);
		horizontalBar	= new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, width);
		
		add(verticalBar);
		add(horizontalBar);
		
		// Register to receive adjustment events
		verticalBar.addAdjustmentListener(this);
		horizontalBar.addAdjustmentListener(this);
		
		addMouseMotionListener(this);
	}
	
	@Override
	public void mouseDragged(MouseEvent mouseEvent)
	{
		int x = mouseEvent.getX();
		int y = mouseEvent.getY();
		
		verticalBar.setValue(y);
		horizontalBar.setValue(x);
		
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent mouseEvent)
	{

	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent adjustmentEvent)
	{
		repaint();
	}
	
	public void paint(Graphics graphics)
	{
		message = "Vertical 	: " + verticalBar.getValue();
		graphics.drawString(message, 6, 160);
		
		message = "Horizontal	: " + horizontalBar.getValue();
		graphics.drawString(message, 6, 180);
		
		// Show current mouse drag position
		graphics.drawString("*", horizontalBar.getValue(), verticalBar.getValue());
	}
}
