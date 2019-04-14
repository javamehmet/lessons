package tr.org.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import tr.org.model.DagitimMerkezi;

public class DagitimMerkeziService implements BaseService<DagitimMerkezi> {

	@Override
	public DagitimMerkezi olustur() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		DagitimMerkezi dagitimMerkezi = new DagitimMerkezi();

		/*
		Method method[] = DagitimMerkezi.class.getMethods();

		for (Method m : method) {

			if (m.getName().contains("set") && !m.getParameters()[0].getType().isInterface()) {
				if (m.getReturnType().isPrimitive()) {
					System.out.println(m.getName().split("set")[1].toUpperCase()+" :");
					m.invoke(dagitimMerkezi, scanner.nextInt());
				} else {
					System.out.println(m.getName().split("set")[1].toUpperCase()+" :");
					m.invoke(dagitimMerkezi, scanner.next());
				}
			}

		}
		
		*/
		/*
		 * for(String title:dagitimMerkezi.getTitles()) {
		 * System.out.println(title);
		 * 
		 * }
		 */
		
		
		

		System.out.println("ID :");
		dagitimMerkezi.setId(scanner.next());
		System.out.println("AD :");
		dagitimMerkezi.setAdi(scanner.next());
		
		/*
		 * 
		 * 
		 * 
		 * İl ilce tm ve hat bilgi kayıtları olması gerekiyor
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		

		return null;
	}

}
