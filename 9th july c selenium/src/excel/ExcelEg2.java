package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create a file in excel sheet and store in file object.
		File myFile=new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
		
		String value=
		WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		double value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue();
		System.out.println(value1);
		
		boolean value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		System.out.println(value2);
		
	
	}

}
