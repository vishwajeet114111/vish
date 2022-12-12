package facebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Homepage 
{
	@FindBy(xpath = "(//div[@class=\"x14ju556 x1emribx\"])[2]")
					private WebElement ReelButton;
	@FindBy(xpath = "//span[text()='Sponsored']")
					private WebElement sponsordB;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ButtonValidate() 
	{
		Assert.assertTrue(ReelButton.isEnabled(),"reel button not enabled TC failed");
		Reporter.log("reel button enabled TC passed",true);
		Assert.assertTrue(sponsordB.isEnabled(),"sponsord button not enabled TC failed");
		Reporter.log("sponsord button enabled TC passed",true);
		
	
	}
}

