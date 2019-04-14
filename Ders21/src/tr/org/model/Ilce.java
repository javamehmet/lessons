package tr.org.model;
public class Ilce extends BaseModel{

	private int ilId;

	public int getIlId() {
		return ilId;
	}

	public void setIlId(int ilId) {
		this.ilId = ilId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getAdi()+" il id:"+ilId;
	}
	
}
