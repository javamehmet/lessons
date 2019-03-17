package tr.galeri.service;

import java.util.Scanner;

import tr.galeri.model.Musteri;

public class MusteriService {

	
	private GaleriService galeriService;
	
	private ArabaService arabaService;
	
	public MusteriService() {
		galeriService=new GaleriService();
		arabaService=new ArabaService();
	}
	
	
	public void arabaKirala()
	{
	
		galeriService.galeriListele();
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Galeri Seçiniz :");
		
		int galeriIndex=sc.nextInt();
		
		arabaService.arabaListele(Data.galeriler[galeriIndex]);
		
		System.out.println("Araba Seçiniz :");
		
		int arabaIndex=sc.nextInt();
		
		galeriService.arabaKirala(Data.galeriler[galeriIndex],arabaIndex);
		
	
	
	}
	
	public void arabaAl()
	{
		
	}
	
	public void arabaIadeEt()
	{
		
	}
	
	public void musteriEkle(Musteri musteri)
	{
		if(Data.musteriler[0]==null)
		{
			Data.musteriler[0]=musteri;
		}
		else{
			
			Musteri temp [] =Data.musteriler;
			
			Data.musteriler = new Musteri[temp.length+1];
			
			for(int i=0;i<temp.length;i++)
			{
				
				Data.musteriler[i]=temp[i];
			}
			
			Data.musteriler[temp.length]=musteri;
			
		}
	}
	
}
