package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.AWTEvent;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;

public class CheckboxGroupDemo extends Applet
{
	class MyCheckbox extends Checkbox
	{
		public MyCheckbox(String label, CheckboxGroup checkboxGroup, boolean flag)
		{
			super(label, checkboxGroup, flag);
			enableEvents(AWTEvent.ITEM_EVENT_MASK);
		}
		
		protected void processItemEvent(ItemEvent itemEvent)
		{
			showStatus("Checkbox name/state : " + getLabel() + "/" + getState());
		}
	}
	
	CheckboxGroup checkboxGroup;
	MyCheckbox myCheckbox1, myCheckbox2, myCheckbox3;
	
	public void init()
	{
		checkboxGroup = new CheckboxGroup();
		
		myCheckbox1 = new MyCheckbox("Item 1", checkboxGroup, true);
		add(myCheckbox1);
		
		myCheckbox2 = new MyCheckbox("Item 2", checkboxGroup, false);
		add(myCheckbox2);
		
		myCheckbox3 = new MyCheckbox("Item 3", checkboxGroup, false);
		add(myCheckbox3);
	}
}
