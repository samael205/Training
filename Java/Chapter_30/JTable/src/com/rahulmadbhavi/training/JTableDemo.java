
package com.rahulmadbhavi.training;

import java.awt.*;
import javax.swing.*;

public class JTableDemo extends JApplet
{
	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable(){

				public void run()
				{
					makeGUI();
				}

			});
		}
		catch(Exception e)
		{
			System.out.println("Excepion : " + e);
		}
	}

	private void makeGUI()
	{
		// Intialize the columns headings.
		String[] columnHeads = {"Club", "P", "W", "D", "L", "GF", "GA", "GD", "Pts"};

		// Initialize data.
		Object[][] data = 
		{
			{ "Manchester United", "38", "28", "5", "5", "86", "43", "43", "89"},
			{ "Manchester City", "38", "23", "9", "6", "66", "34", "32", "78"},
			{ "Chelsea", "38", "22", "9", "7", "75", "39", "36", "75"},
			{ "Arsenal", "38", "21", "10", "7", "72", "37", "35", "73"},
			{ "Tottenham", "38", "21", "9", "8", "66", "46", "20", "72"},
			{ "Everton", "38", "16", "15", "7", "55", "40", "15", "63"},
			{ "Liverpool", "38", "16", "13", "9", "71", "43", "28", "61"},
			{ "West Bromwich Albion", "38", "14", "7", "17", "53", "57", "-4", "49"},
			{ "Swansea", "38", "11", "13", "14", "47", "51", "-4", "46"},
			{ "West Ham", "38", "12", "10", "16", "45", "53", "-8", "46"},
			{ "Norich City", "38", "10", "14", "14", "41", "58", "-17", "44"},
			{ "Fulham", "38", "11", "10", "17", "50", "60", "-10", "43"},
			{ "Stoke City", "38", "9", "15", "14", "34", "45", "-11", "42"},
			{ "Southanmpton", "38", "9", "14", "15", "49", "60", "-11", "42"},
			{ "Aston Villa", "38", "10", "11", "17", "47", "69", "-22", "41"},
			{ "Newcastle", "38", "11", "8", "19", "45", "68", "-23", "41"},
			{ "Sunderland", "38", "9", "12", "17", "41", "54", "-13", "39"},
			{ "Wigan Athletic", "38", "9", "9", "20", "47", "73", "-26", "36"},
			{ "Reading", "38", "6", "10", "22", "43", "73", "-30", "28"},
			{ "QPR", "38", "4", "13", "21", "30", "60", "-30", "25"}
		};

		// Create the table.
		JTable jTable = new JTable(data, columnHeads);

		// Add the table to a scroll pane.
		JScrollPane jScrollPane = new JScrollPane(jTable);

		// Add the scroll pane to the content pane.
		add(jScrollPane);
	}
}