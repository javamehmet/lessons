package tr.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_ogrenci")
public class Ogrenci extends BaseModel {

	@Column
	private String soyadi;
	
	@Column
	private int no;
	
	@ManyToOne
	@JoinColumn(name="bolum_id")
	private Bolum bolum;
	
	@Column
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
