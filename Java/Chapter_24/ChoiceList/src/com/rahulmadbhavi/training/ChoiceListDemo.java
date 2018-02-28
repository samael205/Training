package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceListDemo extends Applet implements ItemListener
{
	Choice os, browser;
	String message = "";
	
	public void init()
	{
		os		= new Choice();
		browser	= new Choice();
		
		// Add items to OS list
		os.add("Windows XP");
		os.add("Windows Vista");
		os.add("Solaris");
		os.add("Mac OS");
		
		// Add items to browser list
		browser.add("Internet Explorer");
		browser.add("Firefox");
		browser.add("Opera");
		
		// Add choice list to window
		add(os);
		add(browser);
		
		// Register to receive item events
		os.addItemListener(this);
		browser.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent itemEvent)
	{
		repaint();
	}
	
	// Display current selections
	public void paint(Graphics graphics)
	{
		message = "Current OS		: " + os.getSelectedItem();
		graphics.drawString(message, 6, 120);
		
		message = "Current Browser	: " + browser.getSelectedItem();
		graphics.drawString(message, 6, 140);
	}
}
