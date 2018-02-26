
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AnonymousInnerClassDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MouseAdapter(){

			public void mousePressed(MouseEvent me)
			{
				showStatus("Mouse Pressed.");
			}

		});
	}
}