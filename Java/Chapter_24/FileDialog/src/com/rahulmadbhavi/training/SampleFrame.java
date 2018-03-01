
package com.rahulmadbhavi.training;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SampleFrame extends Frame
{
	SampleFrame(String title)
	{
		super(title);

		// Remove the window when closed
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent windowEvent)
			{
				System.exit(0);
			}
		});
	}
}
