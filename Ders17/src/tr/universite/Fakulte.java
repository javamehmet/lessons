package tr.universite;

public class Fakulte extends Universite{
	
	public Fakulte() {
	
		System.out.println("Fakülte yaratýldý");
		// TODO Auto-generated constructor stub
	}
	
	public String fakulteAdi;
	
	/**
	 * 
	 * overload
	 */
	
	@Override
	public void bolumAc()
	{
		System.out.println("Bölüm acýldý.");
	}
	
	@Override
	public void sinavYap() {
		System.out.println("Sýnav yap");
	}
	
	

}
