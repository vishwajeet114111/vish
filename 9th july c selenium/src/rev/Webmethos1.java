package rev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webmethos1 
{public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.navigate().to("https://demoqa.com/browser-windows");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button#tabButton")).click();
	Thread.sleep(3000);

	
	driver.navigate().back();
//	driver.navigate().refresh();
}

	

}
