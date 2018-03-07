
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;

public class Demo extends Applet
{
	public void init()
	{
		add(new Colors());
	}

	public void paint(Graphics graphics)
	{
		showStatus("Left Click : Rectangle, Right Click : Oval");
	}
}