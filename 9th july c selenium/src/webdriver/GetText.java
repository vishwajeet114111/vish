package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]")).click();
		//System.out.println("text presnt on webpage is "+ text);
		
		//storing element is reference variable when we are using that element multiple times
		//Thread.sleep(3000);
		//WebElement myelement = driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]"));
		//myelement.getText();
		//System.out.println("text presnt on webpage is "+ text);
		
		
	}

}
