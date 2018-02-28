package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckDemo extends Applet implements ItemListener
{
	String message = "";
	Checkbox winXP, winVista, solaris, mac;
	
	public void init()
	{
		winXP 		= new Checkbox("Windows XP", null, true);
		winVista	= new Checkbox("Windows Vista");
		solaris		= new Checkbox("Solaris");
		mac			= new Checkbox("Mac OS");
		
		add(winXP);
		add(winVista);
		add(solaris);
		add(mac);
		
		winXP.addItemListener(this);
		winVista.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);
	}
		
	@Override
	public void itemStateChanged(ItemEvent itemEvent)
	{
		repaint();
	}

	// Display current state of the check boxes.
	public void paint(Graphics graphics)
	{
		message = "Current state : ";
		graphics.drawString(message, 6, 80);
		
		message = "Windows XP 		: " + winXP.getState();
		graphics.drawString(message, 6, 100);

		message = "Windows Vista 	: " + winVista.getState();
		graphics.drawString(message, 6, 120);
		
		message = "Solaris			: " + solaris.getState();
		graphics.drawString(message, 6, 140);
		
		message = "Mac OS			: " + mac.getState();
		graphics.drawString(message, 6, 160);
	}
}
