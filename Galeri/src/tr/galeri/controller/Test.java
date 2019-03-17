package tr.galeri.controller;

import java.util.Scanner;

import tr.galeri.model.Galeri;
import tr.galeri.model.Kullanici;
import tr.galeri.model.Musteri;
import tr.galeri.service.Data;
import tr.galeri.service.MusteriService;

public class Test {
	
	public static int musteriIndex=0;
	
	public static int galeriIndex=0;

	public static void main(String[] args) {
		
		MusteriService musteriService=new MusteriService();
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		
		System.out.println("1 :Müþteri Kayýt");
		System.out.println("2 :Galeri Kayýt");
		System.out.println("3 :Kullanýcý Giriþi");
		
		int secim=sc.nextInt();
		
		switch (secim) {
		case 1:musteriKayit(musteriService);break;
		case 2:galeriKayit();break;
		case 3:kullaniciGiris();break;

		default:
			break;
		}
		
		}
	
		
		

	}

	private static void kullaniciGiris() {
		// TODO Auto-generated method stub
		
	}

	private static void galeriKayit() {
		// TODO Auto-generated method stub
		
	}

	private static void musteriKayit(MusteriService musteriService) {


		Musteri musteri =new Musteri();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Müþteri Adý :");
		
		musteri.setAdSoyad(sc.next());
		
		System.out.println("Müþteri Adres :");
		
		musteri.setAdres(sc.next());
		
		musteri.setTelefon("1254654");
		
		System.out.println("Kullanýcý Adý Giriniz :");
		
		Kullanici kullanici=new Kullanici();
		
		kullanici.setKullaniciAdi(sc.next());
		
		System.out.println("Þifre Giriniz :");
		
		kullanici.setSifre(sc.next());
		
		musteri.setKullanici(kullanici);
		
		musteriService.musteriEkle(musteri);
	
		
	
		
	}

}
