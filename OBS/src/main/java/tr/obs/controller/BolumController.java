package tr.obs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import tr.obs.model.Bolum;
import tr.obs.model.Fakulte;
import tr.obs.service.BolumService;
import tr.obs.service.FakulteService;


@ManagedBean(name="bolumController")
@RequestScoped
public class BolumController implements BaseController<Bolum>{

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
		
	}

	public void ekle() {
		// TODO Auto-generated method stub
		
	}

	public void sil() {
		// TODO Auto-generated method stub
		
	}

	public void guncelle() {
		// TODO Auto-generated method stub
		
	}

	public void getList() {
		// TODO Auto-generated method stub
		
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
