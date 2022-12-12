package neostox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

@Listeners(listeners.Listener.class)
public class NeostoxTestNG extends NeostoxBase {
	
	NeostoxLoginPage login;
	WelcomePage      wcome;
	NeostoxHomePage	 home;
	
	@BeforeClass
	 public void openbrowser() throws IOException 
	 {
		 launchbrowser();
		 login=new NeostoxLoginPage(driver);
		 wcome=new WelcomePage(driver);
		 home =new NeostoxHomePage(driver);
	 } 
	 @BeforeMethod
	 public void loginfunction() throws IOException, InterruptedException 
	 {
		 login.enteruserID(NeostoxUtility.readPropertyFile("id"));
		 login.clickonsingup();
		 login.enterpassword(NeostoxUtility.readPropertyFile("pass"));
		 wcome.clikeonbuttons();
	 }
	@Test
	 public void validateuserid() throws IOException, InterruptedException 
	 {
		Assert.assertEquals(home.validatepeofile(driver),NeostoxUtility.readPropertyFile("actualUserId"),"actualUserId is not match then TC fails");
		Reporter.log("both profilename match TC pass", true);
		NeostoxUtility.waitTime(driver, 2000);
		home.validateFundAmount();
		Thread.sleep(6000);
	 }	
	@AfterMethod
	public void clickonlogout() throws InterruptedException 
	{
		home.clickonLogout();
	}
	@AfterClass
	public void closebrowser() 
	{
		Reporter.log("Close Browser Sucussfully",true);
		driver.close();
	}

}
