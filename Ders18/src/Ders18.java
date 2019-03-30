
public class Ders18 {
	
	/**
	 * 
	 * 
	 *   extends =>> inheritance  
	 *   
	 *   
	 *   class1 extends class2
	 *   
	 *   super.
	 *   
	 *   
	 *   
	 *   interface 
	 *   1- Nesne üretmezsin!!!!!
	 *   2- Method içersi bos olur.
	 *   3- static variable tanımı yapabilrsin
	 *   4- variable tanımı yapamazsın!!!
	 *   5- default adında bir method tanımladın 
	 *   6- birden fazla interface implement edebilrsinç
	 *   7- implements keyword kullanarak sınıflara kalıtım yaparsınız.
	 *   
	 *   ,
	 *   
	 *   Araba 2 METHOD vites calistir
	 *   
	 *   BMW 2 3
	 *   Mercedes 2 1
	 *   FORD  2 4
	 *   
	 *   
	 *       
	 * 
	 */
	
	public static void main(String args[])
	{




		BMW bmw=new BMW();
		
		bmw.calistir();
		bmw.vitesAt(5);
		
		Araba araba=new BMW();  // Poliformizm Tasarım Kalıpları Singleton Design Pattern
		
		araba.vitesAt(5);
		
	//	araba.testEt();
		
		
		
		
	}
	

}
