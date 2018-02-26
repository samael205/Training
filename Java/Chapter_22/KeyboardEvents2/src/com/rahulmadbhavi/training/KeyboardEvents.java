
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEvents extends Applet implements KeyListener
{
	String message = "";
	final int X = 10, Y = 20;

	public void init()
	{
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke)
	{
		showStatus("Key Down");

		int key = ke.getKeyCode();

		switch(key)
		{
			case KeyEvent.VK_F1 :
											message += "<F1>";
											break;

			case KeyEvent.VK_F2 :
											message += "<F2>";
											break;

			case KeyEvent.VK_F3 :
											message += "<F3>";
											break;

			case KeyEvent.VK_PAGE_DOWN :
											message += "<PgDn>";
											break;

			case KeyEvent.VK_PAGE_UP :
											message += "<PgUp>";
											break;

			case KeyEvent.VK_LEFT :
											message += "<LeftArrow>";
											break;

			case KeyEvent.VK_RIGHT :
											message += "<RightArrow>";
											break;
		}

		repaint();
	}

	public void keyReleased(KeyEvent ke)
	{
		showStatus("Key Up");
	}

	public void keyTyped(KeyEvent ke)
	{
		message += ke.getKeyChar();
		repaint();
	}

	public void paint(Graphics graphics)
	{
		graphics.drawString(message, X, Y);
	}
}