
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener
{
	String message = "";
	int mouseX = 0, mouseY = 0;

	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	// Handle Mouse Clicks
	public void mouseClicked(MouseEvent me)
	{
		// Save coordinates
		mouseX = 0;
		mouseY = 10;
		message = "Mouse clicked.";
		repaint();
	}

	// Handle Mouse Entered
	public void mouseEntered(MouseEvent me)
	{
		// Save coordinates
		mouseX = 0;
		mouseY = 10;
		message = "Mouse entered.";
		repaint();
	}

	// Handle mouse exitted
	public void mouseExited(MouseEvent me)
	{
		// Save coordinates
		mouseX = 0;
		mouseY = 10;
		message = "Mouse exitted.";
		repaint();
	}

	// Handle button pressed.
	public void mousePressed(MouseEvent me)
	{
		// Save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		message = "Down";
		repaint();
	}

	// Handle button released
	public void mouseReleased(MouseEvent me)
	{
		// Save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		message = "Up";
		repaint();
	}

	// Handle mouse dragged
	public void mouseDragged(MouseEvent me)
	{
		mouseX = me.getX();
		mouseY = me.getY();
		message = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}

	// Handle mouse moved
	public void mouseMoved(MouseEvent me)
	{
		// Show status
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
	}

	// Display message in applet window at current X, Y location.
	public void paint(Graphics graphics)
	{
		graphics.drawString(message, mouseX, mouseY);
	}
}