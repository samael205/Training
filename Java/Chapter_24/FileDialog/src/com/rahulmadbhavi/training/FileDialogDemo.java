package com.rahulmadbhavi.training;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogDemo
{
	public static void main(String args[])
	{
		// Create a frame that owns the dialog
		Frame frame = new SampleFrame("File Dialog Demo");
		
		frame.setVisible(true);
		
		frame.setSize(100, 100);
		
		FileDialog fileDialog = new FileDialog(frame, "File Dialog");
		
		fileDialog.setVisible(true);
	}
}
