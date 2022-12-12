package JavascriptExecutorStudy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickMethod3 
{
	public static void clickButton(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click()", element);
	
	}

}
