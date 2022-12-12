package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(13000);
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		WebElement OtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean result = OtpButton.isEnabled();
		System.out.println("get OTP button enable status is "+result);
		Thread.sleep(4000);
		WebElement mobileNoField = driver.findElement(By.id("mobileNumber"));
		mobileNoField.sendKeys("8625999553");
		Thread.sleep(4000);
		boolean result1 = OtpButton.isEnabled();
		System.out.println("get OTP button enable status is "+result1);
		
		OtpButton.click();
		
		
		
	}

}
