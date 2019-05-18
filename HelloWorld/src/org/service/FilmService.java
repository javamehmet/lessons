package org.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilmService {
	
	
	
	
	public Map<String,FilmDTO> getList()
	{
		HashMap<String, FilmDTO> mapList=new HashMap<String, FilmDTO>();
		
		try {
			
		Class.forName("org.postgresql.Driver");
			
			Connection connection=DriverManager.
					getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres", "root");
			
			
			Statement statement=connection.createStatement();
			
			
			String sql="select f.title,f.description,a.first_name,a.last_name "
					+ " from film f inner join film_actor fa on fa.film_id=f.film_id"
					+ " inner join actor a on fa.actor_id=a.actor_id limit 30 ";
			
			
			ResultSet set=statement.executeQuery(sql);
			
		
			
			while(set.next())
			{
				
				if(mapList.get(set.getString("title"))!=null)
				{
					Actor actor=new Actor();
					actor.setFirstName(set.getString("first_name"));
					actor.setLastName(set.getString("last_name"));
					
					mapList.get("title").getActors().add(actor);
					
					
				}
				else
				{
						
					FilmDTO filmDTO=new FilmDTO();
					
					filmDTO.setTitle(set.getString("title"));
					filmDTO.setDescription(set.getString("description"));
					
					List<Actor> actors=new ArrayList<Actor>();
					
					Actor actor=new Actor();
					actor.setFirstName(set.getString("first_name"));
					actor.setLastName(set.getString("last_name"));
					
					actors.add(actor);
					
					filmDTO.setActors(actors);
					
					mapList.put(filmDTO.getTitle(), filmDTO);
					
				
				}
				
				
				
				
				
				
			}
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return mapList;
		
	}
	
	
	
	
	
	

}
