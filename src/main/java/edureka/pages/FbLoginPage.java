package edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class FbLoginPage{
	static WebDriver driver;
	public FbLoginPage(WebDriver driver){
	this.driver=driver;
	System.out.println("hi");
	System.out.println(driver instanceof WebDriver);
	System.out.println(this.driver instanceof WebDriver);
	//PageFactory.initElements(driver, this);
	
	}
//	Using FindBy for locating elements
  @FindBy(how=How.XPATH, using= "//input[@id='coordinated_email']") WebElement emailtextbox;
	
	@FindBy(how=How.XPATH, using ="//input[@id='coordinated_password']") WebElement passwordbox;
	
	 @FindBy(how = How.XPATH, using ="//*[@id=\"primary-theme\"]/div/div/div/div/div/div[3]/form/div/div[3]/div/div/span/button") WebElement signin;
	// Defining all the user actions (Methods) that can be performed in the Facebook home page</span>
	 
	// This method is to set Email in the email text box
	
	
//	@FindBy(xpath="//*[@id=\"coordinated_email\"]]")
//	WebElement username;
//	@FindBy(xpath="//*[@id=\"coordinated_password\"]")
//	WebElement password;
//	@FindBy(xpath="//button[@type='submit']")
//	WebElement signin;
	
	
	public void setEmail(String strEmail){
		
		emailtextbox.sendKeys(strEmail);
	}
	// This method is to set Password in the password text box
	public void setPassword(String strPassword){
		passwordbox.sendKeys(strPassword);
	}
	 
	// This method is to click on Login Button
	public void clickOnLoginButton(){
		signin.click();
	}


}

