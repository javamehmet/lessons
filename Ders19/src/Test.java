import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {


		Universite universite=new Universite();
		
		Egitim<Universite,Yuksekokul> egitim=new Egitim<>();
		
		egitim.t=new Universite();
		
		egitim.t.adi="Kýrýkkale Üniversite";
		
		Egitim<Universite,Yuksekokul> egitim2=new Egitim<>();
		
		egitim2.r=new Yuksekokul();
		
		egitim2.r.yuksekOkulAdi="asdas";
		
		Method method[]=egitim.t.getClass().getMethods();
	
		// Reflections
	
		

	}

}
