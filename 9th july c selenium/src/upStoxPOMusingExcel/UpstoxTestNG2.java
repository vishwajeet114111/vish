package upStoxPOMusingExcel;

import org.testng.annotations.Test;

import Scrolling.ScroolingFunctoin;
import screenshot.ScreenShotGeneralMethod;
import waits.ImplicitWaitTimeGenralMethod;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class UpstoxTestNG2 {
	
	WebDriver driver;
	UpstoxLoginPage1 login;
	UpStoxPasscodePage2 passcode;
	UpStoxWelcomePage3 welcome;
	UpStockHomePage4 home;
	UpStoxFundsPage5 fund;
	File myfile;
	Sheet mysheet;

  @BeforeClass
  public void lauchBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://login-v2.upstox.com");
	  ImplicitWaitTimeGenralMethod.waitTime(driver, 2000);
	  //initialize all objects of POM classes
	  login   =new UpstoxLoginPage1(driver);
	  passcode=new UpStoxPasscodePage2(driver);
	  welcome =new UpStoxWelcomePage3(driver);
	  home    =new UpStockHomePage4(driver);
	  fund    =new UpStoxFundsPage5(driver);
  }
	 
  @BeforeMethod
  public void loginToUpstox() throws EncryptedDocumentException, IOException 
  {
	//reading data from excel
	  myfile = new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
	  mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
	  //Usage all object
	  login.enterUserID(mysheet.getRow(0).getCell(0).getStringCellValue());
	  login.enterPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
	  login.clicksignIN();
	  ImplicitWaitTimeGenralMethod.waitTime(driver, 2000);
	  passcode.entercode(mysheet.getRow(0).getCell(2).getStringCellValue());
	  ImplicitWaitTimeGenralMethod.waitTime(driver, 7000);
	  welcome.clickOnnoIAmGoodButton();
	  
	  
  }
 
  @Test(priority = -1)
  public void ValidateUserID() throws IOException 
  {
	 
	  myfile = new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
	  mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	  String expectedUserID = mysheet.getRow(0).getCell(3).getStringCellValue();
	  String actualuserID   = home.getActualUserID(driver);
	  ImplicitWaitTimeGenralMethod.waitTime(driver, 5000);
	  Assert.assertEquals(actualuserID, expectedUserID,"actualuserID and expectedUserID are not matching TC is failed");
	  
	  ImplicitWaitTimeGenralMethod.waitTime(driver, 5000);
	  ScreenShotGeneralMethod.screenShotMethod(driver, actualuserID);
	  home.clickOnFundsButton();
	  ImplicitWaitTimeGenralMethod.waitTime(driver, 15000);
	  fund.checkAvailableFunds(driver);
  }
  
  @AfterMethod
  public void logoutBrowser() throws InterruptedException
  {
	  ImplicitWaitTimeGenralMethod.waitTime(driver, 500);
	  home.logoutApplication(driver);
  }
  
  @AfterClass
  public void broswerClose()
  {
	  ImplicitWaitTimeGenralMethod.waitTime(driver, 500);
	  driver.close();
  }
  
}
