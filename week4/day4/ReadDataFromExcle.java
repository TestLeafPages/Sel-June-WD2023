package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcle {

	public static void main(String[] args) throws IOException {
		//step1:set path for workbook
		XSSFWorkbook book= new XSSFWorkbook("./data/CreateLead.xlsx");
		//step2: Get into the sheet
//		book.getSheet(null)-name

		XSSFSheet sheet = book.getSheetAt(0);
		//step3:read row count 
		
		int rowNum = sheet.getLastRowNum();
		System.out.println("Number of rows :"+rowNum);
		
		//with header
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("physical number of rows :"+physicalNumberOfRows);
		
		//step 4: read cell count and value
		
		int cellNum = sheet.getRow(0).getLastCellNum();
		
		System.out.println("number of cells :"+cellNum);
		String stringCellValue = sheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println(stringCellValue);
		
		//print all set of data
		for (int i = 1; i <=rowNum; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < cellNum; j++) {
				
				String data = row.getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		//step5-we need close workbook
		book.close();
	}

}
