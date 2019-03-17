package tr.galeri.service;

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
		
		galeriler[0]=galeri;
	
	}
	
}
