package FindElementuse;

import java.awt.RenderingHints.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoOfPhotoOnWebPage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		Actions act =new Actions(driver);
		WebElement button = driver.findElement(By.name("q"));
		act.click(button);
		act.keyDown(Keys.SHIFT).sendKeys("P").keyUp(Keys.SHIFT).sendKeys("ranav chalse").build().perform();
 
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		

		 List<WebElement> image = driver.findElements(By.tagName("img"));
		 System.out.println(image.size());
		 
	
		
	

	}

	

}
