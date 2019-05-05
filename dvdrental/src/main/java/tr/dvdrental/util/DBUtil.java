package tr.dvdrental.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	public Connection connection;

	public void connect() {

		try {

			Class.forName("org.postgresql.Driver");

			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "root");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public Statement getStatement() {
		try {
			return connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public ResultSet getResult(String sql) {

		try {

			return getStatement().executeQuery(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public void disConnect() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
