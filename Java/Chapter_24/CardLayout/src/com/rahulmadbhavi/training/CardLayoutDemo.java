
package com.rahulmadbhavi.training;

import java.applet.Applet;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CardLayoutDemo extends Applet implements ActionListener, MouseListener
{
	Checkbox	winXP, winVista, solaris, mac;
	Panel		osCards;
	CardLayout	cardLayout;
	Button		win, other;

	public void init()
	{
		win = new Button("Windows");
		other = new Button("Other");

		add(win);
		add(other);

		cardLayout = new CardLayout();
		osCards = new Panel();
		osCards.setLayout(cardLayout);

		winXP = new Checkbox("Windows XP", null, true);
		winVista = new Checkbox("Windows Vista");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("Mac OS");

		// Add windows check boxes to a panel
		Panel winPanel = new Panel();
		winPanel.add(winXP);
		winPanel.add(winVista);

		// Add other OS Checkboxes to a panel
		Panel otherPanel = new Panel();
		otherPanel.add(solaris);
		otherPanel.add(mac);

		// Add Panels to card deck panel
		osCards.add(winPanel, "Windows");
		osCards.add(otherPanel, "Other");

		// Add cards to main applet panel
		add(osCards);

		// Register to receive action events
		win.addActionListener(this);
		other.addActionListener(this);

		// Register mouse events
		addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent)
	{
		if(actionEvent.getSource() == win)
		{
			cardLayout.show(osCards, "Windows");
		}
		else
		{
			cardLayout.show(osCards, "Other");
		}
	}

	@Override
	public void mousePressed(MouseEvent mouseEvent)
	{
		cardLayout.next(osCards);
	}

	// Empty Implementations

	@Override
	public void mouseReleased(MouseEvent mouseEvent)
	{
	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent)
	{
	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent)
	{
	}

	@Override
	public void mouseExited(MouseEvent mouseEvent)
	{
	}
}
