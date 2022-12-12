package Scrolling;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEG1 {



	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://paytm.com/");
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(1000,800)");//--->down scroll
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(1000,1900)");//--->down scroll
						//x-y coordinate
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(1000,-1900)");//-->up scroll
	}

}
