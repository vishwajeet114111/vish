package program;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Honda");
		Thread.sleep(2000);
		Set<String> mainwindow = driver.getWindowHandles();
		System.out.println(mainwindow);
		
		
		List<WebElement> searchsuggestion = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		Thread.sleep(2000);
		
		for( WebElement search:searchsuggestion)
		{
			System.out.println(search.getText());
			String ha = "honda amaze";
			
			
			if(ha.equals(search.getText()))
			{
				search.click();
				driver.findElement(By.xpath("//a[text()='Images']")).click();
				List<WebElement> count = driver.findElements(By.tagName("img"));
				System.out.println(count.size());
				break;
			}
		}
//=======================================================
	
		
		
	}}
