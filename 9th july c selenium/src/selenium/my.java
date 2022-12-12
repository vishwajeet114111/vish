package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=nse&sxsrf=ALiCzsbCR_MxnS3UzoI-EJ5TZ_G5mW6Eiw%3A1662718114484&source=hp&ei=ohAbY6eoGsOhmAX9-LKgCw&iflsig=AJiK0e8AAAAAYxsesgWzJ7LxC59RXoND2mZo7AXtQ6Cq&oq=&gs_lcp=Cgdnd3Mtd2l6EAEYADIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzINCC4QxwEQ0QMQ6gIQJzoECCMQJzoKCAAQsQMQgwEQQzoECAAQQzoQCAAQgAQQhwIQsQMQgwEQFDoLCAAQgAQQsQMQgwE6DggAEIAEELEDEIMBEMkDOgUIABCSAzoRCC4QgAQQsQMQgwEQxwEQ0QNQ8glY8xVgvKMeaAdwAHgAgAGGAogBuQWSAQUwLjEuMpgBAKABAbABCg&sclient=gws-wiz");
		
		driver.findElement(By.xpath("//h3[contains(text(),'NSE - National')][1]")).click();
		
	}
}
