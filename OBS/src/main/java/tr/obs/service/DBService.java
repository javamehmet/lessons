package tr.obs.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBService {

	public static String url = "jdbc:postgresql://localhost:5432/obs";

	public static String user = "postgres";

	public static String password = "root";

	public static Connection connection;

	public void getConnection() {

		try {

			if (connection == null) {
				Class.forName("org.postgresql.Driver");

				connection = DriverManager.getConnection(url, user, password);
			}
		} catch (Exception e) {

			System.out.println("Veritabaný baðlantýsýnda problem var!" + e.getMessage());
			// TODO: handle exception
		}

	}

}
