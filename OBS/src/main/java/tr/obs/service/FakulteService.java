package tr.obs.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tr.obs.model.Fakulte;

public class FakulteService extends DBService implements ServiceI<Fakulte> {

	public void ekle(Fakulte t) {

		try {

			getConnection();

			Statement statement = connection.createStatement();

			String sql = "insert into tbl_fakulte(adi) values('" + t.getAdi() + "')";

			statement.executeQuery(sql);

		} catch (Exception e) {
			System.out.println("FakulteService:ekle Hata:"+e.getMessage());
		}



	}
	
	

	public Fakulte getById(int id) {
		
		try {
			
			getConnection();
			
			Statement stmt=connection.createStatement();
			
			String sql="Select * from tbl_fakulte where id="+id;
			
			ResultSet set=stmt.executeQuery(sql);
			
			Fakulte fakulte=new Fakulte();
			
			while(set.next())
			{
				fakulte.setAdi(set.getString("adi"));
				fakulte.setId(set.getInt("id"));
			}
			
			return fakulte;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}



	public void sil(Fakulte t) {
		// TODO Auto-generated method stub

	}

	public List<Fakulte> getList() {


		try {
			
			getConnection();
			
			Statement stmt=connection.createStatement();
			
			String sql="select * from tbl_fakulte";
			
			ResultSet set=stmt.executeQuery(sql);
			
			List<Fakulte> liste=new ArrayList<Fakulte>();
			
			
			while(set.next())
			{
				Fakulte fakulte=new Fakulte();
				
				fakulte.setId(set.getInt("id"));
				fakulte.setAdi(set.getString("adi"));
				
				liste.add(fakulte);
				
			}
			
			return liste;
			
			
		} catch (Exception e) {
			System.out.println("FakulteService:getList Hata:"+e.getMessage());
		}
		
		
		return null;
	}

	public void guncelle(Fakulte t) {
		// TODO Auto-generated method stub

	}

}
