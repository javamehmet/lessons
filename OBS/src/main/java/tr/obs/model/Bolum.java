package tr.obs.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// Veritabanýn tbl_bolum 
@Entity
@Table(name="tbl_bolum")
public class Bolum extends BaseModel{
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fakulte_id") // FK
	private Fakulte fakulte;
	

	public Fakulte getFakulte() {
		return fakulte;
	}

	public void setFakulte(Fakulte fakulte) {
		this.fakulte = fakulte;
	}
	
	

}
