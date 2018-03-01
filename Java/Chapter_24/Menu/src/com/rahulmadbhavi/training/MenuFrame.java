
package com.rahulmadbhavi.training;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuFrame extends Frame
{
	String				message	= "";
	CheckboxMenuItem	debug, test;

	MenuFrame(String title)
	{
		super(title);

		// Create menu bar and add it to frame
		MenuBar menuBar = new MenuBar();
		setMenuBar(menuBar);

		// Create the menu items
		Menu file = new Menu("File");
		MenuItem item1, item2, item3, item4, item5;
		file.add(item1 = new MenuItem("New..."));
		file.add(item2 = new MenuItem("Open..."));
		file.add(item3 = new MenuItem("Close"));
		file.add(item4 = new MenuItem("-"));
		file.add(item5 = new MenuItem("Quit..."));
		menuBar.add(file);

		Menu edit = new Menu("Edit");
		MenuItem item6, item7, item8, item9;
		edit.add(item6 = new MenuItem("Cut"));
		edit.add(item7 = new MenuItem("Copy"));
		edit.add(item8 = new MenuItem("Paste"));
		edit.add(item9 = new MenuItem("-"));

		Menu sub = new Menu("Special");
		MenuItem item10, item11, item12;
		sub.add(item10 = new MenuItem("First"));
		sub.add(item11 = new MenuItem("Second"));
		sub.add(item12 = new MenuItem("Third"));
		edit.add(sub);

		// These are checkable menu items
		debug = new CheckboxMenuItem("Debug");
		edit.add(debug);

		test = new CheckboxMenuItem("Testing");
		edit.add(test);

		menuBar.add(edit);

		// Create an object to handle action and item events
		MyMenuHandler handler = new MyMenuHandler(this);

		// Register to receive those events
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);
		item5.addActionListener(handler);

		item6.addActionListener(handler);
		item7.addActionListener(handler);
		item8.addActionListener(handler);
		item9.addActionListener(handler);

		item10.addActionListener(handler);
		item11.addActionListener(handler);
		item12.addActionListener(handler);

		debug.addItemListener(handler);
		test.addItemListener(handler);

		// Create an obejct to handle window events
		MyWindowAdapter adapter = new MyWindowAdapter(this);

		// Register it to receive those evens
		addWindowListener(adapter);
	}

	public void paint(Graphics graphics)
	{
		graphics.drawString(message, 10, 200);

		if(debug.getState())
		{
			graphics.drawString("Debug is On.", 10, 220);
		}
		else
		{
			graphics.drawString("Debug is Off.", 10, 220);
		}

		if(test.getState())
		{
			graphics.drawString("Testing is On.", 10, 240);
		}
		else
		{
			graphics.drawString("Testing is Off.", 10, 240);
		}
	}
}
