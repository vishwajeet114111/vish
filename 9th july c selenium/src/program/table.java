package program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println("total no of rows "+row.size());
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//tr//th"));
		System.out.println("total no of columns "+columns.size());
	
		List<WebElement> tabletext=driver.findElements(By.xpath("//table[@id='product']//tr"));
		for(WebElement o:tabletext)
		{
			System.out.println(o.getText());
		}
	
	
	}

}
