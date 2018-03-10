
package com.rahulmadbhavi.training;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.text.NumberFormat;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class App extends JApplet implements ActionListener
{
	private JTextField		principalText;
	private JTextField		yearsText;
	private JTextField		rateOfReturnText;
	private JTextField		numberOfWithdrawalsText;
	private JTextField		maxWithdrawalText;

	private JButton			calculateButton;

	private double			principal;
	private double			years;
	private double			rateOfReturn;
	private int				numberOfWithdrawals;

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
		catch (InvocationTargetException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	private void makeGUI()
	{
		// Use a grid bag layout
		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		setLayout(gridBagLayout);

		JLabel principalLabel = new JLabel("Original Principal");
		JLabel yearsLabel = new JLabel("Years");
		JLabel rateOfReturnLabel = new JLabel("Rate of Return");
		JLabel numberOfWithdrawalsLabel = new JLabel("Number of Withdrawals per Year");
		JLabel maxWithdrawalLabel = new JLabel("Maximum Withdrawal");

		JLabel heading = new JLabel("Maximum Monthly Withdrawals");

		principalText = new JTextField(10);
		yearsText = new JTextField(10);
		rateOfReturnText = new JTextField(10);
		numberOfWithdrawalsText = new JTextField(10);
		maxWithdrawalText = new JTextField(10);

		// Maximum withdrawal field for display only.
		maxWithdrawalText.setEditable(false);

		calculateButton = new JButton("Calculate");

		// Define the grid bag.
		gridBagConstraints.weighty = 1.0;

		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagConstraints.anchor = GridBagConstraints.NORTH;
		gridBagLayout.setConstraints(heading, gridBagConstraints);

		gridBagConstraints.anchor = GridBagConstraints.EAST;
		
		gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagLayout.setConstraints(principalLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(principalText, gridBagConstraints);

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
		gridBagLayout.setConstraints(maxWithdrawalLabel, gridBagConstraints);
		gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
		gridBagLayout.setConstraints(maxWithdrawalText, gridBagConstraints);

		// Add all the components
		add(heading);

		add(principalLabel);
		add(principalText);

		add(yearsLabel);
		add(yearsText);

		add(rateOfReturnLabel);
		add(rateOfReturnText);

		add(numberOfWithdrawalsLabel);
		add(numberOfWithdrawalsText);

		add(maxWithdrawalLabel);
		add(maxWithdrawalText);

		add(calculateButton);

		// Register to receive action events.
		principalText.addActionListener(this);
		yearsText.addActionListener(this);
		rateOfReturnText.addActionListener(this);
		numberOfWithdrawalsText.addActionListener(this);
		calculateButton.addActionListener(this);

		formatter = NumberFormat.getInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
	}

	@Override
	public void actionPerformed(ActionEvent actionListener)
	{
		String principalString = principalText.getText();
		String yearsString = yearsText.getText();
		String rateOfReturnString = rateOfReturnText.getText();
		String numberOfWithdrawalsString = numberOfWithdrawalsText.getText();
		
		showStatus("");
		maxWithdrawalText.setText("");

		try
		{
			if (principalString.length() != 0 && yearsString.length() != 0 && rateOfReturnString.length() != 0 && numberOfWithdrawalsString.length() != 0)
			{
				principal = Double.parseDouble(principalString);
				years = Double.parseDouble(yearsString);
				rateOfReturn = Double.parseDouble(rateOfReturnString) / 100.0;
				numberOfWithdrawals = Integer.parseInt(numberOfWithdrawalsString);

				if (principal > 0 && years > 0 && rateOfReturn > 0 && numberOfWithdrawals > 0)
				{
					double result = computeMaximumWithdrawal();

					maxWithdrawalText.setText(formatter.format(result));
				}
				else
				{
					showStatus("All values must be positive.");
				}
			}
			else
			{
				showStatus("All fields are required.");
			}
		}
		catch (NumberFormatException exc)
		{
			showStatus("Invalid data.");
		}
	}

	private double computeMaximumWithdrawal()
	{
		double t1 = rateOfReturn / numberOfWithdrawals;
		
		double b = (1 + t1);
		double e = numberOfWithdrawals * years;
		
		double t2 = Math.pow(b, e) - 1; 

		return (principal * (t1/t2 + t1));
	}
}
