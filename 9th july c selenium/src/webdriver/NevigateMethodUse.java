package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigateMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.bseindia.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://www.nseindia.com/option-chain");
		Thread.sleep(1000);
		
		//BACK
		driver.navigate().back();
		Thread.sleep(1000);
		
		//forward
		driver.navigate().forward();
		Thread.sleep(1000);
		//refresh
		driver.navigate().refresh();

	}
	

}
