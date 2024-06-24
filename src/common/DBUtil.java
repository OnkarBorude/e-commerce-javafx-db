package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static Connection connection;
	private static Statement statement;
	static String url = "jdbc:mysql:///ecommerce";
	 static String username = "root";
	 static String password = "@onkar9765";
	
	static {
		try {
			connection=DriverManager.getConnection(url, username, password);
			statement=connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ResultSet selectQuery(String query) throws SQLException {
		ResultSet resultset=statement.executeQuery(query);
		return resultset;
	}
	public static void executeQuery(String query) throws SQLException {
		statement.execute(query);
	}

}
