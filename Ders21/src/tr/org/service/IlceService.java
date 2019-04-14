package tr.org.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import tr.org.model.Ilce;

public class IlceService {

	public List<Ilce> populator(int ilId) throws IOException, InvalidFormatException {

		ApachePoiService apachePoiService = new ApachePoiService();

		File file = new File("D:\\test\\liste.xlsx");

		XSSFWorkbook workbook = apachePoiService.getWorkBook(file);

		XSSFSheet sheet = workbook.getSheet("liste");

		Iterator<Row> iterator = sheet.iterator();

		List<Ilce> ilceler = new ArrayList<>();
		iterator.next();
		while (iterator.hasNext()) {

			Row currentRow = iterator.next();

			if (currentRow.getCell(0).getNumericCellValue() == ilId) {

				Cell cell = currentRow.getCell(3);
				Ilce ilce = new Ilce();
				ilce.setAdi(cell.getStringCellValue());
				ilce.setIlId(ilId);
				ilceler.add(ilce);

				System.out.println(ilce);

			}

		}

		return ilceler;

	}

}
