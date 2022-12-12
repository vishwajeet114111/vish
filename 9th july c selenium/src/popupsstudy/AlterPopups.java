package popupsstudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlterPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(7000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();
		
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(5000);
//		Alert alt2 = driver.switchTo().alert();
//		Thread.sleep(5000);
//		alt2.dismiss();
//		
		
		
		
		
		
	}

}
