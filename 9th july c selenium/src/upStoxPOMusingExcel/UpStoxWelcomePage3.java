package upStoxPOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxWelcomePage3 {
	
	    //variable declaration
		@FindBy(xpath = "//div[text()='No, I’m good']") private WebElement noIAmGoodButton;
		
		//initialize variable
		public UpStoxWelcomePage3(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		//usage
		public void clickOnnoIAmGoodButton()
		{
		noIAmGoodButton.click();
		}

}
