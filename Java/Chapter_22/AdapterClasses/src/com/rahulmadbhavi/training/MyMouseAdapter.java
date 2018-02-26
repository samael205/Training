
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class MyMouseAdapter extends MouseAdapter
{
	AdapterClass adapterClass;

	public MyMouseAdapter(AdapterClass adapterClass)
	{
		this.adapterClass = adapterClass;
	}

	// Handle mouse clicked
	public void mouseClicked(MouseEvent me)
	{
		adapterClass.showStatus("Mouse clicked.");
	}
}