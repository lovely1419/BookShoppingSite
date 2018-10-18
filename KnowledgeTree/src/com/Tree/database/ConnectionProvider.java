package com.Tree.database;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionProvider {
	
	static Connection con=null;
	static Properties prop=null;
	static InputStream inputStream=null;
	static
	{
		try
		{
			inputStream=ConnectionProvider.class.getResourceAsStream("/database.properties");
		prop=new Properties();
		prop.load(inputStream);
		System.out.println(prop.getProperty("driver"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	public static Connection getConnection()
	{
		
		try
		{
		Class.forName(prop.getProperty("driver"));
		con=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user") , prop.getProperty("password"));
	}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		return con;
		
		}

}
