package screenshot;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class callgenralmethod {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		Thread.sleep(2000);
		ScreenShotGeneralMethod.screenShotMethod(driver,"kite");
	}

	}


