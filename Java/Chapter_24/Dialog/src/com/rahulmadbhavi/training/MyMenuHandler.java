
package com.rahulmadbhavi.training;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyMenuHandler implements ActionListener, ItemListener
{
	MenuFrame menuFrame;

	public MyMenuHandler(MenuFrame menuFrame)
	{
		this.menuFrame = menuFrame;
	}

	// Handle item events.
	@Override
	public void itemStateChanged(ItemEvent itemEvent)
	{
		menuFrame.repaint();
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		String message = "You selected : ";
		String arg = actionEvent.getActionCommand();

		if(arg.equals("New..."))
		{
			message += "New.";
			SampleDialog sampleDialog = new SampleDialog(menuFrame, "New Dialog Box");
			sampleDialog.setVisible(true);
		}
		else if(arg.equals("Open..."))
		{
			message += "Open.";
		}
		else if(arg.equals("Close"))
		{
			message += "Close.";
		}
		else if(arg.equals("Quit..."))
		{
			message += "Quit.";
		}
		else if(arg.equals("Edit"))
		{
			message += "Edit.";
		}
		else if(arg.equals("Cut"))
		{
			message += "Cut.";
		}
		else if(arg.equals("Copy"))
		{
			message += "Copy.";
		}
		else if(arg.equals("Paste"))
		{
			message += "Paste.";
		}
		else if(arg.equals("First"))
		{
			message += "First.";
		}
		else if(arg.equals("Second"))
		{
			message += "Second.";
		}
		else if(arg.equals("Third"))
		{
			message += "Third.";
		}
		else if(arg.equals("Debug"))
		{
			message += "Debug.";
		}
		else if(arg.equals("Testing"))
		{
			message += "Testing.";
		}

		menuFrame.message = message;
		menuFrame.repaint();
	}
}
