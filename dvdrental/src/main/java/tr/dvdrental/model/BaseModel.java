package tr.dvdrental.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter // => Anatasyon annotations
@Setter
@AllArgsConstructor
public class BaseModel {

	private int id;

	private Date lastUpdate;

	public BaseModel() {
		// TODO Auto-generated constructor stub
	}

	



}
