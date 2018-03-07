
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo extends JApplet implements ItemListener
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
		// Change the layout to flow layout.
		setLayout(new FlowLayout());

		String checkBoxNames[] =
		{
			"C",
			"C++",
			"Java",
			"Perl",
		};

		// Add checkboxes to the content pane.
		JCheckBox jCheckBox;

		for(String checkBoxName : checkBoxNames)
		{
			jCheckBox = new JCheckBox(checkBoxName);
			jCheckBox.addItemListener(this);
			add(jCheckBox);
		}

		// Create the label and add to the content pane.
		jLabel = new JLabel("Select languages");
		add(jLabel);
	}

	// Handle item events for the check boxes.
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox jCheckBox = (JCheckBox) ie.getItem();

		if(jCheckBox.isSelected())
		{
			jLabel.setText(jCheckBox.getText() + " is selected.");
		}
		else
		{
			jLabel.setText(jCheckBox.getText() + " is cleared.");
		}
	}
}