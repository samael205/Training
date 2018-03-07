
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTabbedPaneDemo extends JApplet
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
		JTabbedPane jTabbedPane = new JTabbedPane();

		jTabbedPane.addTab("Cities", new CitiesPanel());
		jTabbedPane.addTab("Colors", new ColorsPanel());
		jTabbedPane.addTab("Flavors", new FlavorsPanel());

		add(jTabbedPane);
	}
}