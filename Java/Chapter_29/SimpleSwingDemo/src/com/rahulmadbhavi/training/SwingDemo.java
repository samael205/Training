
package com.rahulmadbhavi.training;

import javax.swing.*;

public class SwingDemo
{
	SwingDemo()
	{
		// Create a new JFrame container.
		JFrame jFrame = new JFrame("A Simple Swing Application");

		// Give the frame an initial value
		jFrame.setSize(275, 100);

		// Terminate the program when the user closes the application.
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a text-based label.
		JLabel jLabel = new JLabel("Swing means powerful GUIs.");

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
				new SwingDemo();
			}

		});
	}
}