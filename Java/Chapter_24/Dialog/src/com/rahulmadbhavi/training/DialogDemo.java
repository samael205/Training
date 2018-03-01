
package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Frame;

public class DialogDemo extends Applet
{
	Frame frame;

	public void init()
	{
		frame = new MenuFrame("Menu Demo");

		int width = Integer.parseInt(getParameter("width"));
		int height = Integer.parseInt(getParameter("height"));

		setSize(new Dimension(width, height));

		frame.setSize(width, height);
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
}
