package ActionClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import excel.ExcelGenralMethod;

public class ActionAllMethods {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");

	 
	WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Actions act =new Actions(driver);
		act.scrollToElement(dropdown).perform();
		
	
	}

}
