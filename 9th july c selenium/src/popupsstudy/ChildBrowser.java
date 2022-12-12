package popupsstudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver", "E:\\9 JULY-C\\chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);

	//to get ID of main page  use getWindowHandle--->
	String mainpageID = driver.getWindowHandle();
	System.out.println(mainpageID);
	
	//open new tab
	driver.findElement(By.name("NewTab")).click();
	
	//
	Set<String> AllwebpageID = driver.getWindowHandles();
	System.out.println(AllwebpageID);
	
	System.out.println("=========iterator==========");
	//to get desired page id use iterator and use next method to move ahead
	Iterator<String> it = AllwebpageID.iterator();
	String mainpageID1 = it.next();
	String childpageID = it.next();
	Thread.sleep(3000);
	
	System.out.println(mainpageID1);
	System.out.println(childpageID);
	
	System.out.println("======use for each========");
	//use for each
	for(String ap:AllwebpageID)
	{
		System.out.println(ap);
	}
	
	System.out.println("===========child page===========");
	//switching selenium focus from main page to child page
	Thread.sleep(3000);
	//driver.manage().window().maximize();
	
	driver.switchTo().window(childpageID);
	
	String childpageID1 = driver.getWindowHandle();
	System.out.println(childpageID1);
	
	System.out.println("===new window====");
	Thread.sleep(2000);
    //driver.close();

    driver.switchTo().window(mainpageID);
    Thread.sleep(1000);
    driver.findElement(By.name("NewWindow")).click();
    
    Set<String> allwindow = driver.getWindowHandles();
    
    Iterator<String> its = allwindow.iterator();
    String c1 = its.next();
    String c2 = its.next();
    Thread.sleep(1000);
    driver.switchTo().window(c2);
    Thread.sleep(2000);
    driver.findElement(By.name("//span[text()='Home']")).click();
  
    
    
    
    
    
    
    
    
//    Thread.sleep(6000);
//    String child = driver.getWindowHandle();
//    //Thread.sleep(6000);
//    System.out.println(child);
//   // Thread.sleep(6000);
//    
//    driver.findElement(By.className("lines-button ")).click();
//	Set<String> c2 = driver.getWindowHandles();
//	driver.switchTo().window("c2");
//	System.out.println(c2);
//	
	
	
	
	
	
	
	
	}

}
