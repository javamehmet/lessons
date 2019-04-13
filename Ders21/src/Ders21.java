import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ders21 {

	/*
	 * 
	 * 
	 * JAVA I/O
	 * 
	 * 
	 * File
	 * 
	 */

	public static void main(String args[]) throws IOException {

		File file = new File("D:\\test\\java.txt");
		
		FileInputStream fileInputStream=new FileInputStream(file);
		
		int c=0;
		
		while((c=fileInputStream.read())!=-1)
		{
			
			char karakter=(char)c;
			
			System.out.print(karakter);
			
			
			
		}
		
		FileOutputStream fout= new FileOutputStream(new File("D:\\test\\out.txt"));


		String kelime="Hello World!";
		
		fout.write(kelime.getBytes());
		
		fout.write(12);
		
		
		

	}

}
