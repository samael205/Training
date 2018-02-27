
package com.rahulmadbhavi.training;

import java.awt.*;
import java.applet.*;

public class CenterText extends Applet
{
	final Font font = new Font("SansSerif", Font.BOLD, 18);

	public void paint(Graphics graphics)
	{
		Dimension dimension = this.getSize();

		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, dimension.width, dimension.height);
		graphics.setColor(Color.black);
		graphics.setFont(font);

		drawCenteredString("This is centered.", dimension, graphics);	
		graphics.drawRect(0, 0, dimension.width-1, dimension.height-1);
	}

	public void drawCenteredString(String message, Dimension dimension, Graphics graphics)
	{
		FontMetrics fm = graphics.getFontMetrics();

		int x = (dimension.width - fm.stringWidth(message))/2;
		int y = (fm.getAscent() + (dimension.height - (fm.getAscent() + fm.getDescent()))/2);

		graphics.drawString(message, x, y);
	}
}