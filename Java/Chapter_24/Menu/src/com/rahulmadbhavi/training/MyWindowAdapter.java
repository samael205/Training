
package com.rahulmadbhavi.training;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowAdapter extends WindowAdapter
{
	MenuFrame menuFrame;

	public MyWindowAdapter(MenuFrame menuFrame)
	{
		this.menuFrame = menuFrame;
	}

	public void windowClosing(WindowEvent windowEvent)
	{
		menuFrame.setVisible(false);
	}
}
