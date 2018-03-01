package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.AWTEvent;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceDemo extends Applet implements ItemListener
{
	class MyChoice extends Choice
	{
		public MyChoice()
		{
			enableEvents(AWTEvent.ITEM_EVENT_MASK);
		}
		
		protected void processItemEvent(ItemEvent itemEvent)
		{
			showStatus("Choice selection : " + getSelectedItem());
			super.processItemEvent(itemEvent);
		}
	}
	
	MyChoice myChoice;
	
	public void init()
	{
		myChoice = new MyChoice();
		
		myChoice.add("Red");
		myChoice.add("Green");
		myChoice.add("Blue");
		
		add(myChoice);
		
		// Register to receive item events
		myChoice.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	
	public void paint(Graphics graphics)
	{
		String message = myChoice.getSelectedItem();
		
		if(message.equals("Red"))
		{
			setBackground(Color.red);
		}
		else if(message.equals("Green"))
		{
			setBackground(Color.green);
		}
		else
		{
			setBackground(Color.blue);
		}
	}
}
