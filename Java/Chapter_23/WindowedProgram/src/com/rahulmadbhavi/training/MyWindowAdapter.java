
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class MyWindowAdapter extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}