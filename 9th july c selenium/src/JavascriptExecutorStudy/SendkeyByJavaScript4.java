package JavascriptExecutorStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SendkeyByJavaScript4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		//sendkeys
		WebElement userid = driver.findElement(By.name("email"));
		sendkeysMethod2.sendkeys(driver, userid);
		//click
		WebElement login = driver.findElement(By.name("login"));
		ClickMethod3.clickButton(driver, login);
		
	}

}













