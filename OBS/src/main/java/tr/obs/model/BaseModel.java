package tr.obs.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public class BaseModel {

	@Id // PK
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	// Primary Key
	@Column
	private String adi;

	@Column
	private Date lastUpdate;

	@Column
	private Date createDate;

	@PrePersist
	public void prePersist() {
		createDate = new Date();  // Ýlk kayýtta create new Date;
		lastUpdate=new Date();
		
		//todo Hangi kullanýcý olusturdu onu eklinecek
	}

	@PreUpdate
	public void preUpdate() {
		lastUpdate=new Date();
		// todo kullanýcý bilgisi eklenecek
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
