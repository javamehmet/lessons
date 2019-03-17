package tr.galeri.service;

import tr.galeri.model.Araba;
import tr.galeri.model.Galeri;
import tr.galeri.model.Musteri;

public class Data {

	public static Musteri musteriler[]=new Musteri[1];
	
	public static Galeri galeriler[]=new Galeri[1];
	
	static {
	
	
		Galeri galeri=new Galeri();
		galeri.setAd("Java");
		galeri.setAdres("Ankara");
		galeri.setTelefon("0000000");
		
		Araba araba=new Araba();
		
		araba.setAd("BMW");
		araba.setDurum(false);
		araba.setModel(2018);
		araba.setRenk("Beyaz");
		araba.setKiralamaFiyati(150);
		araba.setSatisFiyati(1500000);
		
		galeri.getArabalar()[0]=araba;
		
		
		galeriler[0]=galeri;
	
	}
	
}
