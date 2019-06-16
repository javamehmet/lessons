package tr.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_role")
public class Role extends BaseModel{
	
	@Column
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	// tbl_role tablosu yaratýlýr. ýcersýnde ýd,role,createDate,lastUpdate
	
}
