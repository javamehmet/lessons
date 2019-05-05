package tr.dvdrental.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Category extends Language {

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(int id, String name, Date lastUpdate) {
		super(id, name, lastUpdate);
	}
	
	
	@Override
	public String toString() {
		return "ID :"+getId()+" Name :"+getName()+" LastUpdate :"+getLastUpdate();
	}

}
