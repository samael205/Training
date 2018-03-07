
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class JListDemo extends JApplet
{
	JList<String> jList;
	JLabel jLabel;
	JScrollPane jScrollPane;

	// Create an array of cities.
	String cities[] = 
	{
		"New York", "Chicago", "Houston", "Denver", "Los Angeles",
		"Seattle", "London", "Paris", "New Delhi", "Hong Kong",
		"Tokyo", "Sydney"
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

		// Create a JList
		jList = new JList<String>(cities);

		// Set the list selection mode to single selection.
		jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Add the list to a scroll pane.
		jScrollPane = new JScrollPane(jList);

		// Set the preferred size of the scroll pane.
		jScrollPane.setPreferredSize(new Dimension(120, 90));

		// Make the label that displays the selection.
		jLabel = new JLabel("Choose a city");

		// Add selection listener for the list
		jList.addListSelectionListener(new ListSelectionListener(){

			public void valueChanged(ListSelectionEvent lse)
			{
				// get the index of the changed item.
				int index = jList.getSelectedIndex();

				// Display selection, if item was selected.
				if(index != -1)
				{
					jLabel.setText("Current selection : " + cities[index]);
				}
				else
				{
					jLabel.setText("Choose a city");
				}
			}

		});

		// Add the list and label to the content pane.
		add(jScrollPane);
		add(jLabel);
	}
}