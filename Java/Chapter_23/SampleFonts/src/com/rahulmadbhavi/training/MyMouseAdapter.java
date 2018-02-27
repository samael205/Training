
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class MyMouseAdapter extends MouseAdapter
{
	SampleFonts sampleFonts;
	String fonts[];

	public MyMouseAdapter(SampleFonts sampleFonts)
	{
		this.sampleFonts = sampleFonts;

		fonts = new String[]{"Dialog", "DialogInput", "SansSerif", "Serif", "Monospaced"};
	}

	public void mousePressed(MouseEvent me)
	{
		sampleFonts.next++;
		sampleFonts.next %= 5;

		sampleFonts.font = new Font(fonts[sampleFonts.next], Font.PLAIN, 12);
		sampleFonts.message = fonts[sampleFonts.next];

		sampleFonts.setFont(sampleFonts.font);
		sampleFonts.repaint();
	}
}