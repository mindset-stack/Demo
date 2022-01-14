package utils;

import java.io.IOException;

public class ExcelData {

	
	public static void main(String[] args) throws IOException {
		
		String path= "./Data/DataforAutomation.xlx";
		String sheetname="Sheet1";
		ExcelDataRead data= new ExcelDataRead( path, sheetname);
		
		data.getRowCount();
		data.readData(1, 0);
		data.readData(1, 1);
		data.readData(1, 2);
		
	}
}
