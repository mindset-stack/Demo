package edureka.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	 @Test
	 public void reportTest() throws IOException {
		 
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("./Reports/graphreport.html");
		
		
		ExtentReports extent= new ExtentReports();
		
		extent.attachReporter(reporter);
		
		ExtentTest logger= extent.createTest("Login Test");
		
		logger.log(Status.INFO, "This is logon test");
		logger.log(Status.PASS,"Test 1 passed");
		extent.flush();
	ExtentTest logger1= extent.createTest("Add user test");
	 logger1.log(Status.INFO, "This is add user page");
	 logger1.log(Status.PASS, "Add used passed");
	 System.out.println("Test");
	

	// reference image saved to disk
	//logger1.fail((Markup) MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());

	// base64
	//logger1.fail((Markup) MediaEntityBuilder.createScreenCaptureFromPath("base64").build());
	
	
	ExtentTest path=logger1.addScreenCaptureFromPath("D:/Capture.png");
	System.out.println("the path is + " +path);

	 extent.flush();
	 }
}
