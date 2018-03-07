
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// This class extends JPanel.
// It overrides the paintComponent() method so that random lines are plotted in the panel.

class PaintPanel extends JPanel
{
	Insets insets;	// Holds the panel's insets.
	Random random;	// Used to generate random numbers.

	// Construct a panel.
	PaintPanel()
	{
		// Put a border around the panel.
		setBorder(BorderFactory.createLineBorder(Color.RED, 5));

		random = new Random();
	}

	// Override the paintComponent() method.
	@Override
	protected void paintComponent(Graphics graphics)
	{
		// Always call the superclass method first.
		super.paintComponent(graphics);

		int x, y, x2, y2;

		// Get the height and width of the component.
		int height = getHeight();
		int width = getWidth();

		// Get the insets.
		insets = getInsets();

		// Draw ten lines whose end points are randomly generated.
		for(int i=0; i<10; i++)
		{
			// Obtain random coordinates that define the endpoints of each line.
			x = random.nextInt(width - insets.left);
			y = random.nextInt(height - insets.bottom);
			x2 = random.nextInt(width - insets.left);
			y2 = random.nextInt(height - insets.bottom);

			// Draw the line.
			graphics.drawLine(x, y, x2, y2);
		}
	}
}