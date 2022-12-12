package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClass {

	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement Rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act =new Actions(driver);
		//1
//		act.moveToElement(Rightclick).perform();
//		act.contextClick().perform();
//		
		//2
	//	act.moveToElement(Rightclick).contextClick().build().perform();
		
		//3
		act.contextClick(Rightclick).perform();
		
		
	
}
	
	
	
	
	
	
}
