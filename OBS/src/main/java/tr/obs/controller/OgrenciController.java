package tr.obs.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import tr.obs.model.Ogrenci;
import tr.obs.service.OgrenciService;

@ManagedBean(name="ogrenciController")
@SessionScoped
public class OgrenciController {

	
	private Ogrenci ogrenci;
	
	private List<Ogrenci> ogrenciListesi;
	
	private OgrenciService ogrenciService;
	
	@PostConstruct
	public void init()
	{
		ogrenci=new Ogrenci();
		ogrenciListesi=new ArrayList<Ogrenci>();
		ogrenciService=new OgrenciService();
	}
	
	public void ekle()
	{
		
		ogrenciListesi.add(ogrenci);
		
		
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
	
	
	
	
	
	
	
	
	
	
	
	
}
