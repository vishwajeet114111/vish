package setSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeUse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println("Default Size is "+defaultSize);
		
		Dimension d=new Dimension(1386, 300);
		Thread.sleep(4000);
		driver.manage().window().setSize(d);
		System.out.println(d);
		
		Thread.sleep(4000);
		Dimension currentSize = driver.manage().window().getSize();
		System.out.println(currentSize);
	}

}
