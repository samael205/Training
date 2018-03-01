package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.AWTEvent;
import java.awt.Checkbox;
import java.awt.event.ItemEvent;

public class CheckBoxDemo extends Applet
{
	class MyCheckBox extends Checkbox
	{
		public MyCheckBox(String label)
		{
			super(label);
			enableEvents(AWTEvent.ITEM_EVENT_MASK);
		}
		
		protected void processItemEvent(ItemEvent itemEvent)
		{
			showStatus("Checkbox name/state : " + getLabel() + "/" + getState());
			super.processItemEvent(itemEvent);
		}
	}
	
	MyCheckBox myCheckBox1, myCheckBox2, myCheckBox3;
	
	public void init()
	{
		myCheckBox1 = new MyCheckBox("Item 1");
		add(myCheckBox1);
		
		myCheckBox2 = new MyCheckBox("Item 2");
		add(myCheckBox2);
		
		myCheckBox3 = new MyCheckBox("Item 3");
		add(myCheckBox3);		
	}
}
