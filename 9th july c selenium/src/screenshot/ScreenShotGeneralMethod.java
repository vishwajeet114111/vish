package screenshot;


import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotGeneralMethod{
	public static void screenShotMethod(WebDriver driver,String str) throws IOException 
	{
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\9 JULY-C\\ss"+str+".jpg");
		
		FileHandler.copy(Src, dest);
	}
}
