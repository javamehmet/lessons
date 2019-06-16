package tr.obs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User extends BaseModel{
	
	@Column(length=20,unique=true) // ayný kullanýcý adýnda kaydedýlemez duplýcate yok!
	private String userName;
	
	@Column(length=8)
	private String password; // password md5 göre hashleyecez sha-1

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// ROLES
	
	
	
}
