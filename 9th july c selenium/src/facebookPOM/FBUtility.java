package facebookPOM;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class FBUtility 
{
	public static String readDataFromProperty(String key1) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\Documents\\java\\9th july c selenium\\src\\facebookPOM\\FBproperty.properties");
		pro.load(file);
		String value = pro.getProperty(key1);
		return value;
	
	}

}
