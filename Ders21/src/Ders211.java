import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ders211 {

	public static void main(String[] args) throws IOException {


		
		/*
		 * 
		 * Java I/O
		 * 
		 * OutputStream InputStream
		 * 
		 * 
		 * FıleInputStream FileOutputStream
		 * 
		 * File => 1 uzantısı 1 directory
		 * 
		 * 
		 * F
		 * 
		 * 
		 * 
		 */
		
		File file=new File("D:\\test\\test.txt");
		
		FileOutputStream out=new FileOutputStream(file,true); // append
		
		String kelime="Java Developer";
		
		byte data[]=kelime.getBytes();
		
		out.write(data);
		
		out.close();
		
		
		FileInputStream fin=new FileInputStream(file);
		
		
		int c=0;
		
		while((c=fin.read())!=-1)
		{
			System.out.print((char)c);
		}
		
		fin.close();
		
		BufferedReader buf=new BufferedReader(new FileReader(file));
		
		 String line;
         while ((line = buf.readLine()) != null) {
             System.out.println(line);
         }
		
	
		
         XSSFWorkbook workbook=new XSSFWorkbook();
         
         XSSFSheet sheet=workbook.createSheet();
         
         Row row=sheet.createRow(1);
         
         Cell cell=row.createCell(0);
         
         cell.setCellValue("asdsdas");
         
         workbook.write(new FileOutputStream(new File("D:\\test\\test2.xlsx")));
         
		
		
		
		
		

	}

}
