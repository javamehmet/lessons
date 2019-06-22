package tr.obs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import tr.obs.model.Bolum;
import tr.obs.model.Fakulte;
import tr.obs.model.Ogrenci;

public class BolumDao extends BaseDao<Bolum> {
	
	public List<Bolum> getBolumByFakulte(Fakulte fakulte)
	{
		
		
		entityManager = Persistence.createEntityManagerFactory("Test").createEntityManager();
		entityManager.getTransaction().begin(); // statement olusturdu sql kodu
		
		
		TypedQuery<Bolum> query = entityManager.createNamedQuery("bolumByFakulteId", Bolum.class);
		query.setParameter("fakulteId", fakulte.getId());
		
		List<Bolum> liste=query.getResultList();
		
		entityManager.getTransaction().commit();
		
		return liste;
		
		
	}
	
	
	
	
	
	
	
	

}
