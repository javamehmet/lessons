import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ders196 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		List<Personel> personelList=new ArrayList<>();
		
		Personel personel=new Personel();
		
		personel.setId(sc.nextInt());
		personel.setPersonelAdi(sc.next());
		
		List<Hesap> hesapListesi=new ArrayList<>();
		
		Hesap hesap=new Hesap();
		
		hesap.setId(sc.nextInt());
		hesap.setHesapAdi(sc.next());
		hesap.setHesapNo(sc.next());
		
		hesapListesi.add(hesap);
		
		personel.setHesapListesi(hesapListesi);
		
		personelList.add(personel);
		
		
		for(Personel per:personelList)
		{
			
			System.out.println(per.getId()+" "+per.getPersonelAdi());
			
			
			for(Hesap hh:per.getHesapListesi())
			{
				System.out.println(hh.getId()+" "+hh.getHesapAdi()+" "+hh.getHesapNo());
			}
			
			
			
			
		}
		
		
		
		

	}

}
