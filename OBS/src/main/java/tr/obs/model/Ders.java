package tr.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_ders")
public class Ders extends BaseModel{
	
	@Column
	private  int kredi;

	public int getKredi() {
		return kredi;
	}

	public void setKredi(int kredi) {
		this.kredi = kredi;
	}
	
	
	

}
