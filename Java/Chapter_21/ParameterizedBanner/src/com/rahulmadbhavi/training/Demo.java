
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class Demo extends Applet implements Runnable
{
	String message;
	Thread thread = null;
	int state;
	boolean stopFlag;

	// Set colors and initialize thread
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	// Start thread
	public void start()
	{
		message = getParameter("message");
		if(message == null)
		{
			message = "Message not found.";
		}
		message = " " + message;
		thread = new Thread(this);
		stopFlag = false;
		thread.start();
	}

	// Entry point for the thread that runs the banner
	public void run()
	{
		char ch;

		for(;;)
		{
			try
				{
					repaint();
					Thread.sleep(250);
					ch = message.charAt(0);
					message = message.substring(1, message.length());
					message += ch;
					if(stopFlag)
					{
						break;
					}
				}
				catch(InterruptedException e)
				{
		
				}
		}
	}

	// Pause the banner
	public void stop()
	{
		stopFlag = true;
		thread = null;
	}

	// Display the banner
	public void paint(Graphics graphics)
	{
		graphics.drawString(message, 50, 30);
	}
}