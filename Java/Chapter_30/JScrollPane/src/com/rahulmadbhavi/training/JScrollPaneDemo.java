
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JScrollPaneDemo extends JApplet
{
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable(){

				public void run()
				{
					makeGUI();
				}

			});
		}
		catch(Exception e)
		{
			System.out.println("Exception : " + e);
		}
	}

	private void makeGUI()
	{
		// Add 400 buttons to a panel.
		JPanel jPanel = new JPanel();

		jPanel.setLayout(new GridLayout(20, 20));

		int b = 1;

		for(int i=0; i<20; i++)
		{
			for(int j=0; j<20; j++)
			{
				jPanel.add(new JButton("Button " + b));
				++b;
			}
		}

		// Create the scroll pane.
		JScrollPane jScrollPane = new JScrollPane(jPanel);

		// Add the scroll pane to the content pane.
		// Because the default border layout is used.
		// the scroll pane will be added to the center.
		add(jScrollPane, BorderLayout.CENTER);
	}
}