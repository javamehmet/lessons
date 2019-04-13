package tr.org.model;

import java.util.Arrays;
import java.util.List;

public class BaseModel {

	private String id;
	
	private String adi;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	
	public  List<String> getTitles()
	{
		return Arrays.asList("ID","ADI");
	}
	
	
	
}
