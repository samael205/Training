package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.AWTEvent;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;

public class ScrollbarExtend extends Applet
{
	class MyScrollbar extends Scrollbar
	{
		public MyScrollbar(int style, int initial, int thumb, int min, int max)
		{
			super(style, initial, thumb, min, max);
			enableEvents(AWTEvent.ADJUSTMENT_EVENT_MASK);
		}
		
		protected void processAdjustmentEvent(AdjustmentEvent adjustmentEvent)
		{
			showStatus("Adjustment event : " + adjustmentEvent.getValue());
			setValue(getValue());
			super.processAdjustmentEvent(adjustmentEvent);
		}
	}
	
	MyScrollbar myScrollbar;
	
	public void init()
	{
		myScrollbar = new MyScrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
		
		add(myScrollbar);
	}
}
