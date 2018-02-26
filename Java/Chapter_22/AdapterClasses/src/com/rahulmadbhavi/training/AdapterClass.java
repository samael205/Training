
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AdapterClass extends Applet
{
	public void init()
	{
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
	}
}