package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pratice1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.justdial.com/");
		File justdial = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dist=
		new File("E:\\9 JULY-C\\ss\\justdial.png");
		FileHandler.copy(justdial, dist);
		
	}

}
