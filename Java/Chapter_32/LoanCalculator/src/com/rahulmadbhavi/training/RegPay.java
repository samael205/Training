
package com.rahulmadbhavi.training;

import java.awt.*;
import java.awt.event.*;

import java.text.*;

import javax.swing.*;

public class RegPay extends JApplet implements ActionListener
{
	JTextField principalText;
	JTextField interestRateText;
	JTextField durationText;
	JTextField paymentsPerYearText;
	JTextField installmentAmountText;
	
	JButton calculateButton;

	// Sample Initializer values
	Loan loan = new Loan(1000, 0.09, 5);	

	NumberFormat formatter;

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

	// Set up and initialize the GUI.
	private void makeGUI()
	{
		// Use a gridbag layout.
		GridBagLayout gbag = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(gbag);

		JLabel heading = new JLabel("Compute Loan Payment");

		JLabel principalLabel 			= new JLabel("Principal");
		JLabel interestRateLabel 		= new JLabel("Annual Interest Rate");
		JLabel durationLabel 			= new JLabel("Number of Years");
		JLabel paymentsPerYearLabel 	= new JLabel("Payments Per Year");
		JLabel installmentAmountLabel 	= new JLabel("Installment Amount");

		principalText 			= new JTextField(10);
		interestRateText 		= new JTextField(10);
		durationText 			= new JTextField(10);
		paymentsPerYearText 	= new JTextField(10);
		installmentAmountText 	= new JTextField(10);

		// Installment Amount Field for display only.
		installmentAmountText.setEditable(false);

		calculateButton = new JButton("Calculate");

		// Define the grid bag.
		gbc.weighty = 1.0;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.anchor = GridBagConstraints.NORTH;
		gbag.setConstraints(heading, gbc);

		// Anchor most components to the right.
		gbc.anchor = GridBagConstraints.EAST;

		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbag.setConstraints(principalLabel, gbc);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbag.setConstraints(principalText, gbc);

		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbag.setConstraints(interestRateLabel, gbc);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbag.setConstraints(interestRateText, gbc);
		
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbag.setConstraints(durationLabel, gbc);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbag.setConstraints(durationText, gbc);
		
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbag.setConstraints(paymentsPerYearLabel, gbc);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbag.setConstraints(paymentsPerYearText, gbc);
		
		gbc.gridwidth = GridBagConstraints.RELATIVE;
		gbag.setConstraints(installmentAmountLabel, gbc);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbag.setConstraints(installmentAmountText, gbc);
		
		gbc.anchor = GridBagConstraints.CENTER;
		gbag.setConstraints(calculateButton, gbc);

		// Add the components
		add(heading);

		add(principalLabel);
		add(principalText);

		add(interestRateLabel);
		add(interestRateText);

		add(durationLabel);
		add(durationText);

		add(paymentsPerYearLabel);
		add(paymentsPerYearText);

		add(installmentAmountLabel);
		add(installmentAmountText);

		add(calculateButton);

		// Create a number format.
		formatter = NumberFormat.getInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);

		// Set Initial Values
		principalText.setText(String.valueOf(loan.getPrincipal()));		
		interestRateText.setText(String.valueOf(loan.getInterestRate() * 100));		
		durationText.setText(String.valueOf(loan.getDuration()));		
		paymentsPerYearText.setText(String.valueOf(loan.getPaymentsPerYear()));		
		installmentAmountText.setText(formatter.format(loan.computeInstallment()));		

		// Register to receive action items
		principalText.addActionListener(this);
		interestRateText.addActionListener(this);
		durationText.addActionListener(this);
		paymentsPerYearText.addActionListener(this);
		calculateButton.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae)
	{
		double result = 0.0;

		String principalString 			= principalText.getText();
		String interestRateString 		= interestRateText.getText();
		String durationString 			= durationText.getText();
		String paymentsPerYearString 	= paymentsPerYearText.getText();

		double principal;
		double interestRate;
		double duration;
		int paymentsPerYear;
		double installmentAmount;

		showStatus("");

		try
		{
			if((principalString.length() != 0) &&
				(interestRateString.length() != 0) &&
				(durationString.length() != 0) &&
				(paymentsPerYearString.length() != 0))
			{
				principal = Double.parseDouble(principalString);
				interestRate = Double.parseDouble(interestRateString) / 100.0;
				duration = Double.parseDouble(durationString);
				paymentsPerYear = Integer.parseInt(paymentsPerYearString);

				loan.setPrincipal(principal);
				loan.setInterestRate(interestRate);
				loan.setDuration(duration);
				loan.setPaymentsPerYear(paymentsPerYear);

				if((principal <= 0.0) || (interestRate <= 0) || (duration <= 0) || (paymentsPerYear <=0))
				{
 					showStatus("All values must be positive.");
 					installmentAmountText.setText("");
				}
				else
				{
					result = loan.computeInstallment();
					installmentAmountText.setText(formatter.format(result));
				}
			}
			else
			{
 				showStatus("All fields are required.");
 				installmentAmountText.setText("");
			}
		}
		catch(NumberFormatException e)
		{
			showStatus("Invalid Data.");
			installmentAmountText.setText("");
		}
	}
}