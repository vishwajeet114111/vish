package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeyFACEBOOK {public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://m.facebook.com/login/?locale2=en_GB");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8625999553");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Vish@2022");
	driver.findElement(By.xpath("//button[@value='Log In']")).click();
	
	
	
	
	
	
	
	
	
	
	
}

}
