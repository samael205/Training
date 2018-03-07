
package com.rahulmadbhavi.training;

import java.awt.*;
import java.io.*;
import java.net.*;
import javax.swing.*;


public class JLabelDemo extends JApplet
{
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
		try
		{
			URL url  = new File("./images/envelope.png").toURI().toURL();;
			System.out.println(url);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		// Create an icon.
		ImageIcon icon = new ImageIcon("./images/envelope.png");

		// Create a label.
		JLabel jLabel = new JLabel("Email", icon, JLabel.CENTER);

		// Add this label to the content pane.
		add(jLabel);
	}
}