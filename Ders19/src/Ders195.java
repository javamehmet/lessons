import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ders195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		List<Kitap> liste=new ArrayList<>();
		
		for(int i=0;i<2;i++)
		{
			Kitap kitap=new Kitap();
			
			kitap.setAdi(sc.next());
			
			kitap.setFiyati(sc.nextInt());
			
			kitap.setYazar(sc.next());
			
			liste.add(kitap);
			
		}
		
		
		for(Kitap kitap:liste)
		{
			System.out.println(kitap.getAdi()+" "+kitap.getYazar());
		}
		
		
		
	}

}
