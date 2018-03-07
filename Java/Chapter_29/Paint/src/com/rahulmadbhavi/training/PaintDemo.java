
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// Demonstrate painting directly onto a panel.
class PaintDemo
{
	JLabel jLabel;
	PaintPanel panel;

	PaintDemo()
	{
		// Create a new JFrame container.
		JFrame jFrame = new JFrame("Paint Demo");

		// Give the frame an initial size
		jFrame.setSize(200, 150);

		// Terminate the program when the user closes the application.
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create the panel that will be painted.
		panel = new PaintPanel();

		// Add the panel to the content pane.
		// Because the default border layout is used, the panel will automatically be sized to fit the center region.
		jFrame.add(panel);

		// Display the frame.
		jFrame.setVisible(true);		
	}

	public static void main(String args[])
	{
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable(){

			public void run()
			{
				new PaintDemo();
			}

		});
	}
}