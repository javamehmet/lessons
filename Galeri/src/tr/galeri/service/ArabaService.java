package tr.galeri.service;

import tr.galeri.model.Araba;
import tr.galeri.model.Galeri;

public class ArabaService {

	public void arabaListele(Galeri galeri) {

		int index=0;
		
		for (Araba araba : galeri.getArabalar()) {
			System.out.println(index+" "+araba.getAd() + " " + araba.getModel() + " " + araba.getKiralamaFiyati());
			index++;
		}

	}

}
