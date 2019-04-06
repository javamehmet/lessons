import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ders193 {

	public static void main(String[] args) {


		
		Scanner sc=new Scanner(System.in);
		
		List<String> liste=new ArrayList<>();
		
		
		while(true)
		{
			
			System.out.println("Bir kelime giriniz :");
			
			String kelime=sc.nextLine();
			
			if(kelime.toLowerCase().equals("evet"))
				break;
			
			liste.add(kelime);
			
			
		}
		
		
		for(String ss:liste)
		{
			System.out.println(ss);
		}
		
		
		
		
		
		
	}

}
