
package com.rahulmadbhavi.training;

// Handle an event in a Swing program

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MySwingApplet extends JApplet
{
	JButton jButtonAlpha;
	JButton jButtonBeta;

	JLabel jLabel;

	// Initialize the applet.
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable(){

				public void run()
				{
					// Initialize the GUI.
					makeGUI();
				}

			});
		}
		catch(Exception e)
		{
			System.out.println("Exception : " + e);
		}
	}

	// This applet does not need to override start(), stop() or destroy()

	// Setup and initialize the GUI.
	private void makeGUI()
	{
		// Set the applet to use the flow layout.
		setLayout(new FlowLayout());

		// Make two buttons.
		jButtonAlpha = new JButton("Alpha");
		jButtonBeta = new JButton("Beta");

		// Add action listener for Alpha.
		jButtonAlpha.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent ae)
			{
				jLabel.setText("Alpha was pressed.");
			}

		});

		// Add action listener for Beta.
		jButtonBeta.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent ae)
			{
				jLabel.setText("Beta was pressed.");
			}

		});

		// Add the buttons to the content pane.
		add(jButtonAlpha);
		add(jButtonBeta);

		// Create a text-based label.
		jLabel = new JLabel("Press a button.");

		// Add the label to the content pane.
		add(jLabel);
	}

}