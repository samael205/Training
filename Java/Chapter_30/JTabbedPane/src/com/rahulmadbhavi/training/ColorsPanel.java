
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorsPanel extends JPanel
{
	public ColorsPanel()
	{
		String colorNames[] = 
		{
			"Red",
			"Green",
			"Blue"
		};

		JCheckBox checkBox;

		for(String colorName : colorNames)
		{
			checkBox = new JCheckBox(colorName);
			add(checkBox);
		}
	}
}