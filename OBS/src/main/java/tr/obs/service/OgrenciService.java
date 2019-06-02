package tr.obs.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tr.obs.model.Bolum;
import tr.obs.model.Ogrenci;

public class OgrenciService extends DBService implements ServiceI<Ogrenci> {

	private BolumService bolumService;

	public void ekle(Ogrenci t) {

		try {

			getConnection();

			Statement statement = connection.createStatement();

			String sql = "INSERT INTO tbl_ogrenci( " + " adi, soyadi, " + "ogrenci_no, bolum_id," + " sinif )"
					+ " VALUES ('" + t.getAdi() + "','" + t.getSoyadi() + "', " + t.getNo() + "," + t.getBolum().getId()
					+ ", " + t.getSinif() + ") ";

			statement.execute(sql);

			System.out.println("Öðrenci Eklendi!");

		} catch (Exception e) {

			System.out.println(e.getMessage());
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

		List<Ogrenci> liste = new ArrayList<>();

		try {
			bolumService=new BolumService();

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "Select * from tbl_ogrenci";

			ResultSet set = stmt.executeQuery(sql);

			while (set.next()) {

				Ogrenci ogrenci = new Ogrenci();
				
				ogrenci.setId(set.getInt("id"));
				ogrenci.setAdi(set.getString("adi"));
				ogrenci.setSoyadi(set.getString("soyadi"));
				ogrenci.setNo(set.getInt("ogrenci_no"));
				ogrenci.setSinif(set.getInt("sinif"));

				Bolum bolum = bolumService.getById(set.getInt("bolum_id"));

				ogrenci.setBolum(bolum);

				liste.add(ogrenci);

			}

			return liste;

		} catch (Exception e) {

			System.out.println("OgrenciService getList hata:" + e.getMessage());
		}

		return null;
	}

	public void guncelle(Ogrenci t) {
		// TODO Auto-generated method stub

	}

}
