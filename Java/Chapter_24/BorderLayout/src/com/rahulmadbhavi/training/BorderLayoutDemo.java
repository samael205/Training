package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextArea;

public class BorderLayoutDemo extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		
		add(new Button("This is across the top."), BorderLayout.NORTH);
		add(new Button("The footer message might go here."), BorderLayout.SOUTH);
		add(new Button("Right"), BorderLayout.EAST);
		add(new Button("Left"), BorderLayout.WEST);
		
		String message = 	"The reasonable man adapts " +
							"himeself to the world;\n" +
							"the reasonable one persists in " +
							"trying to adapt the world to himself.\n" +
							"Therefore all progress depends " + 
							"on the unreasonable man.\n\n" +
							" - George Bernard Shaw\n\n";
		
		add(new TextArea(message), BorderLayout.CENTER);
	}
}
