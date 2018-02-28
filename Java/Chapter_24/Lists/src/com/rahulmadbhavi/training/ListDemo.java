package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class ListDemo extends Applet implements ActionListener
{
	List os, browser;
	String message = "";
	
	public void init()
	{
		os		= new List(4, true);
		browser	= new List(4, false);
		
		// Add items to OS list.
		os.add("Windows XP");
		os.add("Windows Vista");
		os.add("Solaris");
		os.add("Mac OS");
		
		// Add items to browser list
		browser.add("Internet Explorer");
		browser.add("Firefox");
		browser.add("Opera");
		
		browser.select(1);
		
		// Add lists to Window
		add(os);
		add(browser);
		
		// Register to receive action events
		os.addActionListener(this);
		browser.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		repaint();
	}
		
	// Display current selections.
	public void paint(Graphics graphics)
	{
		int indices[];
		
		message = "Current OS(s)	: ";
		indices = os.getSelectedIndexes();
		if(indices != null)
		{
			for(int index : indices)
			{
				message += os.getItem(index) + " ";
			}
		}
		graphics.drawString(message, 6, 120);
		
		message = "Current Browser	: " + browser.getSelectedItem();
		graphics.drawString(message, 6, 140);
	}
}
