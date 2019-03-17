package tr.galeri.model;

public class Galeri {

	private String ad;

	private String adres;

	private String telefon;

	private Araba arabalar[];

	private Kullanici kullanici;
	
	public Galeri() {
		
		
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Araba[] getArabalar() {
		return arabalar;
	}

	public void setArabalar(Araba[] arabalar) {
		this.arabalar = arabalar;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

}
