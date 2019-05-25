package tr.obs.model;

public class Ogrenci extends BaseModel {

	private String soyadi;
	
	private int no;
	
	private Bolum bolum;
	
	private int sinif;

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Bolum getBolum() {
		return bolum;
	}

	public void setBolum(Bolum bolum) {
		this.bolum = bolum;
	}

	public int getSinif() {
		return sinif;
	}

	public void setSinif(int sinif) {
		this.sinif = sinif;
	}
	
	
	
}
