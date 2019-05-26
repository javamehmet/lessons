package tr.obs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import tr.obs.model.Fakulte;
import tr.obs.service.FakulteService;

@ManagedBean(name = "fakulteController")
@SessionScoped
public class FakulteController implements BaseController<Fakulte> {

	private Fakulte fakulte;

	private boolean selected = false;

	private Fakulte selectedFakulte;

	private List<Fakulte> fakulteListesi;

	public FakulteService fakulteService;

	public void ekle() {

		fakulteService.ekle(fakulte);

		FacesMessage msg = new FacesMessage("Mesaj :", "Fakülte Eklendi!");
		FacesContext.getCurrentInstance().addMessage(null, msg);

		getList();
		
	}

	public void sil() {
		// TODO Auto-generated method stub

	}

	public void guncelle() {
		// TODO Auto-generated method stub

	}

	public void getList() {

		fakulteListesi = fakulteService.getList();

		if (fakulteListesi == null)
			fakulteListesi = new ArrayList<Fakulte>();

	}

	public void onRowSelect(int id) {

		fakulte = fakulteService.getById(id);
		FacesMessage msg = new FacesMessage("Fakülte Id :", String.valueOf(fakulte.getId()));
		FacesContext.getCurrentInstance().addMessage(null, msg);
		selected = true;

	}

	public void onRowUnselect(UnselectEvent event) {
		fakulte = (Fakulte) event.getObject();
		FacesMessage msg = new FacesMessage("Fakülte Id :", String.valueOf(fakulte.getId()));
		FacesContext.getCurrentInstance().addMessage(null, msg);
		selected = true;
	}

	@PostConstruct
	public void init() {
		fakulte = new Fakulte();

		fakulteListesi = new ArrayList<Fakulte>();

		fakulteService = new FakulteService();

		selected = false;

		getList();

	}

	public Fakulte getFakulte() {
		return fakulte;
	}

	public void setFakulte(Fakulte fakulte) {
		this.fakulte = fakulte;
	}

	public List<Fakulte> getFakulteListesi() {
		return fakulteListesi;
	}

	public void setFakulteListesi(List<Fakulte> fakulteListesi) {
		this.fakulteListesi = fakulteListesi;
	}

	public FakulteService getFakulteService() {
		return fakulteService;
	}

	public void setFakulteService(FakulteService fakulteService) {
		this.fakulteService = fakulteService;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public Fakulte getSelectedFakulte() {
		return selectedFakulte;
	}

	public void setSelectedFakulte(Fakulte selectedFakulte) {
		this.selectedFakulte = selectedFakulte;
	}

}
