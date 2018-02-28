package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.TextArea;

public class TextAreaDemo extends Applet
{
	public void init()
	{
		String value = 	"Java SE is the latest version of the most\n" +
						"widely-used computer language for Internet programming.\n" +
						"Building on a rich heritage, Java has advanced both\n" + 
						"the art and science of computer design.\n\n" +
						"One of the reasons for Java's ongoing success is its\n" +
						"constant, steady rate of evolution. Java has never stood\n" +
						"still. Instead, Java has consistently adapted to the\n" +
						"rapidly changing landscape of the networked world.\n" +
						"Moreover, Java has often led the way, charting the\n" +
						"course for others to follow.";
		
		TextArea textArea = new TextArea(value, 10, 30);
		add(textArea);
	}
}
