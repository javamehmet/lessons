package tr.obs.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import tr.obs.dao.BolumDao;
import tr.obs.dao.FakulteDao;
import tr.obs.model.Bolum;
import tr.obs.model.Ders;
import tr.obs.model.Fakulte;



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
		
		//FakulteDao fakulteDao=new FakulteDao();
		
		//Fakulte fakulte=fakulteDao.getEntity(2);
		
		//System.out.println(fakulte.getAdi());
		
		//List<Fakulte> liste=fakulteDao.getEntityList();

		
		List<Bolum> liste2=new BolumDao().getEntityList();
		

/*		
	 String PERSISTENCE_UNIT_NAME = "Test";	
	 EntityManager entityMgrObj =
			 Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	EntityTransaction transaction = 
			 entityMgrObj.getTransaction();
	
	transaction.begin();
	
	
	Ders ders=new Ders();
	
	ders.setAdi("Türkce");
	ders.setKredi(2);
	
	entityMgrObj.persist(ders); // insert into tbl_Ders  persist => insert yapma -> objeyi insert yaptýktan id?=?   id setlenmiþ halde verecektir.
	
	
	
	
	Fakulte fakulte=new Fakulte();
	fakulte.setAdi("Mühendislik");
	
	entityMgrObj.persist(fakulte);
	
	Bolum bolum=new Bolum();
	bolum.setAdi("Bilgisayar Mühendisliði");
	bolum.setFakulte(fakulte);
	
	entityMgrObj.persist(bolum);
	
	
	Bolum bolum2=entityMgrObj.find(Bolum.class,bolum.getId());
	
	System.out.println(bolum2.getFakulte().getAdi());
	
	transaction.commit();
	
	System.out.println("Baþarýlý");
	
	*/
	

		
	}
	
	
	
	
	
	

}
