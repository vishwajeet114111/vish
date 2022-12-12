package TextNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login-v2.upstox.com");
		driver.close();
  }
  @Test
  public void a() {
	  System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://login-v2.upstox.com");
	  driver.close();
  }
  @Test
  public void c()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://kite.zerodha.com/");
	  driver.close();
  }
  
}
