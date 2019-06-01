package tr.obs.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tr.obs.model.Bolum;
import tr.obs.model.Fakulte;

public class BolumService extends DBService implements ServiceI<Bolum> {

	private FakulteService fakulteService;

	public void ekle(Bolum t) {

		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "INSERT INTO tbl_bolum(adi, fakulte_id) VALUES ('" + t.getAdi() + "'," + t.getFakulte().getId()
					+ ") ";

			stmt.execute(sql);

			System.out.println("Bolum eklendi!");

		} catch (Exception e) {

			System.out.println("Bolum ekle hata:" + e.getMessage());

		}

		// TODO Auto-generated method stub

	}

	public void sil(Bolum t) {
		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "delete from tbl_bolum where id=" + t.getId();

			stmt.execute(sql);

			System.out.println("Bölüm silindi!");

		} catch (Exception e) {

			System.out.println("Bölüm sil hata:" + e.getMessage());
			// TODO: handle exception
		}

	}

	public List<Bolum> getList() {

		List<Bolum> liste = new ArrayList<Bolum>();

		fakulteService = new FakulteService();

		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "select * from tbl_bolum";

			ResultSet set = stmt.executeQuery(sql);

			while (set.next()) {

				Bolum bolum = new Bolum();

				bolum.setId(set.getInt("id"));
				bolum.setAdi(set.getString("adi"));

				int fakulteId = set.getInt("fakulte_id");

				Fakulte fakulte = fakulteService.getById(fakulteId);

				bolum.setFakulte(fakulte);

				liste.add(bolum);

			}

			return liste;

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

	public void guncelle(Bolum t) {

		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "update tbl_bolum set adi='" + t.getAdi() + "' ,fakulte_id=" + t.getFakulte().getId()
					+ " where id=" + t.getId();

			stmt.execute(sql);

			System.out.println("Bölüm güncellendi!");

		} catch (Exception e) {
			System.out.println("Bölüm güncelle hata:" + e.getMessage());
			// TODO: handle exception
		}

	}

	public Bolum getById(int id) {

		try {

			getConnection();

			Statement stmt = connection.createStatement();

			String sql = "Select * from tbl_bolum where id=" + id;

			ResultSet set = stmt.executeQuery(sql);

			Bolum bolum = new Bolum();

			while (set.next()) {
				bolum.setAdi(set.getString("adi"));
				bolum.setId(set.getInt("id"));
				
				Fakulte fakulte=fakulteService.getById(set.getInt("fakulte_id"));
				
				bolum.setFakulte(fakulte);
				
			}

			return bolum;

		} catch (Exception e) {
			System.out.println("Bolum getById hata:"+e.getMessage());
		}

		return null;

	}

}
