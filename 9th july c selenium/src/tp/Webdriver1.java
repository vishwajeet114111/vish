package tp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		

	}

}
