package neostox;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeostoxBase 
{
	WebDriver driver;
	public void launchbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(NeostoxUtility.readPropertyFile("url"));
		NeostoxUtility.waitTime(driver, 2000);
	}

}
