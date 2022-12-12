package upstoxUtility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import upstoxBase.Base;

public class Test extends Base {

	public  void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		launchBrowser();
//		System.setProperty("webdriver.gecko.driver","E:\\9 JULY-C\\geckodriver.exe");
//		 WebDriver driver=new FirefoxDriver();
//		  driver.get("https://login-v2.upstox.com");
		  Utility.waitTime(driver, 1000);
		  driver.findElement(By.name("userId")).sendKeys(Utility.ExcelGenralM1("Sheet3", 0, 0));
		  

	}

}
