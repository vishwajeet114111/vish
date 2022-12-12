package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.switchTo().frame(2);
		//driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
		
		
		

	}

}
