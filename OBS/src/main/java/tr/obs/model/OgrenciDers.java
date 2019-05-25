package tr.obs.model;

public class OgrenciDers extends BaseModel{
	
	private Ogrenci ogrenci;
	
	private Ders ders;
	
	private int vizeNotu;
	
	private int finalNotu;

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

	public Ders getDers() {
		return ders;
	}

	public void setDers(Ders ders) {
		this.ders = ders;
	}

	public int getVizeNotu() {
		return vizeNotu;
	}

	public void setVizeNotu(int vizeNotu) {
		this.vizeNotu = vizeNotu;
	}

	public int getFinalNotu() {
		return finalNotu;
	}

	public void setFinalNotu(int finalNotu) {
		this.finalNotu = finalNotu;
	}
	
	
	

}
