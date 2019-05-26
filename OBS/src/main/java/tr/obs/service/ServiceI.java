package tr.obs.service;

import java.util.List;

public interface ServiceI<T> {
	
	
	void ekle(T t);
	
	void sil(T t);
	
	List<T> getList();
	
	void guncelle(T t);
	
	T getById(int id);

}
