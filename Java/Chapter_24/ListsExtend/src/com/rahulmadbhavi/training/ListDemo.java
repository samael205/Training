
package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListDemo extends Applet implements ItemListener
{
	class MyList extends List
	{
		public MyList()
		{
			enableEvents(AWTEvent.ITEM_EVENT_MASK | AWTEvent.ACTION_EVENT_MASK);
		}

		protected void processActionEvent(ActionEvent actionEvent)
		{
			showStatus("Action event : " + actionEvent.getActionCommand());
		}

		protected void processItemEvent(ItemEvent itemEvent)
		{
			showStatus("Item event : " + getSelectedItem());
			super.processItemEvent(itemEvent);
		}
	}

	MyList myList;

	public void init()
	{
		myList = new MyList();

		myList.add("Red");
		myList.add("Green");
		myList.add("Blue");

		myList.select(0);
		
		add(myList);
		
		myList.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	
	public void paint(Graphics graphics)
	{
		String message = myList.getSelectedItem();
		
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
