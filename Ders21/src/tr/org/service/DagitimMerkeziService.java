package tr.org.service;

import tr.org.model.DagitimMerkezi;

public class DagitimMerkeziService implements BaseService<DagitimMerkezi> {
	
	
	
	@Override
	public DagitimMerkezi olustur() {

		
		DagitimMerkezi dagitimMerkezi=new DagitimMerkezi();
		
		/*
		for(String title:dagitimMerkezi.getTitles())
		{
			System.out.println(title);
			
		}
		*/
		
		
		System.out.println("ID :");
		dagitimMerkezi.setId(scanner.next());
		System.out.println("AD :");
		dagitimMerkezi.setId(scanner.next());
		
		
		
		
		

		
		
		return null;
	}
	
	
	

}
