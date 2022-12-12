package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelGenralMethod {

	public static String ExcelGenralM1(String str,int r,int c) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet(str);
		String value = mysheet.getRow(r).getCell(c).getStringCellValue();
		return value ;
		
	}

}
