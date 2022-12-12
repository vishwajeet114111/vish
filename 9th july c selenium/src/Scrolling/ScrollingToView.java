package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToView {

	

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		WebElement UPIMoneyTransfer = driver.findElement(By.xpath("//div[contains(text(),'Pay anyone')]"));
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",UPIMoneyTransfer);
		
//		//call another class
//		ScroolingFunctoin.scroolingView(driver, UPIMoneyTransfer);
	
	
	
	
	
	
	
	
	
	
	}

}
