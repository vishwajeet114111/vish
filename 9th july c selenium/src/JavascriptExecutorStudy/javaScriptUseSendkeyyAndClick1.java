package JavascriptExecutorStudy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Scrolling.ScroolingFunctoin;

public class javaScriptUseSendkeyyAndClick1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//sendkey userid
		WebElement userid = driver.findElement(By.name("email"));
		js.executeScript("arguments[0].value='vishwajeetambore01@gmail.com'", userid);
		
		Thread.sleep(2000);
		//sendkey password
		WebElement login = driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].value='Vish@2021'", login);
		
		Thread.sleep(2000);
		//ScroolingFunctoin.scroolingView(driver, login);
		
		
		//click
		WebElement loginbutton = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].scrollIntoView();",loginbutton);
		File dist=new File("C:\\Users\\SD\\Desktop\\vishw\\9th july c selenium\\src\\screenshot\\vish1.png");
		
		js.executeScript("arguments[0].click()", loginbutton);
		
		

	}

}
