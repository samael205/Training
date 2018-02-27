package com.rahulmadbhavi.training;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowAdapter extends WindowAdapter
{
	SampleFrame sampleFrame;
	
	public MyWindowAdapter(SampleFrame sampleFrame)
	{
		this.sampleFrame = sampleFrame;
	}
	
	public void windowClosing(WindowEvent windowEvent)
	{
		sampleFrame.setVisible(false);
	}
}
