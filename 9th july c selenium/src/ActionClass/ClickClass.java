package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickClass {

	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	//1.find the webelement to be handled and store in ref variable
	WebElement praticeclick = driver.findElement(By.xpath("//a[text()='PRACTICE']"));
	WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
	
	//2.create an object of action class and pass driver object as arguments
	Actions act=new Actions(driver);
	
	//3.using one the actions class method take requried action
	//there are 3 ways
	//1.move cursor & click
	//	act.moveToElement(praticeclick).perform();
	//	act.click().perform();
	
	//	
	//2.combin two methods and use build
//	act.moveToElement(radio1).click().build().perform();
//	act.moveToElement(praticeclick).click().build().perform();

	//3.action click target method only
	//act.click(praticeclick).perform();
	act.click(radio1).perform();	
		
	}

}
