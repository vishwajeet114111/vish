package upStoxPOM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxTest {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://login-v2.upstox.com");

	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	//create an object of UpstoxLoginPage
	UpstoxLoginPage1 login=new UpstoxLoginPage1(driver);
	login.enterUserID();
	login.enterPassword();
	login.clicksignIN();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	//create an object of UpStoxPasscodePage
	UpStoxPasscodePage2 code=new UpStoxPasscodePage2(driver);
	code.entercode();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	//create an object of UpStoxWelcomPage
	UpStoxWelcomePage3 welcomepage=new UpStoxWelcomePage3(driver);
	welcomepage .clickOnnoIAmGoodButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
	//create an object of UpStoxHomePage
	Thread.sleep(5000);
	UpStockHomePage4 homepage =new UpStockHomePage4(driver);
	homepage.validateUserID(driver);
	homepage.clickOnFundsButton();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	//create an object of UpStoxfundPage
	UpStoxFundsPage5 fundpage=new UpStoxFundsPage5(driver);
	fundpage.checkAvailableFunds();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
