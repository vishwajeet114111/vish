package orangeHRMPOM;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMBase 
{
	WebDriver driver;
	public void launchbrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(OrangeHRMUtility.readPropertyFile("url"));
		OrangeHRMUtility.waitTime(driver, 1000);
	}
		
	

}
