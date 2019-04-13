import java.util.List;

public class Ogrenci {

	private int id;

	private String adi;

	private String no;

	private String bolum;

	private List<Ders> dersler;

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

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public List<Ders> getDersler() {
		return dersler;
	}

	public void setDersler(List<Ders> dersler) {
		this.dersler = dersler;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		String mesaj = id + ": " + adi + " " + bolum + " " + no +  System.getProperty("line.separator");;

		for (Ders ders : dersler) {
			mesaj += ders +  System.getProperty("line.separator");
		}

		return mesaj;
	}

}
