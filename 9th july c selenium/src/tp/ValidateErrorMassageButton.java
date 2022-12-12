package tp;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import upStoxPOMusingExcel.UpstoxLoginPage1;
import upstoxBase.Base;
import upstoxUtility.Utility;
import upstoxUtility.UtilityNew;

public class ValidateErrorMassageButton extends Base 
{
	UpstoxLoginPage1 login;
	@BeforeClass
	  public void openBrowser() 
	  {
		  launchBrowser();
		  Reporter.log("launchBrowser",true);
	
		  login   =new UpstoxLoginPage1(driver);
	  }
	 @BeforeMethod
	  public void loginToUpstox() throws EncryptedDocumentException, IOException 
	  {	
		  //Usage all object
		  login.enterUserID(UtilityNew.readPropertyFile("userID"));
		  login.clicksignIN();
		  Reporter.log("sending username and singing in",true);
	  }
	 @Test
	  public void ValidateError() throws IOException 
	  {  WebElement errormsg= driver.findElement(By.xpath("//button[@type='button']"));
		 Assert.assertTrue(errormsg.isDisplayed(), 
			"error msg are not matching TC is failed");
		 Reporter.log("Showing Error Message TC Passed",true);
		 Utility.screenShotMethod(driver, null);
		 Reporter.log("take ss on error page",true);
	  }
	
}
