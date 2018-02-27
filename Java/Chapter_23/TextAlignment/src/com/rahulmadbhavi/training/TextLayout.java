
package com.rahulmadbhavi.training;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TextLayout extends Applet
{
	final int LEFT = 0;
	final int RIGHT = 1;
	final int CENTER = 2;
	final int LEFTRIGHT = 3;

	int align;
	Dimension dimension;
	Font font;
	FontMetrics fm;
	int fontSize;
	int fh, bl;
	int space;
	String text;

	public void init()
	{
		setBackground(Color.white);

		text = getParameter("text");

		try
		{
			fontSize = Integer.parseInt(getParameter("fontSize"));
		}
		catch(NumberFormatException e)
		{
			fontSize = 14;
		}

		align = LEFT;
		addMouseListener(new MyMouseAdapter(this));
	}

	public void paint(Graphics graphics)
	{
		update(graphics);
	}

	public void update(Graphics graphics)
	{
		dimension = getSize();
		graphics.setColor(getBackground());
		graphics.fillRect(0, 0, dimension.width, dimension.height);

		if(font == null)
		{
			font = new Font(getParameter("fontname"), Font.PLAIN, fontSize);
		}

		graphics.setFont(font);

		if(fm == null)
		{
			fm = graphics.getFontMetrics();

			bl = fm.getAscent();
			fh = bl + fm.getDescent();

			space = fm.stringWidth(" ");
		}

		graphics.setColor(Color.black);

		StringTokenizer st = new StringTokenizer(text);

		int x = 0;
		int nextx;
		int y = 0;
		String word, sp;
		int wordCount = 0;
		String line = "";

		while(st.hasMoreTokens())
		{
			word = st.nextToken();

			if(word.equals("<p>"))
			{
				drawString(graphics, line, wordCount, fm.stringWidth(line), y+bl);
				line = "";
				wordCount = 0;
				x = 0;
				y = y + (fh * 2);
			}
			else
			{
				int w = fm.stringWidth(word);
				if((nextx = (x+space+w)) > dimension.width)
				{
					drawString(graphics, line, wordCount, fm.stringWidth(line), y+bl);
					line = "";
					wordCount = 0;
					x = 0;
					y = y + fh;
				}
				if(x != 0)
				{
					sp = " ";	
				}
				else
				{
					sp = "";
				}

				line = line + sp + word;
				x = x + space + w;
				wordCount++;
			}
		}

		drawString(graphics, line, wordCount, fm.stringWidth(line), y + bl);
	}

	public void drawString(Graphics graphics, String line, int wc, int lineW, int y)
	{
		switch(align)
		{
			case LEFT :
							graphics.drawString(line, 0, y);
							break;

			case RIGHT :
							graphics.drawString(line, dimension.width - lineW, y);
							break;

			case CENTER :
							graphics.drawString(line, (dimension.width - lineW)/2, y);
							break;

			case LEFTRIGHT : 
							if(lineW < (int)(dimension.width * 0.75))
							{
								graphics.drawString(line, 0, y);
							}
							else
							{
								int toFill = (dimension.width - lineW)/wc;
								int nudge = dimension.width - lineW - (toFill * wc);
								int string = fm.stringWidth("");
								StringTokenizer st = new StringTokenizer(line);
								int x = 0;
								while(st.hasMoreTokens())
								{
									String word = st.nextToken();
									graphics.drawString(word, x, y);
									if(nudge > 0)
									{
										x = x + fm.stringWidth(word) + space + toFill + 1;
										nudge--;
									}
									else
									{
										x = x + fm.stringWidth(word) + space + toFill;
									}
								}
							}

							break;
		}
	}
}