package ChromeOptionClass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import webdriver.GetText;


public class ChromeOptionClassStudy {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		
	ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.addArguments("incognito");
		opt.addArguments("--disable-notifications");
		opt.addArguments("--headless");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.justdial.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		String tital= driver.getTitle();
		System.out.println(tital);
		driver.findElement(By.className("hotkeys-text")).click();

		
	}

}
