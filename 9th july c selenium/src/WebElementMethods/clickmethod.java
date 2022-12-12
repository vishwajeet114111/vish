package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickmethod {public static void main(String[] args) throws InterruptedException 
{System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://vctcpune.com/");
Thread.sleep(1000);

driver.findElement(By.xpath("//a[contains(text(),'Practice ')]")).click();
Thread.sleep(1000);

/*driver.findElement(By.xpath("//input[@value='Radio1']")).click();
Thread.sleep(2000);*/
//driver.close();
//Thread.sleep(5000);
driver.quit();

	
}

}
