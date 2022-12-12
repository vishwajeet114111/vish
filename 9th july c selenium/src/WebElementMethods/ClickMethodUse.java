package WebElementMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys("hi vishwajeet");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
