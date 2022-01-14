package edureka.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.lang.reflect.Method;
import edureka.pages.FbLoginPage;

public class TestBase {
	
	

	
	
	
public static void browserInitialization(Method m) throws IOException {
	String nm=m.getName();
	System.out.println(nm);
}


	
}