
package com.rahulmadbhavi.training;

// Handle an event in a Swing program

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventDemo
{
	JLabel jLabel;

	EventDemo()
	{
		// Create a new JFrame container.
		JFrame jFrame = new JFrame("An Event Example");

		// Specify FlowLayout for the layout manager.
		jFrame.setLayout(new FlowLayout());

		// Give the frame an initial size
		jFrame.setSize(220, 90);

		// Terminate the program when the user closes the application.
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Make two buttons.
		JButton jButtonAlpha = new JButton("Alpha");
		JButton jButtonBeta = new JButton("Beta");

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
		jFrame.add(jButtonAlpha);
		jFrame.add(jButtonBeta);

		// Create a text-based label.
		jLabel = new JLabel("Press a button.");

		// Add the label to the content pane.
		jFrame.add(jLabel);

		// Display the frame.
		jFrame.setVisible(true);
	}

	public static void main(String args[])
	{
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable(){

			public void run()
			{
				new EventDemo();
			}

		});
	}
}