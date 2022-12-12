package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dominos.co.in/");
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//a[text()='OUR MENU']")).click();
		

	}

}
