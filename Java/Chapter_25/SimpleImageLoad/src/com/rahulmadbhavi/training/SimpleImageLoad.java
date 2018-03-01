package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class SimpleImageLoad extends Applet
{
	Image image;
	
	public void init()
	{
		image = getImage(getCodeBase(), getParameter("img"));
	}
	
	public void paint(Graphics graphics)
	{
		graphics.drawImage(image, 0, 0, this);
	}
}
