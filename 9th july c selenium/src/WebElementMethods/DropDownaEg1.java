package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownaEg1 {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	Thread.sleep(1000);
	
	//1. identify list box to be handled and store it in reference variable
	WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	
	//2.crate an object of select class which will accept Webelement as argument
	Select s=new Select(dropdown);
	
	//3. by using one of the select class methods we can select values from list box like 
	//	1.select ByVisibleText:selectByVisibleText(string agr0)
	//  2.select ByIndex:selectByIndex(int arg0)
	//  3.select ByValue:selectByValue(string agr0)
	
	s.selectByVisibleText("Option1");
	Thread.sleep(1000);
	s.selectByIndex(3);
	Thread.sleep(1000);
	s.selectByValue("option2");
	
}

}
