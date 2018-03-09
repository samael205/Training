
package com.rahulmadbhavi.training;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class InitialInvestment extends JApplet implements ActionListener
{
	private JTextField		futureValueText;
	private JTextField		numYearsText;
	private JTextField		rateOfReturnText;
	private JTextField		compPerYearText;
	private JTextField		initialAmountText;

	private NumberFormat	formatter;

	private PresentValue	presentValue	= new PresentValue(5000, 20, 6, 12);

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
		// Use a grid bag layout.
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		setLayout(gridBagLayout);

		JLabel heading = new JLabel("Initial Value Calculator");

		JLabel futureValueLabel = new JLabel("Desired Future Value");
		JLabel numYearsLabel = new JLabel("Number of Years");
		JLabel rateOfReturnLabel = new JLabel("Rate of Return");
		JLabel compPerYearLabel = new JLabel("Compounding periods per Year");
		JLabel initialAmountLabel = new JLabel("Initial Investment Required");

		JButton calculateButton = new JButton("Calculate");

		futureValueText = new JTextField(10);
		numYearsText = new JTextField(10);
		rateOfReturnText = new JTextField(10);
		compPerYearText = new JTextField(10);
		initialAmountText = new JTextField(10);

		// Initial value field is non editable
		initialAmountText.setEditable(false);

		// Define the grid bag.
		gridBagConstraints.weighty = 1.0;

		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.anchor = GridBagConstraints.NORTH;
		gridBagLayout.setConstraints(heading, gridBagConstraints);

		// Anchor most components to the right.
		gridBagConstraints.anchor = GridBagConstraints.EAST;

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(futureValueLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(futureValueText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(numYearsLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(numYearsText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(rateOfReturnLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(rateOfReturnText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(compPerYearLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(compPerYearText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(initialAmountLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(initialAmountText, gridBagConstraints);

		gridBagConstraints.anchor = GridBagConstraints.CENTER;
		gridBagLayout.setConstraints(calculateButton, gridBagConstraints);

		// Add all the components
		add(heading);

		add(futureValueLabel);
		add(futureValueText);

		add(numYearsLabel);
		add(numYearsText);

		add(rateOfReturnLabel);
		add(rateOfReturnText);

		add(compPerYearLabel);
		add(compPerYearText);

		add(initialAmountLabel);
		add(initialAmountText);

		add(calculateButton);

		// Register to receive action events
		futureValueText.addActionListener(this);
		numYearsText.addActionListener(this);
		rateOfReturnText.addActionListener(this);
		compPerYearText.addActionListener(this);
		calculateButton.addActionListener(this);

		// Create a number format
		formatter = NumberFormat.getInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		double result = 0.0;

		String futureValueString = futureValueText.getText();
		String numYearsString = numYearsText.getText();
		String rateOfReturnString = rateOfReturnText.getText();
		String compPerYearString = compPerYearText.getText();

		showStatus("");
		initialAmountText.setText("");

		try
		{
			if (futureValueString.length() != 0 && numYearsString.length() != 0 && rateOfReturnString.length() != 0 && compPerYearString.length() != 0)
			{
				double futureValue = Double.parseDouble(futureValueString);
				double numYears = Double.parseDouble(numYearsString);
				double rateOfReturn = Double.parseDouble(rateOfReturnString) / 100.0;
				int compPerYear = Integer.parseInt(compPerYearString);

				presentValue.setFutureValue(futureValue);
				presentValue.setNumYears(numYears);
				presentValue.setRateOfReturn(rateOfReturn);
				presentValue.setCompPerYear(compPerYear);

				if (futureValue > 0 && numYears > 0 && rateOfReturn > 0 && compPerYear > 0)
				{
					result = presentValue.computePresentValue();

					initialAmountText.setText(formatter.format(result));
				}
				else
				{
					showStatus("Values must be positive.");
				}
			}
			else
			{
				showStatus("All fields required.");
			}
		}
		catch (NumberFormatException exc)
		{
			showStatus("Invalid Data.");
		}
	}
}
