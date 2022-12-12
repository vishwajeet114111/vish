package facebookPOM;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import upstoxUtility.Utility;

public class FBTestClass extends FBBase {

	loginPage login;
	loginPage password;
	Homepage home;
	String str="fb vish";
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openbrowser();
		Utility.waitTime(driver, 2000);
		login=new loginPage(driver);
		password=new loginPage(driver);
		home=new Homepage(driver);
	}
	@BeforeMethod
	public void loginToFB() throws IOException 
	{
		login.enterUserID(FBUtility.readDataFromProperty("userid"));
		login.enterPassword(FBUtility.readDataFromProperty("password"));
		login.clicksignIN();
		Utility.waitTime(driver, 2000);
		
	}
    @Test
    public void validateSS() throws IOException  
   {
    	home.ButtonValidate();
    	
    	Utility.screenShotMethod(driver,str );
   }
}
