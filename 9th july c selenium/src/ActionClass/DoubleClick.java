package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
public static void main(String[]agrs) 
{System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
WebElement doubleclick = driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
Actions act=new Actions(driver);
//1
//act.moveToElement(doubleclick).perform();
//act.doubleClick().perform();

//2
//act.moveToElement(doubleclick).doubleClick().build().perform();

//3
act.doubleClick(doubleclick).perform();
	
}
}
