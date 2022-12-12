package upStoxPOMusingExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTest1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://login-v2.upstox.com");

	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	//reading data from excel
	 File myfile = new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
	 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
	
	 //create an object of UpstoxLoginPage
	UpstoxLoginPage1 login=new UpstoxLoginPage1(driver);
	login.enterUserID(mysheet.getRow(1).getCell(0).getStringCellValue());
	login.enterPassword(mysheet.getRow(1).getCell(1).getStringCellValue());
	login.clicksignIN();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	//create an object of UpStoxPasscodePage
	UpStoxPasscodePage2 code=new UpStoxPasscodePage2(driver);
	code.entercode(mysheet.getRow(1).getCell(2).getStringCellValue());
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	//create an object of UpStoxWelcomPage
	UpStoxWelcomePage3 welcomepage=new UpStoxWelcomePage3(driver);
	welcomepage .clickOnnoIAmGoodButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
	//create an object of UpStoxHomePage
//	Thread.sleep(5000);
	UpStockHomePage4 homepage =new UpStockHomePage4(driver);
	homepage.validateUserID(driver, mysheet.getRow(1).getCell(3).getStringCellValue());
	homepage.clickOnFundsButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//create an object of UpStoxfundPage
	UpStoxFundsPage5 fundpage=new UpStoxFundsPage5(driver);
	fundpage.checkAvailableFunds(driver);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
