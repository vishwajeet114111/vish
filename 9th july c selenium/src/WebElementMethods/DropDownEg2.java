package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Select sday = new Select(day);
		sday.selectByValue("12");

		

	}

}
