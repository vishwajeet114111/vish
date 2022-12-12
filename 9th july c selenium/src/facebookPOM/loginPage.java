package facebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
		@FindBy(name="email") private WebElement userID;
		@FindBy(name="pass")private WebElement password;
		@FindBy(id="loginbutton")private WebElement signIN;
		

	//variable initialization
	public loginPage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	//variable Usage using method
			public void enterUserID(String str)
			{
				userID.sendKeys(str);	
			}
			public void enterPassword(String str)
			{
				password.sendKeys(str);	
			}
			public void clicksignIN()
			{
				signIN.click();	
			}

	

}
