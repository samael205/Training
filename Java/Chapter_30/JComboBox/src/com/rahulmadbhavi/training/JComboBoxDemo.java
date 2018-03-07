
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo extends JApplet
{
	JLabel jLabel;
	JComboBox<String> jComboBox;

	String icons[] = 
	{
		"camera", "microphone", "settings"
	};

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

		// Instantiate a combo box and add it to the content pane.
		jComboBox = new JComboBox<String>(icons);
		add(jComboBox);

		// Handle Selections
		jComboBox.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent ae)
			{
				String iconName = (String) jComboBox.getSelectedItem();
				jLabel.setIcon(new ImageIcon("./images/" + iconName + ".jpg"));
			}

		});

		// Create a label and add it to the content pane.
		jLabel = new JLabel(new ImageIcon("./images/camera.jpg"));
		add(jLabel);
	}
}