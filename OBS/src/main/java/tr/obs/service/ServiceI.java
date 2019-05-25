package tr.obs.service;

import java.util.List;

public interface ServiceI<T> {
	
	
	void ekle(T t);
	
	void sil(T t);
	
	List<List> getList();
	
	void guncelle(T t);

}
