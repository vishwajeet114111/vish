package testNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotations2 {
  @Test(invocationCount = 1,priority = -1)
  public void NSE() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.nseindia.com/");
		Reporter.log("NSE is running");
		driver.close();
  }
  @Test(priority = 0)
  public void BSE() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bseindia.com/");
		Reporter.log("BSE is running");
		driver.close();
  }
  
  @Test(dependsOnMethods = {"BSE"},timeOut = 2000)
  public void UPSTOX() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://upstox.com/");
		Reporter.log("UPSTOX is running");
  }
  
  @Test(enabled = false)
  public void UPSTOX1() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://upstox.com/");
		Reporter.log("UPSTOX1 is running");
  }
}
