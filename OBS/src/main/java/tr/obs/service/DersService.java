package tr.obs.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tr.obs.model.Ders;
import tr.obs.model.Ders;
import tr.obs.model.Fakulte;

public class DersService extends DBService implements ServiceI<Ders> {

	public void ekle(Ders t) {

		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "INSERT INTO tbl_ders(adi, kredi) VALUES ('" + t.getAdi() + "'," + t.getKredi() + ") ";

			stmt.execute(sql);

			System.out.println("Ders eklendi!");

		} catch (Exception e) {

			System.out.println("Ders ekle hata:" + e.getMessage());

		}

		// TODO Auto-generated method stub

	}

	public void sil(Ders t) {
		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "delete from tbl_ders where id=" + t.getId();

			stmt.execute(sql);

			System.out.println("Ders silindi!");

		} catch (Exception e) {

			System.out.println("Ders sil hata:" + e.getMessage());
			// TODO: handle exception
		}

	}

	public List<Ders> getList() {

		List<Ders> liste = new ArrayList<Ders>();

		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "select * from tbl_ders";

			ResultSet set = stmt.executeQuery(sql);

			while (set.next()) {

				Ders ders = new Ders();

				ders.setId(set.getInt("id"));
				ders.setAdi(set.getString("adi"));
				ders.setKredi(set.getInt("kredi"));

				liste.add(ders);

			}

			return liste;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	public void guncelle(Ders t) {

		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "update tbl_ders set adi='" + t.getAdi() + "' ,kredi=" + t.getKredi() + " where id="
					+ t.getId();

			stmt.execute(sql);

			System.out.println("Ders güncellendi!");

		} catch (Exception e) {
			System.out.println("Ders güncelle hata:" + e.getMessage());
			// TODO: handle exception
		}

	}

	public Ders getById(int id) {

		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "Select * from tbl_ders where id=" + id;

			ResultSet set = stmt.executeQuery(sql);

			Ders ders = new Ders();

			while (set.next()) {
				ders.setAdi(set.getString("adi"));
				ders.setId(set.getInt("id"));
				ders.setKredi(set.getInt("kredi"));

			}

			return ders;

		} catch (Exception e) {
			System.out.println("Ders getById hata:" + e.getMessage());
		}

		return null;

	}

}
