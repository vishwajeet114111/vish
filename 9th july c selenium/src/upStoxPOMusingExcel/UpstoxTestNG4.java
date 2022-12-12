package upStoxPOMusingExcel;

import org.testng.annotations.Test;


import upstoxBase.Base;
import upstoxUtility.Utility;
import upstoxUtility.UtilityNew;

import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class UpstoxTestNG4 extends Base{
	

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
	  login.enterUserID(UtilityNew.readPropertyFile("userID"));
	  login.enterPassword(UtilityNew.readPropertyFile("password"));
	  login.clicksignIN();
	  Utility.waitTime(driver, 2000);
	  passcode.entercode(UtilityNew.readPropertyFile("passCode"));
	  Utility.waitTime(driver, 7000);
	  welcome.clickOnnoIAmGoodButton();
	  
	  
  }
 
  @Test
  public void ValidateUserID() throws IOException 
  {
	  Utility.waitTime(driver, 2000);
	  Assert.assertEquals(home.getActualUserID(driver), UtilityNew.readPropertyFile("expectedUserID"),"actualuserID and expectedUserID are not matching TC is failed");
	  
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
	  driver.close();
  }
  
}
