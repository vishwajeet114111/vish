package orangeHRMPOM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

@Listeners(listeners.Listener.class)
public class OrangeHRMTestNG extends OrangeHRMBase {
  
		HRMLoginPage login;
		OrangeHRMPimPage home;
	
	 @BeforeClass
	  public void openbrowser() throws IOException 
	  {
		launchbrowser(); 
		login=new HRMLoginPage(driver);
		home =new OrangeHRMPimPage(driver);
	  }
	 @BeforeMethod
	  public void beforeMethod() throws IOException 
	  {
		login.enteruserid(OrangeHRMUtility.readPropertyFile("ID")); 
		OrangeHRMUtility.waitTime(driver, 1000);
		login.enterpassword(OrangeHRMUtility.readPropertyFile("pass"));
		OrangeHRMUtility.waitTime(driver, 1000);
		login.clickonbutton();
		OrangeHRMUtility.waitTime(driver, 1000);
	  }

	@Test
	public void validateEmployList() throws IOException 
	{
		home.Pimclick();
		OrangeHRMUtility.waitTime(driver, 1000);
		Assert.assertEquals(home.getEmployeeList(),OrangeHRMUtility.readPropertyFile("expectedUserID"),"expectedUserID not match then Tc failed");
		OrangeHRMUtility.waitTime(driver, 1000);
	}
  
	@AfterMethod
	public void loginOut()
	{
		home.logintabclick(driver);
	}
	@AfterClass
	public void closeBrowse()
	{
		Reporter.log("happly close",true);
		driver.close();
		
	}

 
}
