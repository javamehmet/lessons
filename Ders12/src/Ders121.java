import java.util.Scanner;

public class Ders121 {

	public static int cevre(int a, int b) {
		return 2 * (a + b);
	}

	public static int alan(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		dikdortgenHesabi();

	}

	public static void dikdortgenHesabi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dikdörtgenin A kenarýný giriniz:");

		int a = scanner.nextInt();

		System.out.println("Dikdörtgenin B kenarýný giriniz :");

		int b = scanner.nextInt();

		int cevre = cevre(a, b);

		int alan = alan(a, b);

		System.out.println("Alan :" + alan + " Çevre :" + cevre);
	}

}
