package tr.obs.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import tr.obs.model.BaseModel;

@SuppressWarnings("unchecked")
public class BaseDao<E extends BaseModel> implements Serializable {

	private static final long serialVersionUID = 1L;

	private Class beType;

	@PersistenceContext(unitName = "Test")
	public transient EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public E getEntity(final Serializable pk) {
		beType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		entityManager = Persistence.createEntityManagerFactory("Test").createEntityManager();
		entityManager.getTransaction().begin(); // statement olusturdu sql kodu
												// bekleme
		E entity = (E) entityManager.find(beType, pk); // select * from
														// tbl_fakulte where
														// id=pk

		// entityManager.merge(entity) // insert and update
		// entityManager.persist(entity); // insert

		// entityManager.remove(entity); // delete

		entityManager.getTransaction().commit();
		if (entity != null) {
			return entity;
		}
		return null;
	}

	/*
	 * 
	 * SELECT name FROM TBL_FAKULTE =>>> SQL
	 * 
	 * SELECT adi VARIABLE FROM CLASS ADI=ENTITY ADI =>> JPQL JPA SQL
	 * 
	 * 
	 * 
	 */

	public List<E> getEntityList() {
		beType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		String query = "SELECT BE FROM " + beType.getSimpleName() + " BE "; // select
																			// *
																			// from
																			// tbl_fakulte
																			// as
																			// fakulte
		entityManager = Persistence.createEntityManagerFactory("Test").createEntityManager();
		entityManager.getTransaction().begin(); // statement olusturdu sql kodu
												// bekleme
		List<E> liste = entityManager.createQuery(query).getResultList();
		entityManager.getTransaction().commit();

		if (liste != null)
			return liste;
		return null;

	}

	public E saveEntity(E baseEntity) {
		beType = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		
		entityManager = Persistence.createEntityManagerFactory("Test").createEntityManager();
		entityManager.getTransaction().begin(); 
		
		entityManager.persist(baseEntity);
		entityManager.flush();
		
		entityManager.getTransaction().commit();
		
		return baseEntity;
	}

}
