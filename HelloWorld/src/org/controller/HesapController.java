package org.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="hesapController")
@RequestScoped
public class HesapController {

	private int sayi1;
	
	private int sayi2;
	
	private int sonuc=0;
	
	private List<Car> cars;
	
	public HesapController() {
	
		System.out.println("HesapController bean yaratýldý!");
		// TODO Auto-generated constructor stub
	}
	

	@PostConstruct
	public void init()
	{
		cars=new ArrayList<Car>();
		
		for(int i=0;i<5;i++)
		{
			
			Car car=new Car();
			car.setId(i);
			car.setColor("white");
			car.setBrand("BMW "+i);
			car.setYear(2018);
			
			cars.add(car);
		}
		
		
		
		System.out.println("Ýnit method calýstýrýldý!");
	}
	
	public void topla()
	{
		sonuc=sayi1+sayi2;
		System.out.println("Sonuc :"+sonuc);
	}
	

	public int getSayi1() {
		return sayi1;
	}

	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}

	public int getSayi2() {
		return sayi2;
	}

	public void setSayi2(int sayi2) {
		this.sayi2 = sayi2;
	}

	public int getSonuc() {
		return sonuc;
	}

	public void setSonuc(int sonuc) {
		this.sonuc = sonuc;
	}


	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
	
	
	
}
