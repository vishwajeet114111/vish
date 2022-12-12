package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		
		WebElement scores = driver.findElement(By.xpath("//a[text()='Live Scores']"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(100));
		w.until(ExpectedConditions.visibilityOf(scores));
		scores.click();

	}

}
