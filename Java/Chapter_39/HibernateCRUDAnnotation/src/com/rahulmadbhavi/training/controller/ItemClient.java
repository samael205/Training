
package com.rahulmadbhavi.training.controller;

import org.apache.log4j.BasicConfigurator;

import com.rahulmadbhavi.training.daos.ItemDAO;
import com.rahulmadbhavi.training.utility.CommonScanner;
import com.rahulmadbhavi.training.utility.HibernateSessionFactory;

public class ItemClient
{
	public static void main(String args[])
	{
		BasicConfigurator.configure();
		
		// Variables
		Boolean isMenuLooping = true;
		int choice = 0;

		ItemDAO itemDAO = new ItemDAO();

		// Menu
		do
		{

			System.out.println("\nLogistics Application\n");

			System.out.println("1. Add Record");
			System.out.println("2. Modify Record");
			System.out.println("3. Delete Record");
			System.out.println("4. Display One Record");
			System.out.println("5. Display All Records");

			System.out.print("\nChoice : ");
			choice = CommonScanner.getScanner().nextInt();

			System.out.println();

			switch(choice)
			{
				case 1 :
					itemDAO.insert();
					break;

				case 2 :
					itemDAO.update();
					break;

				case 3 :
					itemDAO.delete();
					break;

				case 4 :
					itemDAO.selectOne();
					break;

				case 5 :
					itemDAO.selectAll();
					break;

				default :
					System.out.println("Invalid Selection");
					isMenuLooping = false;
					break;
			}

		} while(isMenuLooping);

		// Close Scanner
		CommonScanner.closeScanner();

		// Close Session Factory
		HibernateSessionFactory.closeSessionFactory();
		
		// Last Message
		System.out.println("Exitting Application");
	}
}
