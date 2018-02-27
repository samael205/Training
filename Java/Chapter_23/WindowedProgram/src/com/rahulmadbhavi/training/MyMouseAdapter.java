
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class MyMouseAdapter extends MouseAdapter
{
	AppWindow appWindow;

	public MyMouseAdapter(AppWindow appWindow)
	{
		this.appWindow = appWindow;
	}

	public void mousePressed(MouseEvent me)
	{
		appWindow.mouseX = me.getX();
		appWindow.mouseY = me.getY();
		appWindow.mousemsg = "Mouse Down at " + appWindow.mouseX + ", " + appWindow.mouseY;
		appWindow.repaint();
	}
}