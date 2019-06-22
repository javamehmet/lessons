package tr.obs.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import tr.obs.dao.FakulteDao;
import tr.obs.model.Fakulte;

public class FakulteService implements ServiceI<Fakulte> {
	
	private FakulteDao fakulteDao;
	
	public FakulteService() {
	
		fakulteDao=new FakulteDao();
		// TODO Auto-generated constructor stub
	}

	public void ekle(Fakulte t) {

		fakulteDao.saveEntity(t);
		
	}

	public Fakulte getById(int id) {
		
		
		return fakulteDao.getEntity(id);

	}

	public void sil(Fakulte t) {

	}

	public List<Fakulte> getList() {

		return fakulteDao.getEntityList();
		
	}

	public void guncelle(Fakulte t) {
		
		fakulteDao.saveEntity(t);

	}

}
