
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;
import java.net.*;

public class Demo extends Applet
{
	public void start()
	{
		AppletContext appletContext = getAppletContext();
		URL url = getCodeBase();

		try
		{
			appletContext.showDocument(new URL(url + "Test.html"));
		}
		catch(MalformedURLException e)
		{
			showStatus("URL not found.");
		}
	}
}