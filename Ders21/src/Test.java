import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\test\\ogrenci.txt");

		FileOutputStream fout = new FileOutputStream(file,true);

		Scanner sc = new Scanner(System.in);

		Ogrenci ogrenci = new Ogrenci();

		System.out.println("Öğrenci İd:");

		ogrenci.setId(sc.nextInt());

		System.out.println("Öğrenci Adı:");

		ogrenci.setAdi(sc.next());

		System.out.println("Öğrenci Bolum:");

		ogrenci.setBolum(sc.next());

		System.out.println("Öğrenci No:");

		ogrenci.setNo(sc.next());

		List<Ders> dersler = new ArrayList<>();

		for (int i = 0; i < 3; i++) {

			Ders ders = new Ders();

			System.out.println("Ders id:");

			ders.setId(sc.nextInt());

			System.out.println("Ders Adi :");

			ders.setDersAdi(sc.next());

			System.out.println("Ders Kredi :");

			ders.setKredi(sc.nextInt());

			System.out.println("Ders Notu :");

			ders.setNot(sc.nextInt());

			dersler.add(ders);

		}

		ogrenci.setDersler(dersler);

		fout.write(ogrenci.toString().getBytes());

		fout.close();

		//System.out.println(ders);

	}

}
