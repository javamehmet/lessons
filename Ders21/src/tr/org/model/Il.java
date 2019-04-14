package tr.org.model;
import java.util.Arrays;
import java.util.List;

public class Il extends BaseModel {
	
	private List<Ilce> ilceler;

	private int plakaNo;

	public List<Ilce> getIlceler() {
		return ilceler;
	}

	public void setIlceler(List<Ilce> ilceler) {
		this.ilceler = ilceler;
	}

	public int getPlakaNo() {
		return plakaNo;
	}

	public void setPlakaNo(int plakaNo) {
		this.plakaNo = plakaNo;
	}
	
	public List<String> getTitleIl()
	{
		return Arrays.asList("Il Plaka No");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getAdi()+" "+plakaNo;
	}
	
}
