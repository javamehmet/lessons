package tr.galeri.model;

public class Musteri {
	
	private String adSoyad;
	
	private String adres;
	
	private String telefon;
	
	private String mail;
	
	private Araba arabalar[];
	
	private Kullanici kullanici;
	
	public Musteri() {

		arabalar=new Araba[1];
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
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
