package upstoxBase;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import upstoxUtility.Utility;
import upstoxUtility.UtilityNew;



public class Base 
{
	protected WebDriver driver;
	
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://login-v2.upstox.com");
		 
		  Utility.waitTime(driver, 2000);
	}
	
	public void launchBrowser1() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get(UtilityNew.readPropertyFile("url"));
		Utility.waitTime(driver, 2000);
	}
	
	
}
