
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlavorsPanel extends JPanel
{
	FlavorsPanel()
	{
		String flavors[] = 
		{
			"Vanilla",
			"Chocolate",
			"Strawberry"
		};

		JComboBox<String> comboBox = new JComboBox<String>();

		for(String flavor : flavors)
		{
			comboBox.addItem((flavor));
		}

		add(comboBox);
	}
}