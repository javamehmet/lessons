package tr.universite;

public class Bolum extends Fakulte {

	public Bolum() {

		System.out.println("Bölüm yaratýldý");
		// TODO Auto-generated constructor stub
	}

	public String bolumAdi;

	@Override
	public void bolumAc() {
			System.out.println("Bölüm bölüm acamaz error:404");
	}

	@Override
	public void sinavYap() {

		System.out.println("Bölüm sýnav yaptý");
	}

}
