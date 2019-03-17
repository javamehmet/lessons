package tr.galeri.model;

public class Araba {
	
	private String ad;
	
	private int model;
	
	private String renk;
	
	private double kiralamaFiyati;
	
	private double satisFiyati;
	
	private boolean durum;
	
	public Araba() {

	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public double getKiralamaFiyati() {
		return kiralamaFiyati;
	}

	public void setKiralamaFiyati(double kiralamaFiyati) {
		this.kiralamaFiyati = kiralamaFiyati;
	}

	public double getSatisFiyati() {
		return satisFiyati;
	}

	public void setSatisFiyati(double satisFiyati) {
		this.satisFiyati = satisFiyati;
	}

	public boolean isDurum() {
		return durum;
	}

	public void setDurum(boolean durum) {
		this.durum = durum;
	}
	
	

}
