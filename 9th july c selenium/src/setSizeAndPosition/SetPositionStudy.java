package setSizeAndPosition;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args)
	{System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	Point CurrentPosition = driver.manage().window().getPosition();
	System.out.println("currentPostion is "+CurrentPosition);
	
	}

}
