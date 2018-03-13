
package com.rahulmadbhavi.application;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.rahulmadbhavi.utility.JDBCConnector;

public class App
{
	public static void main(String args[])
	{
		Connection connection = JDBCConnector.createConnection();
		
		try
		{
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			
			System.out.println("URL : " + databaseMetaData.getURL());
			System.out.println();

			System.out.println("Keywords : " + databaseMetaData.getSQLKeywords());
			System.out.println();

			System.out.println("Supports Transactions : " + databaseMetaData.supportsTransactions());
			System.out.println();

			System.out.println("Supports Select for Update : " + databaseMetaData.supportsSelectForUpdate());
			System.out.println();
						
			System.out.println("Drive Major Version : " + databaseMetaData.getDriverMajorVersion());
			System.out.println();

			System.out.println("Drive Minor Version : " + databaseMetaData.getDriverMinorVersion());
			System.out.println();

			System.out.println("Product Name : " + databaseMetaData.getDatabaseProductName());
			System.out.println();

			System.out.println("Driver Version : " + databaseMetaData.getDriverVersion());
			System.out.println();

			System.out.println("Database Maximum Connections : " + databaseMetaData.getMaxConnections());
			System.out.println();

			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}					
	}
}
