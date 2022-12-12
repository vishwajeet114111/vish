package rev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//===================================================================
		String url = driver.getCurrentUrl();
		System.out.println("url is "+url);
		//===================================================================
		
		System.out.println(driver.getTitle());
		
		//====================================================================
		Thread.sleep(3000);
		WebElement hi = driver.findElement(By.xpath("//div[text()='Sign Up']"));
		System.out.println(hi.getText());
		//=========================================================
		
		WebElement male = driver.findElement(By.name("sex"));
		System.out.println(male.isSelected());
		
		//==========================================
		WebElement sing = driver.findElement(By.name("websubmit"));
		System.out.println(sing.isEnabled());
		System.out.println(sing.isDisplayed());
		
		//=================================
		driver.findElement(By.name("firstname")).sendKeys("vishwajeet");
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).clear();
		//=========================================
		Thread.sleep(200);
		driver.quit();
		
	}

}
