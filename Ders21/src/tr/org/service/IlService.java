package tr.org.service;

import java.util.ArrayList;
import java.util.List;

import tr.org.model.Il;

public class IlService {

	public List<Il> populatorIl() {

		String iller = "01 Adana 02 Adıyaman" + " 03 Afyon" + " 04 Ağrı" + " 05 Amasya" + " 06 Ankara" + " 07 Antalya"
				+ " 08 Artvin" + " 09 Aydın" + " 10 Balıkesir";

		String dizi[] = iller.split(" ");

		List<Il> liste = new ArrayList<>();

		for (int i = 0; i < dizi.length; i = i + 2) {
			Il il = new Il();

			il.setAdi(dizi[i + 1]);
			il.setPlakaNo(Integer.valueOf(dizi[i]));

			liste.add(il);

		}
		
		return liste;

	}

}
