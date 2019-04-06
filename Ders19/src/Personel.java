import java.util.List;

public class Personel extends Model{
	
	
	private String personelAdi;
	
	private List<Hesap> hesapListesi;

	public String getPersonelAdi() {
		return personelAdi;
	}

	public void setPersonelAdi(String personelAdi) {
		this.personelAdi = personelAdi;
	}

	public List<Hesap> getHesapListesi() {
		return hesapListesi;
	}

	public void setHesapListesi(List<Hesap> hesapListesi) {
		this.hesapListesi = hesapListesi;
	}
	
	
	

}
