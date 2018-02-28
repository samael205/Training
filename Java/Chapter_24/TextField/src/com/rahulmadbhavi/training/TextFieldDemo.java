package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldDemo extends Applet implements ActionListener
{
	TextField name, pass;
	
	public void init()
	{
		Label nameLabel = new Label("Name : ", Label.RIGHT);
		Label passLabel = new Label("Password : ", Label.RIGHT);
		
		name = new TextField(12);
		pass = new TextField(8);
		
		pass.setEchoChar('*');
		
		add(nameLabel);
		add(name);
		
		add(passLabel);
		add(pass);
		
		// Register to receive action events
		name.addActionListener(this);
		pass.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		repaint();
	}
	
	public void paint(Graphics graphics)
	{
		graphics.drawString("Name: " + name.getText(), 6, 60);
		graphics.drawString("Selected text in name : " + name.getSelectedText(), 6, 80);
		graphics.drawString("Password : " + pass.getText(), 6, 100);
	}
}
