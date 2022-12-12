package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Reporter;


public class AnnotationsStudy {
  @Test
  public void GoogleTest() 
  {
	Reporter.log("Google meet test is done", true);  
  }
  
  @BeforeMethod
  public void launchBrowser() 
  {
	  Reporter.log("Browser launched-->before method Executed",true);
  }

  @AfterMethod
  public void closeBrowser()
  {
	  Reporter.log("Browser close-->after method Executed",true);
  }
  @Test
  public void RediffMailTest()
  {
	  Reporter.log("RediffMail test is done",true);
  }
  
  @BeforeMethod
  public void launchBrowser1() 
  {
	  Reporter.log("Browser launched-->before method Executed",true);
  }

  @AfterMethod
  public void closeBrowse1()
  {
	  Reporter.log("Browser close-->after method Executed", true);
	
  }


}
