
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CitiesPanel extends JPanel
{
	public CitiesPanel()
	{
		String buttonNames[] = 
		{
			"New York",
			"London",
			"Hong Kong",
			"Tokyo"
		};

		JButton button;

		for(String buttonName : buttonNames)
		{
			button = new JButton(buttonName);
			add(button);
		}
	}
}