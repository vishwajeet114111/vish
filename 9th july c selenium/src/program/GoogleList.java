package program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleList {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.goodreturns.in/gold-rates/");
		Thread.sleep(2000);
		
//		//get list of rows 
//		List<WebElement> row = 
//			 driver.findElements(By.xpath("(//table[@cellpadding='1'])[1]//tr"));
//		System.out.println("number of rows = "+row.size());
//		
//		//get list of column 
//		List<WebElement> column = 
//				 driver.findElements(By.xpath("(//table[@cellpadding='1'])[1]//tr"));
//		System.out.println("number of column = "+column.size());
//		
//		//
		List<WebElement> c1 =
			driver.findElements(By.xpath("(//table[@cellpadding='1'])[1]//tr[2]//td"));
		
		//print all data 
		for(WebElement r:c1)
		{
			System.out.println(r.getText());
		}
//		System.out.println();
//		System.out.println("====print price without $====");
//		
//		for(int i=1;i<=row.size()-1;i++)
//		{
//			WebElement row1 = row.get(i);
//			String r1=row1.getTagName();
//		}
		
		
		
		
		
		
		
	}

}
