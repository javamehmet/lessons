package tr.org.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePoiService {

	public XSSFWorkbook getWorkBook() throws InvalidFormatException, IOException {
		return new XSSFWorkbook();
	}
	
	public XSSFWorkbook getWorkBook(File file) throws InvalidFormatException, IOException {
		return new XSSFWorkbook(new FileInputStream(file));
	}

	public XSSFSheet getSheet(XSSFWorkbook workbook, String sheetName) {
		return workbook.createSheet(sheetName);
	}

	public Row getRow(XSSFSheet sheet, int rowNumber) {
		return sheet.createRow(rowNumber);
	}

	public Cell getCell(Row row, int cellNumber) {
		return row.createCell(cellNumber);
	}

	public void writeToXLS(XSSFWorkbook workbook, File file) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream(file);

		workbook.write(fileOutputStream);

		fileOutputStream.close();

	}

}
