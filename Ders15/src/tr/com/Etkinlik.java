package tr.com;

public class Etkinlik {
	
	private String etkinlikAdi;
	
	private String adres;
	
	private Kullanici etkinlikSahibi;
	
	private String etkinlikTarihi;
	
	
	
	public Etkinlik etkinlikOlustur(String etkinlikAdi,String adres){
		
		Etkinlik etkinlik=new Etkinlik();
		
		etkinlik.setEtkinlikAdi(etkinlikAdi);
		etkinlik.setAdres(adres);
		
		return etkinlik;
	}



	public String getEtkinlikAdi() {
		return etkinlikAdi;
	}



	public void setEtkinlikAdi(String etkinlikAdi) {
		this.etkinlikAdi = etkinlikAdi;
	}



	public String getAdres() {
		return adres;
	}



	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	
	

}
