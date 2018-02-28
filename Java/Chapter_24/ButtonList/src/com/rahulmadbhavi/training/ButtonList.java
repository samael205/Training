package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonList extends Applet implements ActionListener
{
	String message = "";
	Button buttonList[] = new Button[3]; 
	
	public void init()
	{
		Button yes		= new Button("Yes");
		Button no		= new Button("No");
		Button maybe	= new Button("Undecided");
		
		// Store references to buttons as added
		buttonList[0] = (Button) add(yes);
		buttonList[1] = (Button) add(no);
		buttonList[2] = (Button) add(maybe);
		
		// Register to receive action events
		for(int i=0; i<3; i++)
		{
			buttonList[i].addActionListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		for(int i=0; i<3; i++)
		{
			if(actionEvent.getSource() == buttonList[i])
			{
				message = "You pressed " + buttonList[i].getLabel() + ".";
			}
		}
		
		repaint();
	}
	
	public void paint(Graphics graphics)
	{
		graphics.drawString(message, 6, 100);
	}

}
