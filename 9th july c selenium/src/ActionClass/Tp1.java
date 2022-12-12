package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tp1 {

	public static void main(String[] args) 
	{System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	 WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));	
	WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
	//call action class
	Actions act=new Actions(driver);
	
	act.dragAndDrop(source, target).perform();
	
	
	
	
	
	}

}
