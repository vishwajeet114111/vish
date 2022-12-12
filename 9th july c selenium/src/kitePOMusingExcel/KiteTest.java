package kitePOMusingExcel;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://zerodha.com/products/kite");
		
		Thread.sleep(3000);
		 //create an object of WebsitePage
		WebsitePage kite=new WebsitePage(driver);
		kite.clickonbutton();
		Thread.sleep(2000);
		//================================================
		//================================================
		
		Set<String> mainpage = driver.getWindowHandles();
		Thread.sleep(2000);
		
		Iterator<String> it = mainpage.iterator();
		it.next();
		String childpage = it.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(childpage);
		//================================================
		//================================================
		File myfile=new File("E:\\\\9 JULY-C\\\\Excelsheet Reading.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		
		//create an object of kiteloginpage
		Thread.sleep(3000);
		KiteLoginPage logpage=new KiteLoginPage(driver);
		logpage.SendUserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		logpage.SendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		logpage.LoginButton();
		
		//create an object of passcodepage
		Thread.sleep(3000);
		PasscodePage3 codepage=new PasscodePage3();
		//enter code manually  
		codepage.EnterPasscode("940862");
		codepage.ClickContinue();
		
		
	
	  
	  
		 
		
		
		

	}

}
