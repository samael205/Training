
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class MyKeyAdapter extends KeyAdapter
{
	AppWindow appWindow;

	public MyKeyAdapter(AppWindow appWindow)
	{
		this.appWindow = appWindow;
	}

	public void keyTyped(KeyEvent ke)
	{
		appWindow.keymsg += ke.getKeyChar();
		appWindow.repaint();
	}
}