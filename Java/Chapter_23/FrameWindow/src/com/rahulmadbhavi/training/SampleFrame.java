package com.rahulmadbhavi.training;

import java.awt.Frame;
import java.awt.Graphics;

public class SampleFrame extends Frame
{
	SampleFrame(String title)
	{
		super(title);
		
		// Create an object to handle window events
		MyWindowAdapter myWindowAdapter = new MyWindowAdapter(this);
		
		// Register to receive those events
		addWindowListener(myWindowAdapter);
	}
	
	public void paint(Graphics graphics)
	{
		graphics.drawString("This is in frame window", 10, 40);
	}
}
