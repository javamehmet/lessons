package tr.uni.controller;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

import tr.uni.model.Author;
import tr.uni.model.Book;
import tr.uni.model.Email;

public class Test {

	public static void main(String[] args) {

		
		
		Author author=new Author();
		author.setId(1);
		author.setAdi("Java");
		
		Email email=new Email();
		
		email.setSubject("Java Developer");
		email.addAuthor(author); // to
		email.addAuthors(author); // from document geliyor
		
		email.getDate(); // new Date();
		
		SimpleDateFormat formatter=new SimpleDateFormat("MM HH YYYY hh:mm");
		
		
		System.out.println(formatter.format(email.getDate()));
		
		Book book=new Book();
		
		book.setTitle("Test");
		book.addAuthors(author);  // document içerisinde geliyor
		
		
		
		
		

		
		
		

	}

}
