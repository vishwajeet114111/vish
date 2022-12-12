package setSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Size1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\9 JULY-C\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//		Dimension defalut = driver.manage().window().getSize();
//		System.out.println(defalut);
//		
//		Dimension d=new Dimension(790, 600);
//	
//		driver.manage().window().setSize(d);
//		
//		System.out.println(driver.manage().window().getSize());
//		
	System.out.println(driver.manage().window().getPosition());
	Point p=new Point(-290, -265);
	driver.manage().window().setPosition(p);
	System.out.println(driver.manage().window().getPosition());
		
		

	}

}
