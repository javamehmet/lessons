package tr.obs.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import tr.obs.model.Bolum;
import tr.obs.model.Fakulte;
import tr.obs.service.BolumService;
import tr.obs.service.FakulteService;


@ManagedBean(name="bolumController")
@ViewScoped
public class BolumController implements BaseController<Bolum>, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Bolum bolum;
	
	private List<Bolum> bolumListe;
	
	private BolumService bolumService;
	
	private FakulteService fakulteService;
	
	private boolean selected;
	
	private List<Fakulte> fakulteListesi;
	
	private int fakulteId;
	
	@PostConstruct
	public void init()
	{
		bolum=new Bolum();
		bolumListe=new ArrayList<Bolum>();
		bolumService=new BolumService();
		selected=false;
		fakulteListesi=new ArrayList<Fakulte>();
		fakulteService=new FakulteService();
		fakulteListesi=fakulteService.getList();
		getList();
		
	}
	
	public void iptal()
	{
		selected=false;
		bolum=new Bolum();
	}
	
	public void ekle() {
		
		
		Fakulte fakulte=new Fakulte();
		fakulte.setId(fakulteId);
		
		bolum.setFakulte(fakulte);
			
		bolumService.ekle(bolum);
		
		mesaj("Bölüm eklendi :"+bolum.getAdi());
		
		iptal();
		
		getList();
		
		
	}

	public void sil() {

			bolumService.sil(bolum);
			mesaj("Bölüm Silindi!");
			iptal();
			getList();
		
	}

	public void guncelle() {
		
		bolumService.guncelle(bolum);
		mesaj("Bölüm güncellendi!");
		iptal();
		getList();
		
	}

	public void getList() {
		bolumListe=bolumService.getList();
		
		if(bolumListe==null)
			bolumListe=new ArrayList<>();
		
		
	}
	
	public void onRowSelect(int id) {

		bolum = bolumService.getById(id);
		FacesMessage msg = new FacesMessage("Bolum Id :", String.valueOf(bolum.getId()));
		FacesContext.getCurrentInstance().addMessage(null, msg);
		selected = true;

	}

	public Bolum getBolum() {
		return bolum;
	}

	public void setBolum(Bolum bolum) {
		this.bolum = bolum;
	}

	public List<Bolum> getBolumListe() {
		return bolumListe;
	}

	public void setBolumListe(List<Bolum> bolumListe) {
		this.bolumListe = bolumListe;
	}

	public BolumService getBolumService() {
		return bolumService;
	}

	public void setBolumService(BolumService bolumService) {
		this.bolumService = bolumService;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public List<Fakulte> getFakulteListesi() {
		return fakulteListesi;
	}

	public void setFakulteListesi(List<Fakulte> fakulteListesi) {
		this.fakulteListesi = fakulteListesi;
	}

	public int getFakulteId() {
		return fakulteId;
	}

	public void setFakulteId(int fakulteId) {
		this.fakulteId = fakulteId;
	}
	
	
	
}
