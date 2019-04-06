import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ders194 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Ogrenci> liste = new ArrayList<>();

		
		for (int i = 0; i < 3; i++) {

			Ogrenci ogrenci = new Ogrenci();

			System.out.println("Adý :");

			ogrenci.setOgrAdi(sc.next());

			System.out.println("Soyadý :");

			ogrenci.setOgrSoyadi(sc.next());

			System.out.println("No :");

			ogrenci.setOgrNo(sc.next());

			liste.add(ogrenci);

		}

		for (Ogrenci ogrenci : liste) {
			System.out.println(ogrenci.getOgrAdi() + " " + ogrenci.getOgrSoyadi());
		}

	}

}
