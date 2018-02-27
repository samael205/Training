
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class SampleFrame extends Frame implements MouseListener, MouseMotionListener
{
	String message = "";
	int mouseX = 10, mouseY = 40;
	int movX = 0, movY = 0;

	SampleFrame(String title)
	{
		super(title);

		// Register this object to receive its own mouse events
		addMouseListener(this);
		addMouseMotionListener(this);

		// Create an object to handle window events
		MyWindowAdapter adapter = new MyWindowAdapter(this);

		// Register it to receive those events
		addWindowListener(adapter);
	}

	// handle mouse clicked
	public void mouseClicked(MouseEvent me)
	{

	}

	// Handle Mouse Entered
	public void mouseEntered(MouseEvent me)
	{
		mouseX = 10;
		mouseY = 54;
		message = "Mouse just entered child.";
		repaint();
	}

	// Handle Mouse exited.
	public void mouseExited(MouseEvent me)
	{
		mouseX = 10;
		mouseY = 54;
		message = "Mouse left child window.";
		repaint();
	}

	// Handle Mouse pressed.
	public void mousePressed(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		message = "Down";
		repaint();
	}

	// Handle Mouse released.
	public void mouseReleased(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		message = "Up";
		repaint();
	}

	// Handle Mouse dragged.
	public void mouseDragged(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		movX = me.getX();
		movY = me.getY();
		message = "*";
		repaint();
	}

	// Handle Mouse moved.
	public void mouseMoved(MouseEvent me)
	{
		movX = me.getX();
		movY = me.getY();
		repaint(0, 0, 100, 60);
	}

	public void paint(Graphics graphics)
	{
		graphics.drawString(message, mouseX, mouseY);
		graphics.drawString("Mouse at " + movX + ", " + movY, 10, 40);
	}
}