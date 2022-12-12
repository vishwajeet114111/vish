package upStoxPOMusingExcel;

import org.testng.annotations.Test;

import screenshot.ScreenShotGeneralMethod;
import upstoxBase.Base;
import upstoxUtility.Utility;
import waits.ImplicitWaitTimeGenralMethod;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class UpstoxTestNG3 extends Base{
	

	UpstoxLoginPage1 login;
	UpStoxPasscodePage2 passcode;
	UpStoxWelcomePage3 welcome;
	UpStockHomePage4 home;
	
	

  @BeforeClass
  public void openBrowser() 
  {
	  launchBrowser();
	  //initialize all objects of POM classes
	  login   =new UpstoxLoginPage1(driver);
	  passcode=new UpStoxPasscodePage2(driver);
	  welcome =new UpStoxWelcomePage3(driver);
	  home    =new UpStockHomePage4(driver);
	  
  }
	 
  @BeforeMethod
  public void loginToUpstox() throws EncryptedDocumentException, IOException 
  {

		
	  //Usage all object
	  login.enterUserID(Utility.ExcelGenralM1("Sheet3", 0, 0));
	  login.enterPassword(Utility.ExcelGenralM1("Sheet3", 0, 1));
	  login.clicksignIN();
	  Utility.waitTime(driver, 2000);
	  passcode.entercode(Utility.ExcelGenralM1("Sheet3", 0, 2));
	  Utility.waitTime(driver, 7000);
	  welcome.clickOnnoIAmGoodButton();
	  
	  
  }
 
  @Test
  public void ValidateUserID() throws IOException 
  {
	  Utility.waitTime(driver, 2000);
	  Assert.assertEquals(home.getActualUserID(driver), Utility.ExcelGenralM1("Sheet3", 0, 3),"actualuserID and expectedUserID are not matching TC is failed");
	  
	  Utility.waitTime(driver, 5000);
	  Utility.screenShotMethod(driver,home.getActualUserID(driver) );
	 
	  
  }
  
  @AfterMethod
  public void logoutBrowser() throws InterruptedException
  {
	  home.logoutApplication(driver);
  }
  
  @AfterClass
  public void broswerClose()
  {
	  Utility.waitTime(driver, 1000);
	  driver.close();
  }
  
}
