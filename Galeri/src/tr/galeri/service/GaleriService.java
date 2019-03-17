package tr.galeri.service;

import tr.galeri.controller.Test;
import tr.galeri.model.Araba;
import tr.galeri.model.Galeri;

public class GaleriService {

	
	
	public void arabaSat(Araba araba)
	{
		
	}
	
	public void arabaKirala(Galeri galeri,int arabaIndex)
	{
		
		Araba araba=galeri.getArabalar()[arabaIndex];

		if(!araba.isDurum())
		{
		araba.setDurum(true);
		Data.musteriler[Test.musteriIndex].getArabalar()[0]=araba;
		}
		else
		{
			System.out.println("Araba daha önce kiralanmýstýr!");
		}
		
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
		int index=0;
		for(Galeri galeri:Data.galeriler)
		{
			
			System.out.println("----Galeri Listesi----");
			
			System.out.println(index+" "+galeri.getAd()+" "+galeri.getAdres());
			
			index++;
		}
	}
	
}
