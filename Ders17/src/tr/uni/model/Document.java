package tr.uni.model;

import java.util.Date;

public class Document {
	
	private Author authors[];
	
	private Date date;
	
	public Document() {
	
		authors = new Author[1];
	
	}
	
	public void addAuthors(Author author)
	{
		if(authors[0]==null)
		{
			
			authors[0]=author;
		}
		else
		{
			
			Author temp [] =authors;
			
			authors=new Author[temp.length+1];
			
			for(int i=0;i<temp.length;i++)
			{
				authors[i]=temp[i];
			}
			
			authors[temp.length]=author;
			
		}
	
		
	}
	
	public Date getDate()
	{
		return new Date();
	}
}
