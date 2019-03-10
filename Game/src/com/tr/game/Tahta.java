package com.tr.game;

import java.util.Scanner;

public class Tahta {

	private int[][] oyunMatrisi;

	private Oyuncu[] oyuncular;

	/**
	 * Tahta tahta=new Tahta(2,5);
	 * 
	 * @param oyuncuSayisi
	 * @param boyut
	 */
	public Tahta(int oyuncuSayisi, int boyut) {

		oyuncular = new Oyuncu[oyuncuSayisi];
		oyunMatrisi = new int[boyut][boyut];

		for (int i = 0; i < boyut; i++) {
			for (int j = 0; j < boyut; j++) {
				oyunMatrisi[i][j] = (int) (Math.random() * 8) + 1;
			}
		}

	}

	public int[][] getOyunMatrisi() {
		return this.oyunMatrisi;
	}

	public void setOyunMatrisi(int[][] oyunMatrisi) {
		this.oyunMatrisi = oyunMatrisi;
	}

	public Oyuncu[] getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(Oyuncu[] oyuncular) {
		this.oyuncular = oyuncular;
	}

	public boolean oyunBittiMi() {

		for (int dizi[] : oyunMatrisi) {
			for (int puan : dizi) {
				if (puan != 0)
					return false;
			}
		}

		return true;
	}
	
	public void oyunuOynat()
	{
		Scanner sc=new Scanner(System.in);
		
		boolean oyuncuDegistir=true;
		
		while(!oyunBittiMi())   
		{
			
			if(oyuncuDegistir)
			{
				System.out.println("Sayýn "+oyuncular[0].oyuncuAdi+" hareket yönünü seçiniz :(b,d,k,g)");
				
				String s=sc.nextLine();
				
				char yon=s.charAt(0);
				
				oyuncular[0].hareketEt(yon, oyunMatrisi.length, oyunMatrisi.length);
				
				oyuncular[0].puanEkle(oyunMatrisi[oyuncular[0].getX()][oyuncular[0].getY()]);

				oyuncuDegistir=!oyuncuDegistir;
			}
			else
			{
				System.out.println("Sayýn "+oyuncular[1].oyuncuAdi+" hareket yönünü seçiniz :(b,d,k,g)");
				
				String s=sc.nextLine();
				
				char yon=s.charAt(0);
				
				oyuncular[1].hareketEt(yon, oyunMatrisi.length, oyunMatrisi.length);

				oyuncular[0].puanEkle(oyunMatrisi[oyuncular[0].getX()][oyuncular[0].getY()]);
				
				oyuncuDegistir=!oyuncuDegistir;
			}
			
			tahtayiYazdir();
			
		}
		
		
		if(oyuncular[0].getToplamPuan()>oyuncular[1].getToplamPuan())
		{
			System.out.println("Kazanan Oyuncu :"+oyuncular[0].oyuncuAdi+" Toplam Puan :"+oyuncular[0].getToplamPuan());
		}
		else if(oyuncular[0].getToplamPuan()<oyuncular[1].getToplamPuan())
		{
			System.out.println("Kazanan Oyuncu :"+oyuncular[1].oyuncuAdi+" Toplam Puan :"+oyuncular[1].getToplamPuan());
		}
		else{
			System.out.println("Oyun Berabere :)");
		}
		
		
	}
	
	public void tahtayiYazdir()
	{
		
		for(int i=0;i<oyunMatrisi.length;i++)
		{
			for(int j=0;j<oyunMatrisi.length;j++)
			{
				if(i==oyuncular[0].getX() && j==oyuncular[0].getY())
				{
					System.out.print(oyuncular[0].oyuncuAdi+" ");
				} else if(i==oyuncular[1].getX() && j==oyuncular[1].getY())
				{
					System.out.print(oyuncular[1].oyuncuAdi+" ");
				}
				else
				{
					System.out.print(oyunMatrisi[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
