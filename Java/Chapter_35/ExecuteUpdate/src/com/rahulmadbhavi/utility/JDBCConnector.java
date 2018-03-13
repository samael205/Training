
package com.rahulmadbhavi.utility;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCConnector
{
	public static Connection createConnection()
	{
		Connection connection = null;
		
		String serverIP;
		String port;
		String database;
		String user;
		String password;

		String driver;
		String connectionURL;
		
		try
		{
			FileReader reader = new FileReader("db.properties");

			Properties properties = new Properties();
			properties.load(reader);

			serverIP = properties.getProperty("serverIP");
			port = properties.getProperty("port");
			database = properties.getProperty("database");
			user = properties.getProperty("user");
			password = properties.getProperty("password");

			driver = "com.mysql.jdbc.Driver";
			connectionURL = "jdbc:mysql://" + serverIP + ":" + port + "/" + database;
			
			Class.forName(driver);
			connection = DriverManager.getConnection(connectionURL, user, password);
		}
		catch(Exception e)
		{
			System.out.println("Exception : " + e);
		}
		
		return connection;
	}
}
