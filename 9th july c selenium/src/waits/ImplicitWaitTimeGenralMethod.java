package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class ImplicitWaitTimeGenralMethod
{
	public static void waitTime(WebDriver driver,long waitTime) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		
	}
	

}
