package JavascriptExecutorStudy;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sendkeysMethod2 
{
	public static void sendkeys(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='vishwajeetambore01@gmail.com'", element);
	}
}
