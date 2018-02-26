
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MyMouseMotionAdapter extends MouseMotionAdapter
{
	AdapterClass adapterClass;

	public MyMouseMotionAdapter(AdapterClass adapterClass)
	{
		this.adapterClass = adapterClass;
	}

	// Handle Mouse Dragged
	public void mouseDragged(MouseEvent me)
	{
		adapterClass.showStatus("Mouse dragged.");
	}
}