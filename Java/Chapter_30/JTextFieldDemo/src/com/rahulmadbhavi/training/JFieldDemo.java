
package com.rahulmadbhavi.training;

// Demonstrate JTextField

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFieldDemo extends JApplet
{
	JTextField jTextField;

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
		// Change to flow Layout.
		setLayout(new FlowLayout());

		// Add text field to content pane.
		jTextField = new JTextField(15);

		add(jTextField);

		jTextField.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent ae)
			{
				// Show text when user presses enter
				showStatus(jTextField.getText());
			}

		});
	}
}