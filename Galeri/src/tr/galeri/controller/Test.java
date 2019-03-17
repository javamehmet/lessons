package tr.galeri.controller;

import java.util.Scanner;

import tr.galeri.model.Araba;
import tr.galeri.model.Galeri;
import tr.galeri.model.Kullanici;
import tr.galeri.model.Musteri;
import tr.galeri.service.Data;
import tr.galeri.service.GaleriService;
import tr.galeri.service.MusteriService;

public class Test {

	public static int musteriIndex = 0;

	public static int galeriIndex = 0;

	public static void main(String[] args) {

		MusteriService musteriService = new MusteriService();
		GaleriService galeriService = new GaleriService();

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("1 :Müþteri Kayýt");
			System.out.println("2 :Galeri Kayýt");
			System.out.println("3 :Kullanýcý Giriþi");

			int secim = sc.nextInt();

			switch (secim) {
			case 1:
				musteriKayit(musteriService);
				break;
			case 2:
				galeriKayit(galeriService);
				break;
			case 3:
				kullaniciGiris(musteriService, galeriService);
				break;

			default:
				break;
			}

		}

	}

	private static void kullaniciGiris(MusteriService musteriService, GaleriService galeriService) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kullanici Adýný Giriniz :");

		String kullaniciAdi = scanner.next();

		System.out.println("Kullanici Þifre Giriniz :");

		String sifre = scanner.next();
		int index = 0;
		for (Musteri musteri : Data.musteriler) {

			if (musteri.getKullanici().getKullaniciAdi().equals(kullaniciAdi)
					&& musteri.getKullanici().getSifre().equals(sifre)
					&& musteri.getKullanici().getTip().equals("musteri")) {

				musteriIndex = index;

				System.out.println("-----Müþteri Giriþi-----");
				System.out.println("1 :Araba Kirala");
				System.out.println("2 :Araba Satýn Al");
				System.out.println("3 :Araba Iade Et");

				int secim = scanner.nextInt();

				switch (secim) {
				case 1:
					musteriArabaKirala(musteriService);
					break;
				case 2:
					musteriArabaSatinAl();
					break;
				case 3:
					musteriArabaIadeEt();
					break;

				default:
					break;
				}
				

			}

			index++;

		}

		index = 0;

		for (Galeri galeri : Data.galeriler) {

			if (galeri.getKullanici().getKullaniciAdi().equals(kullaniciAdi)
					&& galeri.getKullanici().getSifre().equals(sifre)
					&& galeri.getKullanici().getTip().equals("galeri")) {

				galeriIndex = index;

				System.out.println("-----Galeri Giriþi-----");
				System.out.println("1 :Araba Ekle");
				System.out.println("2 :Araba Sil");
				System.out.println("3 :Araba Kirala");
				System.out.println("4 :Araba Listele");

				int secim = scanner.nextInt();

				switch (secim) {
				case 1:
					galeriArabaEkle(galeriService);
					break;
				default:
					break;
				}

			}

			index++;

		}

	}

	private static void galeriArabaEkle(GaleriService galeriService) {

		Scanner sc = new Scanner(System.in);
		Araba araba = new Araba();
		System.out.println("Araba Adý :");
		araba.setAd(sc.next());
		araba.setDurum(false);
		System.out.println("Araba Modeli :");
		araba.setModel(sc.nextInt());
		System.out.println("Araba Renk :");
		araba.setRenk(sc.next());
		System.out.println("Araba Kiralam Fiyatý :");
		araba.setKiralamaFiyati(sc.nextDouble());
		System.out.println("Araba Satýþ Fiyatý :");
		araba.setSatisFiyati(sc.nextDouble());

		galeriService.arabaEkle(araba);

	}

	private static void musteriArabaIadeEt() {
		// TODO Auto-generated method stub

	}

	private static void musteriArabaSatinAl() {
		// TODO Auto-generated method stub

	}

	private static void musteriArabaKirala(MusteriService musteriService) {

		musteriService.arabaKirala();

	}

	private static void galeriKayit(GaleriService galeriService) {

		Galeri galeri = new Galeri();

		Scanner sc = new Scanner(System.in);

		System.out.println("Galeri Adý giriniz :");

		galeri.setAd(sc.next());

		System.out.println("Galeri Adres Giriniz :");

		galeri.setAdres(sc.next());

		System.out.println("Kullanýcý Adý Giriniz :");

		Kullanici kullanici = new Kullanici();

		kullanici.setKullaniciAdi(sc.next());

		System.out.println("Þifre Giriniz :");

		kullanici.setSifre(sc.next());

		kullanici.setTip("galeri");

		galeri.setKullanici(kullanici);

		galeriService.galeriEkle(galeri);

	}

	private static void musteriKayit(MusteriService musteriService) {

		Musteri musteri = new Musteri();
		Scanner sc = new Scanner(System.in);

		System.out.println("Müþteri Adý :");

		musteri.setAdSoyad(sc.next());

		System.out.println("Müþteri Adres :");

		musteri.setAdres(sc.next());

		musteri.setTelefon("1254654");

		System.out.println("Kullanýcý Adý Giriniz :");

		Kullanici kullanici = new Kullanici();

		kullanici.setKullaniciAdi(sc.next());

		System.out.println("Þifre Giriniz :");

		kullanici.setSifre(sc.next());

		kullanici.setTip("musteri");

		musteri.setKullanici(kullanici);

		musteriService.musteriEkle(musteri);

	}

}
