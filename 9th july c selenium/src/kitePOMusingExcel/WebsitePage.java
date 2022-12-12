package kitePOMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebsitePage 
{

	@FindBy(xpath = "(//a[@class='button'])[1]")private WebElement buttonkite;
	
	public WebsitePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonbutton()
	{
		buttonkite.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
