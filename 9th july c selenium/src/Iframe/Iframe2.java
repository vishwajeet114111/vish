package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		
		Thread.sleep(1000);
		driver.switchTo().frame(9);
		String text = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		System.out.println(text);
		
		
	}

}
