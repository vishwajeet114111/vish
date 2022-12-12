package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
		String value =
		WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(value);
		
	}

}
