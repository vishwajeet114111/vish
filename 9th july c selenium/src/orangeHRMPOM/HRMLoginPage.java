package orangeHRMPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class HRMLoginPage 
{
	//variable declaration
	@FindBy (name  ="username")private WebElement userId;
	@FindBy (name  ="password")private WebElement password;
	@FindBy (xpath ="//button[@type='submit']")private WebElement loginbutton;
	
	//variable initialization
	public HRMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usages
	public void enteruserid(String id) throws IOException 
	{
		userId.sendKeys(id);
		Reporter.log("entering userid",true);
	}
	public void enterpassword(String pass) 
	{
		password.sendKeys(pass);
		Reporter.log("entering password",true);
	}
	public void clickonbutton() 
	{
		loginbutton.click();
		Reporter.log("clicking loginbutton",true);
		
	}
	
}
