package tr.obs.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import tr.obs.model.Bolum;
import tr.obs.model.Fakulte;
import tr.obs.model.Ogrenci;
import tr.obs.service.BolumService;
import tr.obs.service.FakulteService;
import tr.obs.service.OgrenciService;

@ManagedBean(name = "ogrenciController")
@ViewScoped
public class OgrenciController implements BaseController<Ogrenci>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Ogrenci ogrenci;

	private List<Ogrenci> ogrenciListesi;

	private OgrenciService ogrenciService;

	private List<Fakulte> fakulteListesi;

	private List<Bolum> bolumListesi;

	private FakulteService fakulteService;

	private BolumService bolumService;

	private int fakulteId;

	private int bolumId;

	@PostConstruct
	public void init() {
		ogrenci = new Ogrenci();
		ogrenciListesi = new ArrayList<Ogrenci>();
		ogrenciService = new OgrenciService();
		fakulteListesi = new ArrayList<>();
		bolumListesi = new ArrayList<>();
		fakulteService=new FakulteService();
		bolumService=new BolumService();
		
		fakulteListesi = fakulteService.getList();

		bolumListesi = bolumService.getList();
		
		getList();

	}
	
	public void onChange() {
		
		bolumListesi=bolumService.getList();
		bolumListesi=bolumListesi
				.stream()
				.filter((bolum) -> bolum.getFakulte().getId()==fakulteId )
				.collect(Collectors.toList());
		
		
	}

	public void ekle() {
		
		
		Bolum bolum=new Bolum();
		bolum.setId(bolumId);
		ogrenci.setBolum(bolum);
	
		ogrenciService.ekle(ogrenci);
		
		getList();

	}

	@Override
	public void sil() {
		// TODO Auto-generated method stub

	}

	@Override
	public void guncelle() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getList() {


		ogrenciListesi=ogrenciService.getList();
		
		if(ogrenciListesi==null)
			ogrenciListesi=new ArrayList<>();
		

	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public List<Ogrenci> getOgrenciListesi() {
		return ogrenciListesi;
	}

	public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
		this.ogrenciListesi = ogrenciListesi;
	}

	public OgrenciService getOgrenciService() {
		return ogrenciService;
	}

	public void setOgrenciService(OgrenciService ogrenciService) {
		this.ogrenciService = ogrenciService;
	}

	public List<Fakulte> getFakulteListesi() {
		return fakulteListesi;
	}

	public void setFakulteListesi(List<Fakulte> fakulteListesi) {
		this.fakulteListesi = fakulteListesi;
	}

	public List<Bolum> getBolumListesi() {
		return bolumListesi;
	}

	public void setBolumListesi(List<Bolum> bolumListesi) {
		this.bolumListesi = bolumListesi;
	}

	public int getFakulteId() {
		return fakulteId;
	}

	public void setFakulteId(int fakulteId) {
		this.fakulteId = fakulteId;
	}

	public int getBolumId() {
		return bolumId;
	}

	public void setBolumId(int bolumId) {
		this.bolumId = bolumId;
	}

}
