package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\9 JULY-C\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.bseindia.com/");
		/*getTitle: this method is use to get title of a
		webpage. return type of getTitle method is String.*/
		
		System.out.println(driver.getTitle());
		String mytitle =driver.getTitle();
		System.out.println("title of webPage is "+mytitle);
		
		
		
	}

}
