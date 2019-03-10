package com.tr.game;

public class Test {

	public static void main(String[] args) {


		Tahta tahta=new Tahta(2, 2);
	
		
		Oyuncu [] oyuncular=new Oyuncu[2];
		oyuncular[0]=new Oyuncu("A", 0, 0);
		oyuncular[1]=new Oyuncu("B", 1, 1);
		
		tahta.setOyuncular(oyuncular);
		
		tahta.tahtayiYazdir();
		
		tahta.oyunuOynat();
		

	}

}
