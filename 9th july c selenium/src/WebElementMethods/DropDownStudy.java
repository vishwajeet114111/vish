package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class DropDownStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vishwajeet");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("ambhore");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("vishwajeetambore01@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vishwajeetambore01@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password_step_input")).sendKeys("8625999553");
		Thread.sleep(1000);
		WebElement dropdown1=driver.findElement(By.id("day"));
		Select s1=new Select(dropdown1);
		s1.selectByIndex(12);
		Thread.sleep(1000);
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select s2=new Select(dropdown2);
		s2.selectByValue("7");
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select s3=new Select(dropdown3);
		s3.selectByVisibleText("1999");
		
		
		 WebElement box = driver.findElement(By.xpath("//input[@value='2']"));
		 System.out.println(box.isSelected());
		 box.click();
		 
		 driver.findElement(By.name("websubmit")).click();
		 
	}
}
