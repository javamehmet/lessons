
public interface Controller extends BasicController{

	public static float pi=3.14f;
	
	public void add(Object obh);
	
	public void delete(Object obj);
	
	default void test() {
		
		System.out.println("Default method!");
		
	}
	
	
	
}
