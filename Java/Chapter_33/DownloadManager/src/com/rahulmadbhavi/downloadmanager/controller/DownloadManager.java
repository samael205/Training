
package com.rahulmadbhavi.downloadmanager.controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.rahulmadbhavi.downloadmanager.utility.Download;
import com.rahulmadbhavi.downloadmanager.utility.DownloadsTableModel;
import com.rahulmadbhavi.downloadmanager.utility.ProgressRenderer;

public class DownloadManager extends JFrame implements Observer
{
	// Add download text field.
	private JTextField			addTextField;

	// Download table's data model.
	private DownloadsTableModel	tableModel;

	// Table listing downloads.
	private JTable				table;

	// These are the buttons for managing the selected download.
	private JButton				pauseButton, resumeButton;
	private JButton				cancelButton, clearButton;

	// Currently selected download.
	private Download			selectedDownload;

	// Flag for whether or not table selection is being cleared.
	private boolean				clearing;

	// Constructor for Download Manager.
	public DownloadManager()
	{
		// Set application title.
		setTitle("Download Manager");

		// Set window size.
		setSize(640, 480);

		// Handle window closing events.
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{
				actionExit();
			}
			
		});
		
		// Set up file menu.
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		JMenuItem fileExitMenuItem = new JMenuItem("Exit", KeyEvent.VK_X);
		
		fileExitMenuItem.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				actionExit();
			}
		});
		
		fileMenu.add(fileExitMenuItem);
		menuBar.add(fileMenu);
		setJMenuBar(menuBar);
		
		// Set up add panel.
		JPanel addPanel = new JPanel();
		addTextField = new JTextField(30);
		
		addPanel.add(addTextField);
		JButton addButton = new JButton("Add Download");
		addButton.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				actionAdd();
			}
		});
		addPanel.add(addButton);
		
		// Set up downloads table.
		tableModel = new DownloadsTableModel();
		table = new JTable(tableModel);
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener()
		{			
			@Override
			public void valueChanged(ListSelectionEvent e)
			{
				tableSelectionChanged();
			}
		});
		
		// Allow only one row at a time to be selected.
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// Set up Progressbar as renderer for progree column.
		ProgressRenderer renderer = new ProgressRenderer(0, 100);
		// Show progress text
		renderer.setStringPainted(true);
		table.setDefaultRenderer(JProgressBar.class, renderer);
		
		// Set table's row height large enough to fit JProgressBar.
		table.setRowHeight((int) renderer.preferredSize().getHeight());
		
		// Set up downloads panel.
		JPanel downloadsPanel =  new JPanel();
		downloadsPanel.setBorder(BorderFactory.createTitledBorder("Downloads"));
		downloadsPanel.setLayout(new BorderLayout());
		downloadsPanel.add(new JScrollPane(table), BorderLayout.CENTER);
		
		// Set up buttons panel.
		JPanel buttonsPanel = new JPanel();
		
		pauseButton = new JButton("Pause");
		pauseButton.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				actionPause();
			}
		});
		pauseButton.setEnabled(false);
		buttonsPanel.add(pauseButton);
		
		resumeButton = new JButton("Resume");
		resumeButton.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				actionResume();
			}
		});
		resumeButton.setEnabled(false);
		buttonsPanel.add(resumeButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				actionCancel();
			}
		});
		cancelButton.setEnabled(false);
		buttonsPanel.add(cancelButton);
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener()
		{			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				actionClear();
			}
		});
		clearButton.setEnabled(false);
		buttonsPanel.add(clearButton);
		
		// Add panels to display.
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(addPanel, BorderLayout.NORTH);
		getContentPane().add(downloadsPanel, BorderLayout.CENTER);
		getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
	}
	
	// Exit this program.
	private void actionExit()
	{
		System.exit(0);
	}
	
	// Add a new download.
	private void actionAdd()
	{
		URL verifiedURL = verifyURL(addTextField.getText());
		
		if(verifiedURL != null)
		{
			tableModel.addDownload(new Download(verifiedURL));
			// Reset add text field
			addTextField.setText("");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Invalid Download URL", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	// Verify download URL.
	private URL verifyURL(String url)
	{
		// Only allow HTTP URLs
		if(!url.toLowerCase().startsWith("http://"))
		{
			return null;
		}
		
		// Verify the format of url.
		URL verifiedurl = null;
		try
		{
			verifiedurl = new URL(url);
		}
		catch(Exception e)
		{
			return null;
		}
		
		// Make sure URL specifies a file.
		if(verifiedurl.getFile().length() < 2)
		{
			return null;
		}
		
		return verifiedurl;
	}
	
	// Called when table row selection changes.
	private void tableSelectionChanged()
	{
		// Unregister from receiving notifications from the last selected download.
		if(selectedDownload != null)
		{
			selectedDownload.deleteObserver(DownloadManager.this);
		}
		
		// If not in the middle of clearing a download, set the selected download and register to receive notifications from it.
		if(!clearing && table.getSelectedRow() > -1)
		{
			selectedDownload = tableModel.getDownload(table.getSelectedRow());
			selectedDownload.addObserver(DownloadManager.this);
			updateButtons();
		}
	}
	
	// Pause the selected download.
	private void actionPause()
	{
		selectedDownload.pause();
		updateButtons();
	}
	
	// Resume the selected download.
	private void actionResume()
	{
		selectedDownload.resume();
		updateButtons();
	}
	
	// Cancel the selected download.
	private void actionCancel()
	{
		selectedDownload.cancel();
		updateButtons();
	}
	
	// Clear the selected download.
	private void actionClear()
	{
		clearing = true;
		tableModel.clearDownload(table.getSelectedRow());
		clearing = false;
		selectedDownload = null;
		updateButtons();
	}
	
	// Update each button's state based off the currently selected download's status.
	private void updateButtons()
	{
		if(selectedDownload != null)
		{
			int status = selectedDownload.getStatus();
			
			switch(status)
			{
				case Download.DOWNLOADING :
					pauseButton.setEnabled(true);
					resumeButton.setEnabled(false);
					cancelButton.setEnabled(true);
					clearButton.setEnabled(false);
					break;
					
				case Download.PAUSED :
					pauseButton.setEnabled(false);
					resumeButton.setEnabled(true);
					cancelButton.setEnabled(true);
					clearButton.setEnabled(false);
					break;
					
				case Download.ERROR :
					pauseButton.setEnabled(false);
					resumeButton.setEnabled(true);
					cancelButton.setEnabled(false);
					clearButton.setEnabled(true);
					break;
					
				default :
					pauseButton.setEnabled(false);
					resumeButton.setEnabled(false);
					cancelButton.setEnabled(false);
					clearButton.setEnabled(true);
					break;
					
			}
		}
		else
		{
			pauseButton.setEnabled(false);
			resumeButton.setEnabled(false);
			cancelButton.setEnabled(false);
			clearButton.setEnabled(false);
		}
	}
	
	// Update is called when a download notiifes its observers of any changes.
	@Override
	public void update(Observable o, Object arg)
	{
		// Update butons if the selected download has changed.
		if(selectedDownload != null && selectedDownload.equals(o))
		{
			updateButtons();
		}
	}
	
	// Ru the download manager.
	public static void main(String args[]) throws Exception
	{
		SwingUtilities.invokeAndWait(new Runnable()
		{			
			@Override
			public void run()
			{
				DownloadManager manager = new DownloadManager();
				manager.setVisible(true);
			}
		});
	}
}
