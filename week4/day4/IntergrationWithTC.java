package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class IntergrationWithTC {

	@Test
	//static keyword-remain-i need use static keyword
	public static String[][] rundata(String filename) throws IOException {
		
		XSSFWorkbook book= new XSSFWorkbook("./data/"+filename+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		//=ook.getSheet("createlead")
		int rowNum = sheet.getLastRowNum();
		System.out.println("Number of rows :"+rowNum);
		int cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("number of cells :"+cellNum);
		//step1
		String[][] data1= new String[rowNum][cellNum];
		for (int i = 1; i <=rowNum; i++) {
			
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cellNum; j++) {
				
				String data = row.getCell(j).getStringCellValue();
				System.out.println(data);
				//step2
				//excel converting to data provider
				data1[i-1][j]=data;
			//	data1[0][0]=testleaf
			}
		}
		book.close();
		//step-3
		return data1;
	}

}
