
package com.rahulmadbhavi.training;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class JTreeDemo extends JApplet
{
	JTree jTree;
	JLabel jLabel;

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
			System.out.println("Exception : " + e);
		}
	}

	private void createNode(DefaultMutableTreeNode root, DefaultMutableTreeNode child)
	{
		root.add(child);
	}

	private void makeGUI()
	{
		// Create top node of tree
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");

		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");

		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");

		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");

		// Create tree
		createNode(top, a);
		createNode(top, b);

		createNode(a, a1);
		createNode(a, a2);

		createNode(b, b1);
		createNode(b, b2);
		createNode(b, b3);

		// Create tree
		jTree = new JTree(top);

		// Add the tree to a scroll pane.
		JScrollPane jScrollPane = new JScrollPane(jTree);

		// Add the scroll pane to the content pane.
		add(jScrollPane);

		// Add the label to the content pane.
		jLabel = new JLabel();
		add(jLabel, BorderLayout.SOUTH);

		// Handle tree selection events
		jTree.addTreeSelectionListener(new TreeSelectionListener(){

			public void valueChanged(TreeSelectionEvent tse)
			{
				jLabel.setText("Selection is " + tse.getPath());
			}

		});
	}
}