package kitePOMusingExcel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasscodePage3 
{
	@FindBy(xpath = "//input[@type='text']")private WebElement code;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continuebutton;
	
	public PasscodePage3()
	{
		PageFactory.initElements(code,this);
	}

	public void EnterPasscode(String str) 
	{
		code.sendKeys(str);
	}
	public void ClickContinue() 
	{
		continuebutton.click();;
	}
}
