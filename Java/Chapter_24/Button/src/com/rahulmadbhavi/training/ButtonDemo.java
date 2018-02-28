package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends Applet implements ActionListener
{
	String message = "";
	Button yes, no, maybe;
	
	public void init()
	{
		yes 	= new Button("Yes");
		no 		= new Button("No");
		maybe 	= new Button("Undecided");
		
		add(yes);
		add(no);
		add(maybe);
		
		yes.addActionListener(this);
		no.addActionListener(this);
		maybe.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		String string = actionEvent.getActionCommand();
		
		if(string.equals("Yes"))
		{
			message = "You pressed Yes.";
		}
		else if(string.equals("No"))
		{
			message = "You pressed No.";
		}
		else
		{
			message = "You pressed Undecided.";
		}
		
		repaint();
	}
	
	public void paint(Graphics graphics)
	{
		graphics.drawString(message, 6, 100);
	}

}
