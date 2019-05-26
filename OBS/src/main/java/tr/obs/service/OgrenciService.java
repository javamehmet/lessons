package tr.obs.service;

import java.sql.Statement;
import java.util.List;

import tr.obs.model.Ogrenci;

public class OgrenciService extends DBService implements ServiceI<Ogrenci>{

	public void ekle(Ogrenci t) {

		try {
			
		
		getConnection();
		
		Statement  statement=connection.createStatement();
		
		String sql="INSERT INTO tbl_ogrenci( "
            +" adi, soyadi, ogrenci_no, bolum_ýd, sinif, last_update, " 
            +" create_date) VALUES (?, ?, ?, ?, ?, ?, ?) ";
		
		
		
		
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

	public void sil(Ogrenci t) {
		// TODO Auto-generated method stub
		
	}
	
	

	public Ogrenci getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ogrenci> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	public void guncelle(Ogrenci t) {
		// TODO Auto-generated method stub
		
	}
	
	

}
