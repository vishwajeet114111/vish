package program;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphone {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("vivot1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(text(),'vivo ')])[1]")).click();
		
		Thread.sleep(2000);
		Set<String> allwebpage = driver.getWindowHandles();
		System.out.println(allwebpage);
		Thread.sleep(2000);
		
		Iterator<String> it = allwebpage.iterator();
		it.next();
		String childpage = it.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(childpage);
		List<WebElement> rating = driver.findElements(By.xpath("//ul[@class='_2jr1F_']/li"));
		Thread.sleep(2000);
		
		for(WebElement mo:rating)
		{
			System.out.println(mo.getText());
		}
	
	}
		
		

	}


