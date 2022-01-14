package edureka.tests;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utils.Screenshotutility;


@Listeners(edureka.tests.TestNGListneres.class)
public class TestNGAnnotationsExcelDataRead
 {

	public static WebDriver driver;
	
//	@Test(priority=1, description="This is login test")
//	public static void login(){
//		
//		System.out.println("This is login method");
//		Assert.assertEquals(10, 10,  "Number does not match");
//		System.out.println("hello");
//	}
//	@Test
//	
//	
//	public void m1() throws IOException, InvalidFormatException {
//		
//		String path="D:\\DemoProgramming\\Demo\\Data\\DataforAutomation.xlsx";
//		
//		File f= new File(path);
//		
//		
//		
//		//FileInputStream fw= new FileInputStream(f);
//		
//		XSSFWorkbook book = new XSSFWorkbook(f);
//		XSSFSheet sheet = book.getSheet("Sheet1");
//	int rownum=	sheet.getLastRowNum();
//	
////	String vale= sheet.getRow(1).getCell(0).getStringCellValue();
////		System.out.println(vale);
//		
//		for(int  i= 1; i<=rownum; i++) {
//			
//		int lastcol=sheet.getRow(i).getLastCellNum();
//			for(int j=0;j<lastcol;j++)
//			{
//				
//				DataFormatter formatter = new DataFormatter();
//				String cellvalue=formatter.formatCellValue(sheet.getRow(i).getCell(j));
//				System.out.print(cellvalue);
//				System.out.print("||");
//			}
//			System.out.println();
//		}
//	}
	
	
	 @Test
	 
	 public void screenShot() throws IOException, InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		  driver = new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://prerelease-user-management-ui.predikt-r.com");
		 Thread.sleep(5000);
//		 TakesScreenshot ts = (TakesScreenshot) driver;
//		 
//	File source=	 ts.getScreenshotAs(OutputType.FILE);
//		 FileUtils.copyFile(source, new File("./Screenshot/test.png"));
//		 System.out.println("Screenshot taken");
		 
		// Screenshotutility.takeScreenshot( "loginapgea");
		// System.out.println("Screenshot got it");
		 driver.findElement(By.xpath("//input[@id='coordinated_email']"));
		// driver.quit();
	 }
	 
	@AfterMethod
	public void sc(ITestResult result) throws IOException
	
	{
		if(ITestResult.FAILURE==result.getStatus());
		{
			Screenshotutility.takeScreenshot( driver, result.getName());
			
		}
		
	}	
}
