package com.jdbc.database;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MyFirstDao {

	private static String SQL = "select count(*) from state";

	public long getCourseCount() {

		try (var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/location_db", "root", "admin");
				var statement = connection.createStatement()) {

			var resultSet = statement.executeQuery(SQL);

			while (resultSet.next()) {
				return resultSet.getLong(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}

}
