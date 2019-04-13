
public class Ders {
	
	private int id;
	
	private String dersAdi;
	
	private int kredi;
	
	private int not;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDersAdi() {
		return dersAdi;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	public int getKredi() {
		return kredi;
	}

	public void setKredi(int kredi) {
		this.kredi = kredi;
	}

	public int getNot() {
		return not;
	}

	public void setNot(int not) {
		this.not = not;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+dersAdi+" "+kredi+" "+not;
	}
	
	

}
