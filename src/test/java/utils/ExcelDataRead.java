package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {
	static XSSFWorkbook book;
	static  XSSFSheet sheet;
	public ExcelDataRead(String path, String sheetname) throws IOException {
		
		
		book= new XSSFWorkbook(path);
		sheet=book.getSheet(sheetname);
		
	}
	public static void getRowCount() throws IOException {
	
	int rowcount = sheet.getPhysicalNumberOfRows();
	 
	 System.out.println(rowcount);
	
	
	}
	
	public void readData(int rowNum, int cellNum) {
		
		 
		
		DataFormatter format = new DataFormatter();
		
		Object value3=format.formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
		System.out.println(value3);
		
	}
}