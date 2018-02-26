
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MousePressedDemo extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
	}
}