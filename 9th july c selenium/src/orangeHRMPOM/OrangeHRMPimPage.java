package orangeHRMPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OrangeHRMPimPage 
{
	@FindBy (xpath = "//span[text()='PIM']")private WebElement PIM;
	@FindBy (xpath = "//a[text()='Employee List']")private WebElement employeeLIST;
	@FindBy (xpath = "//span[contains(text(),'Records Found')]")private WebElement records;
	@FindBy (xpath = "//span[@class='oxd-userdropdown-tab']")private WebElement logouttab ;
	@FindBy (xpath = "//a[text()='Logout']")private WebElement logout;

	public OrangeHRMPimPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Pimclick()
	{
		PIM.click();
		Reporter.log("clicking on pim",true);
	}
	
	public String getEmployeeList()
	{
		String emp = employeeLIST.getText();
		System.out.println(emp);
		Reporter.log("get text on emp list",true);
		return emp;	
		
	}
	
	public String getRecordsFound()
	{
		 String rec = records.getText();
		 System.out.println(rec);
		 Reporter.log("get text on emp list",true);
		 return rec;
	}
	
	public void logintabclick(WebDriver driver)
	{
		logouttab.click();
		OrangeHRMUtility.waitTime(driver, 1000);
		logout.click();
		Reporter.log("succesfully logout",true);
	}
	
	
	
	
	
	
	
	
}
