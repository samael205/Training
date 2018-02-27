
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class WindowEvents extends Applet implements MouseListener, MouseMotionListener
{
	SampleFrame frame;
	String message = "";
	int mouseX = 0, mouseY = 10;
	int movX = 0, movY = 0;

	// Create a frame window
	public void init()
	{
		frame = new SampleFrame("Handle Mouse Events");
		frame.setSize(300, 200);
		frame.setVisible(true);

		// Register this object to receive its own mouse events.
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	// Remove framw window when stopping applet
	public void stop()
	{
		frame.setVisible(false);
	}

	// Show frame window when starting applet.
	public void start()
	{
		frame.setVisible(true);
	}

	// Handle mouse clicked
	public void mouseClicked(MouseEvent me)
	{

	}

	// Handle mouse entered.
	public void mouseEntered(MouseEvent me)
	{
		mouseX =0;
		mouseY = 24;
		message = "Mouse just entered applet window.";
		repaint();
	}

	// Handle Mouse exitted.
	public void mouseExited(MouseEvent me)
	{
		mouseX = 0;
		mouseY = 24;
		message = "Mouse just left applet window.";
		repaint();
	}

	// Handle button pressed
	public void mousePressed(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		message = "Down";
		repaint();
	}

	// Handle button released
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
		repaint(0, 0, 100, 20);
	}

	// Display message in applet window
	public void paint(Graphics graphics)
	{
		graphics.drawString(message, mouseX, mouseY);
		graphics.drawString("Mouse at " + movX + ", " + movY, 0, 10);
	}
}