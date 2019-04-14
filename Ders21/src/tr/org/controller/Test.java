package tr.org.controller;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import tr.org.model.Il;
import tr.org.model.Ilce;
import tr.org.service.ApachePoiService;
import tr.org.service.DagitimMerkeziService;
import tr.org.service.IlService;
import tr.org.service.IlceService;

public class Test {

	public static void main(String[] args) throws InvalidFormatException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		IlService ilservice = new IlService();
		IlceService ilceService = new IlceService();
		List<Il> ilListe = ilservice.populatorIl();

		ApachePoiService apachePoiService = new ApachePoiService();

		XSSFWorkbook workbook = apachePoiService.getWorkBook();

		XSSFSheet sheet = apachePoiService.getSheet(workbook, "il");

		XSSFSheet ilceSheet = apachePoiService.getSheet(workbook, "ilce");

		int k=0;
		
		for (int i = 0; i < ilListe.size(); i++) {
			Row row = sheet.createRow(i);
			row.createCell(0).setCellValue(ilListe.get(i).getPlakaNo());
			row.createCell(1).setCellValue(ilListe.get(i).getAdi());

			List<Ilce> ilceler = ilceService.populator(ilListe.get(i).getPlakaNo());
	
			for (int j = 0; j < ilceler.size(); j++) {
				Row ilceRow = ilceSheet.createRow(k);
				ilceRow.createCell(0).setCellValue(ilceler.get(j).getIlId());
				ilceRow.createCell(1).setCellValue(ilceler.get(j).getAdi());
				k++;

			}

		}

		
		DagitimMerkeziService dagitimMerkeziService=new DagitimMerkeziService();
		
		dagitimMerkeziService.olustur();
		
		
		apachePoiService.writeToXLS(workbook, new File("D:\\test\\DM.xlsx"));

		
		
		
		
	}

}
