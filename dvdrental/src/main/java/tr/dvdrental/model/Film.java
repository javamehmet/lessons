package tr.dvdrental.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Film extends BaseModel {

	private String title;

	private int rentalDuration;

	private Language language;

	private double replacementCost;

	private String fullText;

	public Film() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id :" + getId() + " Title :" + this.title + " ReleaseYear :" + this.rentalDuration + " Language:"
				+ this.language.getName() + " FullText :" + this.fullText;
	}

}
