package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodUse {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement checkbox1 = driver.findElement(By.name("checkBoxOption1"));
		System.out.println(checkbox1.isSelected());
		checkbox1.click();
		System.out.println(checkbox1.isSelected());
		
		
		
		
		
		
		
		
		
	}

}
