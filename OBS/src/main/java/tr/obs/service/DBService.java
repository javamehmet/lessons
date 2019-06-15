package tr.obs.service;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



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
	
	
	public static void main(String args[])
	{


		
	 String PERSISTENCE_UNIT_NAME = "Test";	
	 EntityManager entityMgrObj =
			 Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	EntityTransaction transaction = 
			 entityMgrObj.getTransaction();
	
	transaction.begin();
	
	
	
	transaction.commit();
	
	System.out.println("Baþarýlý");
	

		
	}
	
	
	
	
	
	

}
