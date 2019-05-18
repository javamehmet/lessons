package org.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="testController")
@RequestScoped
public class TestController {

	private String mesaj;

	public TestController() {
	
		mesaj="Ben java tarafýndan gönderildim!";
		
		// TODO Auto-generated constructor stub
	}
	
	
	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	
	
	
	
}
