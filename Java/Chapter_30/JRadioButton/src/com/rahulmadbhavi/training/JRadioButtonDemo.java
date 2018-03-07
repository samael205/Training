
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonDemo extends JApplet implements ActionListener
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

		// Create radio buttons and add them to the content pane.
		String radioButtonNames[] = 
		{
			"A",
			"B",
			"C"
		};

		// Define a button group
		ButtonGroup buttonGroup = new ButtonGroup();

		for(String radioButtonName : radioButtonNames)
		{
			JRadioButton button = new JRadioButton(radioButtonName);
			button.addActionListener(this);
			add(button);

			// Add button to group
			buttonGroup.add(button);
		}

		// Create a label and add it to the content pane.
		jLabel = new JLabel("Select one");
		add(jLabel);
	}

	// Handle button selection.
	public void actionPerformed(ActionEvent ae)
	{
		jLabel.setText("You selected " + ae.getActionCommand());
	}
}