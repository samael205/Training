package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxGroupDemo extends Applet implements ItemListener
{
	String message = "";
	Checkbox winXP, winVista, solaris, mac;
	CheckboxGroup checkboxGroup;
	
	public void init()
	{
		checkboxGroup = new CheckboxGroup();
		
		winXP		= new Checkbox("Windows XP", checkboxGroup, true);
		winVista	= new Checkbox("Windows Vista", checkboxGroup, false);
		solaris		= new Checkbox("Solaris", checkboxGroup, false);
		mac			= new Checkbox("Mac OS", checkboxGroup, false);
		
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
	
	// Display current state of the check boxes
	public void paint(Graphics graphics)
	{
		message = "Current selection : ";
		message += checkboxGroup.getSelectedCheckbox().getLabel();
		graphics.drawString(message, 6, 140);
	}
}
