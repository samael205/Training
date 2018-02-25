
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;
import java.net.*;

public class Demo extends Applet
{
	// Display code and document bases
	public void paint(Graphics graphics)
	{
		String message;
		URL url;

		url = getCodeBase();
		message = "Code base : " + url.toString();
		graphics.drawString(message, 10, 20);

		url = getDocumentBase();
		message = "Document base : " + url.toString();
		graphics.drawString(message, 10, 40);
	}
}