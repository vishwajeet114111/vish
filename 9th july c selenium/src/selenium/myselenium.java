package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myselenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
