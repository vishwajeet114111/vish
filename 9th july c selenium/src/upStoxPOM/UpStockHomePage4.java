package upStoxPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Scrolling.ScroolingFunctoin;
import screenshot.ScreenShotGeneralMethod;
import screenshot.screenshot1;

public class UpStockHomePage4 {
	
	//variable declaration
	@FindBy(xpath = "//span[text()='vishwajeet a.']")private WebElement userID;
	@FindBy(id = "funds")private WebElement funds;
	
	
	//initialize variable
	public UpStockHomePage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//usage
	public void validateUserID(WebDriver driver) throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		ScroolingFunctoin.scroolingView(driver, userID);
		String actualUserID = userID.getText();
		String expectedUserID="vishwajeet A.";
		ScreenShotGeneralMethod.screenShotMethod(driver,"actualUserID"+actualUserID);
		if (actualUserID.equalsIgnoreCase(expectedUserID))
		{
			System.out.println("Actual and Expected UserID are Matching,TC is Passed");
		}
		else
		{
			System.out.println("Actual and Expected UserID are not Matching,TC is Failed");
		}
	}
	
	public void clickOnFundsButton()
	{
		funds.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	

