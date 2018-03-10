
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

public class App extends JApplet implements ActionListener
{
	JTextField		withdrawalAmountText;
	JTextField		yearsText;
	JTextField		rateOfReturnText;
	JTextField		numberOfWithdrawalsText;
	JTextField		initialInvestmentText;

	JButton			calculateButton;

	NumberFormat	formatter;

	Annuity			annuity	= new Annuity(5000, 20, 6, 12);

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
		// Use a grid bag layout
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		setLayout(gridBagLayout);

		JLabel heading = new JLabel("Initial Investment Required for Regular Withdrawals");

		JLabel withdrawalAmountLabel = new JLabel("Desired withdrawal");
		JLabel yearsLabel = new JLabel("Number of Years");
		JLabel rateOfReturnLabel = new JLabel("Rate of Return");
		JLabel numberOfWithdrawalsLabel = new JLabel("Number of Withdrawals per Year");
		JLabel initialInvestmentLabel = new JLabel("Initial Investment");

		withdrawalAmountText = new JTextField(10);
		yearsText = new JTextField(10);
		rateOfReturnText = new JTextField(10);
		numberOfWithdrawalsText = new JTextField(10);
		initialInvestmentText = new JTextField(10);

		// Initial investment field for display only
		initialInvestmentText.setEditable(false);

		calculateButton = new JButton("Calculate");

		// Define the grid bag
		gridBagConstraints.weighty = 1.0;

		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.anchor = GridBagConstraints.NORTH;
		gridBagLayout.setConstraints(heading, gridBagConstraints);

		gridBagConstraints.anchor = GridBagConstraints.EAST;

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(withdrawalAmountLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(withdrawalAmountText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(yearsLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(yearsText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(rateOfReturnLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(rateOfReturnText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(numberOfWithdrawalsLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(numberOfWithdrawalsText, gridBagConstraints);

		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(initialInvestmentLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(initialInvestmentText, gridBagConstraints);

		gridBagConstraints.anchor = GridBagConstraints.CENTER;
		gridBagLayout.setConstraints(calculateButton, gridBagConstraints);

		// Add all the components.
		add(heading);

		add(withdrawalAmountLabel);
		add(withdrawalAmountText);

		add(yearsLabel);
		add(yearsText);

		add(rateOfReturnLabel);
		add(rateOfReturnText);

		add(numberOfWithdrawalsLabel);
		add(numberOfWithdrawalsText);

		add(initialInvestmentLabel);
		add(initialInvestmentText);

		add(calculateButton);

		// Register to receive text field action events.
		withdrawalAmountText.addActionListener((this));
		yearsText.addActionListener(this);
		rateOfReturnText.addActionListener(this);
		numberOfWithdrawalsText.addActionListener(this);
		calculateButton.addActionListener(this);

		// Create a number formatter
		formatter = NumberFormat.getInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String withdrawalAmountString = withdrawalAmountText.getText();
		String yearsString = yearsText.getText();
		String rateOfReturnString = rateOfReturnText.getText();
		String numberOfWithdrawalsString = numberOfWithdrawalsText.getText();

		showStatus("");
		initialInvestmentText.setText("");

		try
		{
			if (withdrawalAmountString.length() != 0 && yearsString.length() != 0 && rateOfReturnString.length() != 0 && numberOfWithdrawalsString.length() != 0)
			{
				double withdrawalAmount = Double.parseDouble(withdrawalAmountString);
				double years = Double.parseDouble(yearsString);
				double rateOfReturn = Double.parseDouble(rateOfReturnString) / 100.0;
				int numberOfWithdrawal = Integer.parseInt(numberOfWithdrawalsString);

				if (withdrawalAmount > 0 && years > 0 && rateOfReturn > 0 && numberOfWithdrawal > 0)
				{					
					annuity.setWithdrawalAmount(withdrawalAmount);
					annuity.setYears(years);
					annuity.setRateOfReturn(rateOfReturn);
					annuity.setNumberOfWithdrawals(numberOfWithdrawal);
					
					double result = annuity.calculateInitialInvestment();
					
					initialInvestmentText.setText(formatter.format(result));
				}
				else
				{
					showStatus("All values must be positive.");
				}
			}
			else
			{
				showStatus("All fields are necessary");
			}
		}
		catch (NumberFormatException exc)
		{
			showStatus("Invalid Data");
		}
	}
}
