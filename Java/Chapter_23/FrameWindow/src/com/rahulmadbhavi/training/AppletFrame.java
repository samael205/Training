package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;

public class AppletFrame extends Applet
{
	Frame frame;
	
	public void init()
	{
		frame = new SampleFrame("A Frame Window");
		
		frame.setSize(250, 250);
		frame.setVisible(true);
	}
	
	public void start()
	{
		frame.setVisible(true);
	}
	
	public void stop()
	{
		frame.setVisible(false);
	}
	
	public void paint(Graphics graphics)
	{
		graphics.drawString("This is in applet window", 10, 20);
	}
}
