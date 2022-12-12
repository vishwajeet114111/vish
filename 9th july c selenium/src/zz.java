import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.goodreturns.in/gold-rates/");
		Thread.sleep(2000);
		List<WebElement> c1 =
				driver.findElements(By.xpath("(//table[@cellpadding='1'])[1]//tr[2]//td"));
			
			//print all data 
			for(WebElement r:c1)
			{
				System.out.println(r.getText());
			}
	}

}
