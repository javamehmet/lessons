package tr.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_ogrenciders")
public class OgrenciDers extends BaseModel{
	
	@ManyToOne
	@JoinColumn(name="ogrenci_id")
	private Ogrenci ogrenci;
	
	@ManyToOne
	@JoinColumn(name="ders_id")
	private Ders ders;
	
	@Column
	private Integer vizeNotu;
	
	@Column
	private Integer finalNotu;

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
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	

}
