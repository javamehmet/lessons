package tr.com;

import java.util.Scanner;

public class Kullanici {
	
	private String adSoyad;
	
	private String email;
	
	private String telefon;
	
	private String dogumTarihi;
	
	private String adres;
	
	private Etkinlik etkinlikler[];
	
	public Kullanici() {


		etkinlikler=new Etkinlik[1];
	
	
	}
	
	public void etkinlikEkle()
	{
		
		
		if(etkinlikler[0]==null)
		{
			System.out.println("if girdi");
			
			Scanner sc=new Scanner(System.in);
			
			Etkinlik etkinlik=new Etkinlik();
			
			System.out.println("Etkinlik Adýný giriniz :");
			
			etkinlik.setEtkinlikAdi(sc.next());
			
			this.etkinlikler[0]=etkinlik;
		}
		
		else {
			
			System.out.println("else girdi");
			
			Etkinlik temp [] =etkinlikler;
			
			etkinlikler =new Etkinlik[etkinlikler.length+1];
			
			for(int i=0;i<temp.length;i++)
			{
				etkinlikler[i]=temp[i];
			}

			Scanner sc=new Scanner(System.in);
			
			Etkinlik etkinlik=new Etkinlik();
			
			System.out.println("Etkinlik Adýný giriniz :");
			
			etkinlik.setEtkinlikAdi(sc.next());
			
			etkinlikler[temp.length]=etkinlik;
			
		
		}
		
		
		
	}
	
	public void etkinlikSi()
	{
		
	}
	
	public void etkinlikleriYazdir()
	{
		for(Etkinlik etkinlik:etkinlikler)
		{
			System.out.println(etkinlik.getEtkinlikAdi());
		}
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public Etkinlik[] getEtkinlikler() {
		return etkinlikler;
	}

	public void setEtkinlikler(Etkinlik[] etkinlikler) {
		this.etkinlikler = etkinlikler;
	}
	
	

}
