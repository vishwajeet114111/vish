package upStox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Scrolling.ScroolingFunctoin;

public class ValidateUserNameAndFundsUsingExcel {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login-v2.upstox.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		//sending user name
		driver.findElement(By.id("userCode")).sendKeys();
		//sending password
		driver.findElement(By.name("password")).sendKeys();
		//click on sign into upstox button
		driver.findElement(By.id("submit-btn")).click();
		//navigating to next page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.name("yob")).sendKeys();
		
		//clicking on massage
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		//validating user name
		WebElement actualName = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		
		//using genralization class and creating scroll into view method and directly scroll on webelement
		ScroolingFunctoin.scroolingView(driver, actualName);
		System.out.println(actualName.getText());
	}

}
