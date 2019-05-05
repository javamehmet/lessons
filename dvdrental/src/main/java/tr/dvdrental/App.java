package tr.dvdrental;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import tr.dvdrental.model.BaseModel;
import tr.dvdrental.model.Language;
import tr.dvdrental.service.LanguageService;
import tr.dvdrental.util.DBUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    
       
    	LanguageService LanguageService=new LanguageService();
    	
    	Language Language=new Language();
    	Language.setName("Java Developer 7");
    	
    	LanguageService.add(Language);
    	
    	System.out.println(Language);
    	
    	Language.setName("Java Developer 8"); // id=23
    	
    	LanguageService.update(Language);
    	
    	for(Language c:LanguageService.getList())
    	{
    		System.out.println(c);
    	}
    	
    	
    	Scanner scanner=new Scanner(System.in);
    	
    	
    	while(true)
    	{
    	System.out.println("Silmek istediğiniz Language Id Giriniz :");
    	
    	int id=scanner.nextInt();
    	
    	Language cat=LanguageService.getModel(id);
    	
    	LanguageService.delete(cat);
    	
    	
    	for(Language c:LanguageService.getList())
    	{
    		System.out.println(c);
    	}
    	
    	
    	}
    	
    	
        
    }
}
