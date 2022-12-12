package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement createNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		Actions act=new Actions(driver);
		act.click(createNewAccount).perform();
		Thread.sleep(5000);
		
		//name
//		driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		act.keyDown(Keys.SHIFT).sendKeys("v").keyUp(Keys.SHIFT).sendKeys("ishwajeet").build().perform();
//		
		//surname
//		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
//		act.keyDown(Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).sendKeys("mbhore").build().perform();
//		
//		//email
		WebElement email = driver.findElement(By.name("reg_email__"));
		act.sendKeys(email, "hivishwajeet").perform();
	
//		//reenter email
//		driver.findElement(By.xpath("(//input[@type='text'])[5]"));
//		act.sendKeys(email, "hivishwajeet@gmail.com").perform();
//		
//		//password
//		driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//		act.keyDown(Keys.SHIFT).sendKeys("v").keyUp("ish2022").build().perform();
//		
//		WebElement day = driver.findElement(By.name("birthday_day"));
//		act.click(day).perform();
//		Thread.sleep(2000);
//		
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ENTER).perform();
	}

}
