package tr.galeri.service;

import tr.galeri.model.Araba;
import tr.galeri.model.Galeri;

public class GaleriService {

	
	
	public void arabaSat(Araba araba)
	{
		
	}
	
	public void arabaKirala(Araba araba)
	{
		
	}
	
	public void arabaListele()
	{
		
	}
	
	public void arabaEkle(Araba araba)
	{
		
	}
	
	public void arabaSil(Araba araba)
	{
		
	}
	
	public void galeriListele()
	{
		
		for(Galeri galeri:Data.galeriler)
		{
			
			System.out.println("----Galeri Listesi----");
			
			System.out.println(galeri.getAd()+" "+galeri.getAdres());
			
			
		}
	}
	
}
