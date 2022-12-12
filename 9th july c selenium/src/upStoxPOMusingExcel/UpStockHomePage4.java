package upStoxPOMusingExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Scrolling.ScroolingFunctoin;
import screenshot.ScreenShotGeneralMethod;


public class UpStockHomePage4 {
	
	//variable declaration
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement userID;
	@FindBy(id = "funds")private WebElement funds;
	@FindBy(id = "logout")private WebElement logout;

	//initialize variable
	public UpStockHomePage4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//usage
	public void validateUserID(WebDriver driver,String str) throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		ScroolingFunctoin.scroolingView(driver, userID);
		String actualUserID = userID.getText();
		String expectedUserID=str;
		//ScreenShotGeneralMethod.screenShotMethod(driver,"actualUserID"+actualUserID);
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
	
	public void logoutApplication(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		ScroolingFunctoin.scroolingView(driver, userID);
		userID.click();
		Thread.sleep(1000);
		logout.click();
	}
	public String getActualUserID(WebDriver driver)
	{
		ScroolingFunctoin.scroolingView(driver, userID);
		String acutualUser = userID.getText();
		return acutualUser;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

	

