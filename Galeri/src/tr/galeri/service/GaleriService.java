package tr.galeri.service;

import tr.galeri.controller.Test;
import tr.galeri.model.Araba;
import tr.galeri.model.Galeri;
import tr.galeri.model.Musteri;

public class GaleriService {
	
	public ArabaService arabaService;
	
	public GaleriService() {
	
		arabaService=new ArabaService();
		// TODO Auto-generated constructor stub
	}

	
	
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
	
		Galeri galeri =Data.galeriler[Test.galeriIndex];
		
		if(galeri.getArabalar()[0]==null)
		{	
			galeri.getArabalar()[0]=araba;
		}
		else
		{
		
		Araba temp [] =galeri.getArabalar();
		
		Araba yeniDizi [] =new Araba[temp.length+1];
		
		galeri.setArabalar(yeniDizi);
		
		for(int i=0;i<temp.length;i++)
		{
			galeri.getArabalar()[i]=temp[i];
		}
		
		galeri.getArabalar()[temp.length]=araba;
		
		
		}
		
		Data.galeriler[Test.galeriIndex]=galeri;
		
		arabaService.arabaListele(Data.galeriler[Test.galeriIndex]);
		
		
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

	public void galeriEkle(Galeri galeri) {


		if(Data.galeriler[0]==null)
		{
			Data.galeriler[0]=galeri;
		}
		else{
			
			Galeri temp [] =Data.galeriler;
			
			Data.galeriler = new Galeri[temp.length+1];
			
			for(int i=0;i<temp.length;i++)
			{
				
				Data.galeriler[i]=temp[i];
			}
			
			Data.galeriler[temp.length]=galeri;
			
		}
		
		
	}
	
}
