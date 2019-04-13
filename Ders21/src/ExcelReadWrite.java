import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File("D:\\test\\deneme.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Java");
		
		Row row=sheet.createRow(16);
		
		Cell cell=row.createCell(16);
		
		cell.setCellValue("Hello World");
		
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		
		workbook.write(fileOutputStream);
		
		fileOutputStream.close();
		
		
		
		
		

	}

}
