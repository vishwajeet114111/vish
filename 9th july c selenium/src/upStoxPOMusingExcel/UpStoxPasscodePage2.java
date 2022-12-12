package upStoxPOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage2 {

	//variable declaration
	@FindBy(name="yob")private WebElement passcodeField;
		
	//initialize variable
	public UpStoxPasscodePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	public void entercode(String str)
	{
		passcodeField.sendKeys(str);
	}

}
