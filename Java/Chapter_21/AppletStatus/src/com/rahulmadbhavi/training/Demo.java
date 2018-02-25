
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class Demo extends Applet
{
	public void init()
	{
		setBackground(Color.cyan);
	}

	public void paint(Graphics graphics)
	{
		graphics.drawString("This is in the applet window.", 10, 20);
		showStatus("This is shown in the status window.");
	}
}