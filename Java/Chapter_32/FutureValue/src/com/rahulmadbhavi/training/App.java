
package com.rahulmadbhavi.training;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;
import java.text.NumberFormat;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class App extends JApplet implements ActionListener
{
	private JTextField		futureValueText;
	private JTextField		yearsText;
	private JTextField		RORText;
	private JTextField		compText;
	private JTextField		initialAmountText;

	private JButton			calculateButton;

	private FutureValue		futureValue	= new FutureValue(75000, 0.07, 5, 4);

	private NumberFormat	formatter;

	public void init()
	{
		try
		{
			SwingUtilities.invokeAndWait(new Runnable()
			{

				@Override
				public void run()
				{
					makeGUI();
				}

			});
		}
		catch (Exception e)
		{
			System.out.println("Exception : " + e);
		}
	}

	private void makeGUI()
	{
		// Use a gridbag layout
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		setLayout(gridBagLayout);

		JLabel heading = new JLabel("Future Value of an Investment");

		JLabel initialAmountLabel = new JLabel("Principal");
		JLabel yearsLabel = new JLabel("Years");
		JLabel RORLabel = new JLabel("Rate of Return");
		JLabel futureValueLabel = new JLabel("Future Value");
		JLabel compLabel = new JLabel("Compounding Periods per Year");

		futureValueText = new JTextField(10);
		yearsText = new JTextField(10);
		RORText = new JTextField(10);
		compText = new JTextField(10);
		initialAmountText = new JTextField(10);

		// Future value field for display only.
		futureValueText.setEditable(false);

		calculateButton = new JButton("Calculate");

		// Define the grid bag.
		gridBagConstraints.weighty = 1.0;
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.anchor = GridBagConstraints.NORTH;
		gridBagLayout.setConstraints(heading, gridBagConstraints);

		// Anchor most components to the right.
		gridBagConstraints.anchor = GridBagConstraints.EAST;

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(initialAmountLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(initialAmountText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(yearsLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(yearsText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(RORLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(RORText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(compLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(compText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(futureValueLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(futureValueText, gridBagConstraints);

		gridBagConstraints.anchor = GridBagConstraints.CENTER;
		gridBagLayout.setConstraints(calculateButton, gridBagConstraints);

		// Add to content pane.

		add(heading);

		add(initialAmountLabel);
		add(initialAmountText);

		add(yearsLabel);
		add(yearsText);

		add(RORLabel);
		add(RORText);

		add(compLabel);
		add(compText);

		add(futureValueLabel);
		add(futureValueText);

		add(calculateButton);

		// Register to receive action events.
		initialAmountText.addActionListener(this);
		yearsText.addActionListener(this);
		RORText.addActionListener(this);
		compText.addActionListener(this);
		calculateButton.addActionListener(this);

		// Create a number format.
		formatter = NumberFormat.getInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		double result = 0.0;

		String initialAmountString = initialAmountText.getText();
		String yearsString = yearsText.getText();
		String RORString = RORText.getText();
		String compString = compText.getText();

		try
		{
			if ((initialAmountString.length() != 0) && (yearsString.length() != 0) && (RORString.length() != 0) && (compString.length() != 0))
			{
				futureValue.setPrincipal(Double.parseDouble(initialAmountString));
				futureValue.setNumYears(Double.parseDouble(yearsString));
				futureValue.setRateOfInterest(Double.parseDouble(RORString) / 100.0);
				futureValue.setCompPerYear(Integer.parseInt(compString));

				result = futureValue.computeFutureValue();

				futureValueText.setText(formatter.format(result));

				showStatus("");
			}
			else
			{
				showStatus("All fields are necessary.");
				futureValueText.setText("");
			}
		}
		catch (NumberFormatException e)
		{
			showStatus("Invalid Data");
			futureValueText.setText("");
		}
	}
}
