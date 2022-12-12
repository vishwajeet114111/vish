package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		//1.get:-to enter url in browser or to open an application.
		driver.get("https://vctcpune.com/");
		//Thread.sleep(2000);
		//driver.get("https://pizzaonline.dominos.co.in/");
		
		//2.close:- to close the current tab of the browser opened by Selenium tool.
		//driver.close();
		
		//3.quit:- to close the all the tabs present in browser opened by Selenium tool.
		//driver.quit();
		
		// 4. maximize/ minimize() - used to maximize/ minimize the browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		
		
		
	}

}
