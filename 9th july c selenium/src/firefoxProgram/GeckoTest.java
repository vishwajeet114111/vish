package firefoxProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GeckoTest {
  @Test
  public void f() 
  {
	  System.setProperty("webdriver.gecko.driver","E:\\9 JULY-C\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver(); 
	  driver.get("https://www.facebook.com/");
  }
}
