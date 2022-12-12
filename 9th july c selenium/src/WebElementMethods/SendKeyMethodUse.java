package WebElementMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyMethodUse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vishwajeetambore01@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	
	
	
	}

}
