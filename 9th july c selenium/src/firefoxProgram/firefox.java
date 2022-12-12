package firefoxProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\9 JULY-C\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/");
	}

}
