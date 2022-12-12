package upStox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Scrolling.ScroolingFunctoin;

public class ValidateUserNameAndFunds {


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login-v2.upstox.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		//sending user name
		driver.findElement(By.id("userCode")).sendKeys("HD4457");
		
		//sending password
		driver.findElement(By.name("password")).sendKeys("Vish@2022");
		
		//click on sign into upstox button
		driver.findElement(By.id("submit-btn")).click();
		
		//navigating to next page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.findElement(By.name("yob")).sendKeys("1999");
		
		//clicking on massage
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		
		//validating user name
		   WebElement actualName = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]"));
		
		//using genralization class and creating scroll into view method and directly scroll on webelement
		ScroolingFunctoin.scroolingView(driver, actualName);
		System.out.println(actualName.getText());
		
		String expectedName = "vishwajeet a.";
		if(actualName.getText().equals(expectedName))
		{
			System.out.println("actual username and expected username is match");
		}
		else
		{
			System.out.println("actual username and expected username is not match");
		}
		
		//validating funds
		driver.findElement(By.id("funds")).click();
		WebElement fundprice = driver.findElement(By.xpath("((//div[@class='_2BBe9RdErXc7K8fvQxPEzj'])[1]//div)[2]"));
		System.out.println("funds avalible for trade"+fundprice.getText());
		
		
		
	}

}
