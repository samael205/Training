
package com.rahulmadbhavi.training;

// Demonstrate an icon-based JButton

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonDemo extends JApplet implements ActionListener
{
	JLabel jLabel;

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

		ImageIcon icon;
		JButton button;

		String buttonInfo[][] = 
		{
			{ "images/camera.jpg",		"Camera"},
			{ "images/microphone.jpg",	"Microphone"},
			{ "images/settings.jpg", 	"Settings"}
		};

		// Add buttons to content pane.
		for(String temp[] : buttonInfo)
		{
			icon = new ImageIcon(temp[0]);
			button = new JButton(icon);

			button.setActionCommand(temp[1]);
			button.addActionListener(this);

			add(button);
		}

		// Create and add the label to content pane.
		jLabel = new JLabel("Click an icon");
		add(jLabel);
	}

	// Handle button events
	public void actionPerformed(ActionEvent ae)
	{
		jLabel.setText("You selected : " + ae.getActionCommand());
	}
}