import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		
	
		ArrayList<String> liste=new ArrayList<>();
		
		liste.add("Java");
		liste.add("Pyhton");
		
		//liste.remove(1);
		
		liste.get(1);
		
		liste.isEmpty();
		
		liste.size();
		
		
		for(int i=0;i<liste.size();i++)
		{
			System.out.println(liste.get(i));
		}
		
		for(String s:liste)
		{
			System.out.println(s);
		}
		
		
		List<String> liste2=new ArrayList<>(); // Poliformizm

		
		

	}

}
