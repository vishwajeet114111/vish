package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://paytm.com/");
	
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println("dj"+title);
	
	
	/*driver.manage().window().maximize();
	String currentUrl=driver.getCurrentUrl();
	System.out.println("current opened url is"+currentUrl);*/
	
}

}
