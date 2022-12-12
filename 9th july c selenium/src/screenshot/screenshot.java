package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException 
	{ System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores");
		File sky = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dist=new File("C:\\Users\\SD\\Desktop\\vishw\\9th july c selenium\\src\\screenshot\\vish1.png");
		FileHandler.copy(sky, dist);
		

	}

}
