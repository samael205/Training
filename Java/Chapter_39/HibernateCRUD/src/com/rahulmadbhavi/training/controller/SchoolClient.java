
package com.rahulmadbhavi.training.controller;

import org.apache.log4j.BasicConfigurator;

import com.rahulmadbhavi.training.daos.SchoolDAO;
import com.rahulmadbhavi.training.utility.CommonScanner;

public class SchoolClient
{
	public static void main(String[] args)
	{
		BasicConfigurator.configure();
		
		boolean ifMenuLoop = true;
		int choice = 0;

		SchoolDAO schoolDAO;

		do
		{
			System.out.println("\n\nSchool Data");

			System.out.println("1. Add Record");
			System.out.println("2. Modify Record");
			System.out.println("3. Delete Records");
			System.out.println("4. Display One Record");
			System.out.println("5. Display All Records");
			System.out.print("\nChoice : ");

			schoolDAO = new SchoolDAO();

			choice = CommonScanner.getScanner().nextInt();

			switch(choice)
			{
				case 1 :
					schoolDAO.insert();
					break;
				case 2 :
					schoolDAO.update();
					break;
				case 3 :
					schoolDAO.delete();
					break;
				case 4 :
					schoolDAO.selectOne();
					break;
				case 5 :
					schoolDAO.selectAll();
					break;
				case 6 :
					ifMenuLoop = false;
					break;
				default :
					System.out.println("Invalid Selection : Enter 1 or 2 or 3 or 4 or 5 or 6 for exit");
					ifMenuLoop = false;
			}

		} while(ifMenuLoop);

		CommonScanner.closeScanner();
		
		System.out.println("Exiting Application");
	}
}
