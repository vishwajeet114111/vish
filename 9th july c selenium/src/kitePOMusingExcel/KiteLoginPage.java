package kitePOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{

	@FindBy(xpath = "//input[@type='text']")private WebElement userID;
	@FindBy(id="password")private WebElement pass;
	@FindBy(xpath ="//button[@type='submit']")private WebElement logbutton;
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void SendUserID(String str)
	{
		userID.sendKeys(str);	
	}
	
	public void SendPassword(String str) 
	{
		pass.sendKeys(str);
	}
	
	public void LoginButton() 
	{
		logbutton.click();
	}
	
	
	
	
}
