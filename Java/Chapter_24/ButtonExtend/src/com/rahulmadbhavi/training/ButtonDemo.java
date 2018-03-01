
package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.AWTEvent;
import java.awt.Button;
import java.awt.event.ActionEvent;

public class ButtonDemo extends Applet
{
	static int i = 0;
	MyButton myButton;
	
	class MyButton extends Button
	{
		public MyButton(String label)
		{
			super(label);
			enableEvents(AWTEvent.ACTION_EVENT_MASK);
		}

		public void processActionEvent(ActionEvent actionEvent)
		{
			showStatus("action event : " + i++);
			super.processActionEvent(actionEvent);
		}
	}
	
	public void init()
	{
		myButton = new MyButton("Test Button");
		add(myButton);
	}
}
