package com.rahulmadbhavi.downloadmanager.utility;

import java.awt.Component;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ProgressRenderer extends JProgressBar implements TableCellRenderer
{
	// Constructor
	public ProgressRenderer(int min, int max)
	{
		super(min, max);
	}
	
	// Return this JProgressBar as the renderer for the given table cell.
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
	{
		// Set JProgressBar's percent complete value.
		setValue((int) ((Double) value).doubleValue());
		return this;
	}
}
