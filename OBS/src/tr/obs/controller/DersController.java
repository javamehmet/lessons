package tr.obs.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import tr.obs.model.Ders;
import tr.obs.service.DersService;

@ManagedBean(name = "dersController")
@ViewScoped
public class DersController implements BaseController<Ders>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Ders ders;

	private DersService dersService;

	private List<Ders> dersListe;

	private boolean selected;

	@PostConstruct
	public void init() {

		ders = new Ders();
		
		dersService = new DersService();

		selected = false;

		dersListe=new ArrayList<Ders>();

		getList();

	
	}

	@Override
	public void ekle() {

		dersService.ekle(ders);

		getList();

		mesaj("Ders Eklendi!");

	}

	@Override
	public void sil() {

		dersService.sil(ders);

		selected = false;

		getList();

		ders = new Ders();

		mesaj("Ders silindi!");

		// TODO Auto-generated method stub

	}

	@Override
	public void guncelle() {

		dersService.guncelle(ders);

		selected = false;

		getList();

		ders = new Ders();

		mesaj("Ders güncellendi!");

	}

	@Override
	public void getList() {

		
		dersListe=dersService.getList();
		if(dersListe==null)
			dersListe=new ArrayList<Ders>();
		
		

	}
	
	public void onRowSelect(int id) {

		ders = dersService.getById(id);
		FacesMessage msg = new FacesMessage("Derrs Id :", String.valueOf(ders.getId()));
		FacesContext.getCurrentInstance().addMessage(null, msg);
		selected = true;

	}

	public Ders getDers() {
		return ders;
	}

	public void setDers(Ders ders) {
		this.ders = ders;
	}

	public List<Ders> getDersListe() {
		return dersListe;
	}

	public void setDersListe(List<Ders> dersListe) {
		this.dersListe = dersListe;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	

}
