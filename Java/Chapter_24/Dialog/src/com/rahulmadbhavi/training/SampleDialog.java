
package com.rahulmadbhavi.training;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SampleDialog extends Dialog implements ActionListener
{
	SampleDialog(Frame parent, String title)
	{
		super(parent, title, false);

		setLayout(new FlowLayout());
		setSize(300, 200);

		add(new Label("Press this button : "));
		Button button;
		add(button = new Button("Cancel"));
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		dispose();
	}

	public void paint(Graphics graphics)
	{
		graphics.drawString("This is in the dialog box.", 10, 70);
	}
}
