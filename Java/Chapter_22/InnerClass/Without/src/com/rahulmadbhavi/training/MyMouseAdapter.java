
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class MyMouseAdapter extends MouseAdapter
{
	MousePressedDemo mousePressedDemo;

	public MyMouseAdapter(MousePressedDemo mousePressedDemo)
	{
		this.mousePressedDemo = mousePressedDemo;
	}

	public void mousePressed(MouseEvent me)
	{
		mousePressedDemo.showStatus("Mouse Pressed.");
	}
}