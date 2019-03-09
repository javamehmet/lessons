package com.tr.ders13;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		Kitap kitap=new Kitap();
		
		//Kitap kitap2=new Kitap("Ýnce Memed");
		
		System.out.println("Kitap Adý :");
		
		kitap.kitapAdi=scanner.nextLine();
		
		System.out.println("Kitap Yazarý :");
		
		kitap.yazar=scanner.nextLine();
		
		System.out.println("Kitap ISBN NO :");
		
		kitap.ISBNNO=scanner.nextLine();
		
		System.out.println("Kitap Fiyatý :");
		
		kitap.fiyati=scanner.nextInt();
		
	
		kitap.kitapAdiYazdir();
		
		System.out.println(kitap.yazar);
		System.out.println(kitap.ISBNNO);
		System.out.println(kitap.fiyati);
		

	}

}
