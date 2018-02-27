
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MyMouseAdapter extends MouseAdapter
{
	TextLayout textLayout;

	public MyMouseAdapter(TextLayout textLayout)
	{
		this.textLayout = textLayout;
	}

	public void mouseClicked(MouseEvent me)
	{
		textLayout.align = (textLayout.align + 1) % 4;
		textLayout.repaint();
	}
}