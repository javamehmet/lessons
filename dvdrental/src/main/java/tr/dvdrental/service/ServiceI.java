package tr.dvdrental.service;

import java.util.List;

public interface ServiceI<T> {

	public T add(T t);
	
	public T update(T t);
	
	public List<T> getList();
	
	public void delete(T t);
	
	public T getModel(int id);
	
	
}
