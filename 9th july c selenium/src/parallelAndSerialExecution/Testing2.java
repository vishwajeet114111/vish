package parallelAndSerialExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing2 {
  @Test
  public void SetSize() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  Dimension DefaultSize = driver.manage().window().getSize();
	  System.out.println("default size is "+DefaultSize);
	  //Reporter.log("Default Size is " +DefaultSize);
	  
	  Dimension d=new Dimension(500, 700);
	  Thread.sleep(2000);
	  driver.manage().window().setSize(d);
	  
	  Dimension CurrentSize = driver.manage().window().getSize();
	  System.out.println("current size is "+CurrentSize);
	  //Reporter.log("Current Size is "+CurrentSize);
  }
}
