package tr.com;

import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Kullanici Sayisini giriniz :");
		
		int kullaniciSayisi=sc.nextInt();
		
		Kullanici kullanicilar[]=new Kullanici[kullaniciSayisi];
		
		
		for(int i=0;i<kullaniciSayisi;i++)
		{
			Kullanici kullanici=new Kullanici();
			
			System.out.println("Kullanýcý adý giriniz :");
			
			kullanici.setAdSoyad(sc.next());
			
			System.out.println("Kullanýcý Email giriniz :");
			
			kullanici.setEmail(sc.next());
			
			System.out.println("Kullanýcý Telefon giriniz :");
			
			kullanici.setTelefon(sc.next());
			
			System.out.println("Kullanýcý Adres giriniz :");
			
			kullanici.setAdres(sc.next());
			
	
			kullanicilar[i]=kullanici;
			
		}
		
		while(true)
		{
			
			System.out.println("---------Menü-----------");
			System.out.println("1 : Etkinlik Ekle");
			System.out.println("2 : Etklink Sil");
			System.out.println("3 : Etkinlik Ara");
			
			int menu=sc.nextInt();
			
			switch (menu) {
			case 1:kullanicilar[0].etkinlikEkle();break;
			case 2:etkinlikSil(kullanicilar[0]);break;
			case 3:etkinlikAra(kullanicilar[0]);;break;
			case 4:kullanicilar[0].etkinlikleriYazdir();;break;

			default:
				break;
			}

		}
		
		

	}
	
	public static void etkinlikSil(Kullanici kullanici)
	{
		kullanici.etkinlikleriYazdir();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Silinecek Etkinliðin index giriniz :");
		
		int index=sc.nextInt();
		
		kullanici.etkinlikSi(index);
		
		
	}
	
	public static void etkinlikAra(Kullanici kullanici)
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Aranacak Etkinlik Adýný Yazýnýz :");
		
		String etkinlikAdi=sc.nextLine();
		
		Etkinlik etkinlik=kullanici.etkinlikAra(etkinlikAdi);
		
		if(etkinlik!=null)
		{
			System.out.println("Etkinlik Bulundu "+etkinlik.getEtkinlikAdi()+" "+etkinlik.getAdres());
		}
		else
		{
			System.out.println("Etkinlik Bulunamadý! Tekrar deneyiniz!");
		}
		
		
	}

}
