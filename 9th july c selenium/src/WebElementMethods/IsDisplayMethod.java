package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		textbox.click();
		System.out.println(textbox.isDisplayed());
		textbox.sendKeys("hi vishwajeet");
		
		
		
	}

}
