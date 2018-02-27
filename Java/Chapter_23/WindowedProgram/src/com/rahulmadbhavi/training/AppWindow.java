
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppWindow extends Frame
{
	String keymsg = "This is a test.";
	String mousemsg = "";
	int mouseX = 30, mouseY = 30;

	public AppWindow()
	{
		addKeyListener(new MyKeyAdapter(this));
		addMouseListener(new MyMouseAdapter(this));
		addWindowListener(new MyWindowAdapter());
	}

	public void paint(Graphics graphics)
	{
		graphics.drawString(keymsg, 10, 40);
		graphics.drawString(mousemsg, mouseX, mouseY);
	}

	// Create the window.
	public static void main(String args[])
	{
		AppWindow appwin = new AppWindow();

		appwin.setSize(new Dimension(300, 200));
		appwin.setTitle("An AWT-Based Application");
		appwin.setVisible(true);
	}
}