
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

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

	// Display keystrokes.
	public void paint(Graphics graphics)
	{
		graphics.drawString(message, X, Y);
	}
}