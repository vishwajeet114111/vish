package screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;


public class screenshot1 {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.bankofamerica.com/");
		 String str=RandomString.make(2);
		
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest= new File("E:\\9 JULY-C\\ss\\mumbai.png"); 
		 FileHandler.copy(source, dest);
	}

	
	}


