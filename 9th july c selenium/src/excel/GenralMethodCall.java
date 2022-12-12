package excel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import webdriver.GetText;

public class GenralMethodCall {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
	
		String dd = ExcelGenralMethod.ExcelGenralM1("Sheet3", 0, 0);
		System.out.println(dd);
		
		

	}

}
