package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPage1 {

		//variable declaration
		@FindBy(name="userId") private WebElement userID;
		@FindBy(name="password")private WebElement password;
		@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement signIN;

		//variable initialization
		public UpstoxLoginPage1 (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//variable Usage using method
		public void enterUserID()
		{
			userID.sendKeys("HD4457");	
		}
		public void enterPassword()
		{
			password.sendKeys("Vish@2022");	
		}
		public void clicksignIN()
		{
			signIN.click();	
		}








}


