
package com.rahulmadbhavi.training;

// Demonstrate an icon-based JButton

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JToggleButtonDemo extends JApplet
{
	JLabel jLabel;
	JToggleButton jToggleButton;

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
		// Change to flow layout.
		setLayout(new FlowLayout());

		// Create a label.
		jLabel = new JLabel("Button is off.");

		// Make a toggle button.
		jToggleButton = new JToggleButton("On/Off");

		// Add an action listener for the toggle button.
		jToggleButton.addItemListener(new ItemListener(){

			public void itemStateChanged(ItemEvent ie)
			{
				if(jToggleButton.isSelected())
				{
					jLabel.setText("Button is on.");
				}
				else
				{
					jLabel.setText("Button is off.");
				}
			}

		});

		// Add the toggle button and label to the content pane.
		add(jToggleButton);
		add(jLabel);
	}
}