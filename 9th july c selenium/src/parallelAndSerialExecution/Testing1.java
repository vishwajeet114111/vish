package parallelAndSerialExecution;

import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testing1 {
  @Test
  public void SetPosition() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  
	   Point DefaultPosition = driver.manage().window().getPosition();
	  System.out.println("default position is "+DefaultPosition);
	  //Reporter.log("Default Size is " +DefaultSize);
	  
	  Point p=new Point(150, 170);
	  Thread.sleep(2000);
	  driver.manage().window().setPosition(p);

	   Point CurrentPosition = driver.manage().window().getPosition();
	  System.out.println("current position is "+CurrentPosition);
	  //Reporter.log("Current Size is "+CurrentSize);
  }
}
