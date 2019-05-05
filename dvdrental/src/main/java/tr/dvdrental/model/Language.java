package tr.dvdrental.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Language extends BaseModel {

	private String name;

	public Language() {
	}

	public Language(int id, String name, Date lastUpdate) {

		super(id, lastUpdate);
		this.name = name;

	}

	
	
	@Override
	public String toString() {
		return "ID :"+getId()+" Name :"+this.name+" Last Update :"+getLastUpdate();
	}

}
