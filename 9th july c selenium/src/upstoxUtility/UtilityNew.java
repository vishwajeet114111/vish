package upstoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class UtilityNew 
{	
	public  static String readPropertyFile(String key) throws IOException 
	{
		Properties pro =new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\HP\\Documents\\java\\9th july c selenium\\property.properties");
		pro.load(myfile);
		String value = pro.getProperty(key);
		return value;
		
	}
	public static void waitTime(WebDriver driver,long waitTime) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		
	}
	public static void scroolingView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",element);
	}

	public static void screenShotMethod(WebDriver driver,String str) throws IOException 
	{
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\9 JULY-C\\ss"+str+".jpg");
		
		FileHandler.copy(Src, dest);
	}
	public static String ExcelGenralM1(String str,int r,int c) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet(str);
		String value = mysheet.getRow(r).getCell(c).getStringCellValue();
		return value ;
		
	}

	

}
