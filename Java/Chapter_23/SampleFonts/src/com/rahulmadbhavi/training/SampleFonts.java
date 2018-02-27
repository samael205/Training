
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SampleFonts extends Applet
{
	int next = 0;
	Font font;
	String message;

	public void init()
	{
		font = new Font("Dialog", Font.PLAIN, 12);
		message = "Dialog";
		setFont(font);
		addMouseListener(new MyMouseAdapter(this));
	}

	public void paint(Graphics graphics)
	{
		graphics.drawString(message, 4, 20);
	}
}