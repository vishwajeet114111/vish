package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		//1
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 WebElement source1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));	
			
		//2
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

		//3
		Actions act=new Actions(driver);
        Thread.sleep(1000);
		
               
//        act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
//        act.moveToElement(source1).clickAndHold().moveToElement(dest1).release().build().perform();
        act.dragAndDrop(source1, dest1).build().perform();
	}
	

}
