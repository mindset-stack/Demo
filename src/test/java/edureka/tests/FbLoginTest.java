package edureka.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edureka.pages.FbLoginPage;

public class FbLoginTest extends TestBase{
	
//	@Test
//			 
//	public  void init() throws Exception{
//		
//				 
//	
//	FbLoginPage lp = PageFactory.initElements(driver, FbLoginPage.class);
//	lp.setEmail("admin@predikt-r.com.au");
//	lp.setPassword("Qwerty123!");
//	lp.clickOnLoginButton();
//	
//	}

	@Test
	public static void main() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver 	 driver= new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://prerelease-user-management-ui.predikt-r.com/");
		FbLoginPage lp= PageFactory.initElements(driver, FbLoginPage.class);
		lp.setEmail("admin@predikt-r.com.au");
		lp.setPassword("Qwerty123!");
		lp.clickOnLoginButton();
	}
}


