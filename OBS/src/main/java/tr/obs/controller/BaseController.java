package tr.obs.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public interface BaseController<T> {

	public void ekle();
	
	public void sil();
	
	public void guncelle();
	
	public void getList();
	
	default void mesaj(String mesaj){
		
		FacesMessage msg = new FacesMessage("Mesaj :", mesaj);
		FacesContext.getCurrentInstance().addMessage(null, msg);
		
		
	}
}
