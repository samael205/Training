
package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GridBagDemo extends Applet implements ItemListener
{
	String		message	= "";
	Checkbox	winXP, winVista, solaris, mac;

	public void init()
	{
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		setLayout(gridBagLayout);

		// Define check boxes
		winXP = new Checkbox("Windows XP", null, true);
		winVista = new Checkbox("Windows Vista");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("Mac OS");

		// Define the grid bag

		// Use default row weight of 0 for first row.

		// Use a column weight of 1
		gridBagConstraints.weightx = 1.0;

		// Pad by 200 Units
		gridBagConstraints.ipadx = 200;

		// Inset slightly from top left
		gridBagConstraints.insets = new Insets(4, 4, 0, 0);

		gridBagConstraints.anchor = GridBagConstraints.NORTHEAST;

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(winXP, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(winVista, gridBagConstraints);

		// Give second row a weight of 1.
		gridBagConstraints.weighty = 1.0;

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(solaris, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(mac, gridBagConstraints);

		// Add the components
		add(winXP);
		add(winVista);
		add(solaris);
		add(mac);

		// Register to receive item events.
		winXP.addItemListener(this);
		winVista.addItemListener(this);
		solaris.addItemListener(this);
		mac.addItemListener(this);
	}

	@Override
	public void itemStateChanged(ItemEvent itemEvent)
	{
		repaint();
	}

	// Display current state of the check boxes.
	public void paint(Graphics graphics)
	{
		message = "Current state :";
		graphics.drawString(message, 6, 80);
		
		message = "Windows XP : " + winXP.getState();
		graphics.drawString(message, 6, 100);
		
		message = "Windows Vista : " + winVista.getState();
		graphics.drawString(message, 6, 120);
		
		message = "Solaris : " + solaris.getState();
		graphics.drawString(message, 6, 140);
		
		message = "Mac OS : " + mac.getState();
		graphics.drawString(message, 6, 160);
	}
}
