package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		
//		//total time run 30 sec
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//a[text()='Live Scores']")).click();

		//total time run 16 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
		driver.findElement(By.xpath("//a[text()='Live Scores']")).click();
	}

}
