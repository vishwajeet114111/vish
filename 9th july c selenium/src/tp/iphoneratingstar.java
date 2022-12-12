package tp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iphoneratingstar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		//close popups window
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		//search iphone
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		//click on submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//click on iphone11
		driver.findElement(By.className("_1fQZEK")).click();
		
		//window id 
		Set<String> AllwebpageID = driver.getWindowHandles();
		System.out.println(AllwebpageID);
		
		//iterator
		Iterator<String> it = AllwebpageID.iterator();
		String mainpageID1 = it.next();
		String childpageID = it.next();
		
		Thread.sleep(3000);
		//focus on next webpage
		driver.switchTo().window(childpageID);
		
		//findout the list of all rating star
		List<WebElement> rating= driver.findElements(By.xpath("//ul[@class='_36LmXx']/li"));
		Thread.sleep(2000);
		
		for( WebElement ratingstar:rating)
		{	
			System.out.println(ratingstar.getText());
			String firststar = "5,384";
		if(firststar.equals(ratingstar.getText()))
		{
			ratingstar.click();
			break;
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		Set<String> mainwindow = driver.getWindowHandles();
//		System.out.println(mainwindow);
//		
//		driver.findElements(By.className("col-12-12 _1MRYA1 _38UFBk")).get
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
