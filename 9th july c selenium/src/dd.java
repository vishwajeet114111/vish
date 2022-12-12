import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dd {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewTab")).click();
		
		 Set<String> mainpage = driver.getWindowHandles();
		System.out.println(mainpage);
		
		Iterator<String> allwindow = mainpage.iterator();
		Thread.sleep(2000);
		
		String it = allwindow.next();
		String it1 = allwindow.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(it1);
		Thread.sleep(2000);
		driver.findElement(By.className("menu-text")).click();
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(it);
		
		Thread.sleep(2000);

		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> c1 = driver.getWindowHandles();
		
		Iterator<String> cit = c1.iterator();
		String c = cit.next();
		String childpage = cit.next();
	
		driver.switchTo().window(childpage);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Home']")).click();
	
		
		
		
		
	}

}
