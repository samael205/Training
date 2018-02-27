
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MyWindowAdapter extends WindowAdapter
{
	SampleFrame sampleFrame;

	public MyWindowAdapter(SampleFrame sampleFrame)
	{
		this.sampleFrame = sampleFrame;
	}

	public void windowClosing(WindowEvent we)
	{
		sampleFrame.setVisible(false);
	}
}