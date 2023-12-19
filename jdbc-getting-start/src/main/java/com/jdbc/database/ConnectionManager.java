package com.jdbc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionManager {
	
	String PASS = "admin";	
	String USER = "root";
	String URL = "jdbc:mysql://localhost:3306/location_db";

	Connection getConnection() throws SQLException;
	
	public static ConnectionManager getInstance() {
		return ()-> DriverManager.getConnection(URL,USER,PASS);
		
	}

}
