package org.shahani.ddb.db;

import java.sql.*;
public class DatabaseConnection {
	private static Connection connection;
	static
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			setConnection(DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe","sumeet108","Sumeet7045"));  
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}  
	}
	public static Connection getConnection() {
		return connection;
	}
	public static void setConnection(Connection connection) {
		DatabaseConnection.connection = connection;
	}
	
}
