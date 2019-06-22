package tr.obs.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tr.obs.dao.BolumDao;
import tr.obs.model.Bolum;
import tr.obs.model.Fakulte;

public class BolumService implements ServiceI<Bolum> {

	private BolumDao bolumDao;

	public BolumService() {

		bolumDao = new BolumDao();

	}

	public void ekle(Bolum t) {

		bolumDao.saveEntity(t);

	}

	public void sil(Bolum t) {

	}

	public List<Bolum> getList() {

		return bolumDao.getEntityList(); // fakulte dolu halde getýrecektýr.

	}

	public void guncelle(Bolum t) {

		bolumDao.saveEntity(t);
	}

	public Bolum getById(int id) {

		return bolumDao.getEntity(id);

	}

}
