package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import edureka.tests.TestNGAnnotationsExcelDataRead;

public class Screenshotutility extends TestNGAnnotationsExcelDataRead {

  public static void takeScreenshot(WebDriver driver, String Screenshotname) throws IOException  {
	  TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./Screenshot/"+Screenshotname+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception is" +e.getMessage());
		}
  
}
}
