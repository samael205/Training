
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class SimpleApplet extends Applet
{
	String message;

	// Set the foreground and background colors.
	public void init()
	{
		setBackground(Color.cyan);
		setBackground(Color.red);
		message = "Inside init() --";
	}

	// Initialize the string to be displayed.
	public void start()
	{
		message += "Inside start() --";
	}

	// Display message in the applet window
	public void paint(Graphics graphics)
	{
		message += "Inside paint().";
		graphics.drawString(message, 10, 30);
	}
}