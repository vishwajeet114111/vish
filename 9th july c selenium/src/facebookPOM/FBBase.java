package facebookPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBBase 
{
	protected WebDriver driver;
	public void openbrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(FBUtility.readDataFromProperty("url"));
		
		
	}

}
