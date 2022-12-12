package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotalLastRowNumber5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");

		int lastRowNumber = mySheet.getLastRowNum();
		System.out.println("LAST ROW NUMBER IS "+lastRowNumber);
		
		int totalNumberOfRow = lastRowNumber+1;
		 
		System.out.println("TOTAL ROWS ARE "+totalNumberOfRow);
		
	}

}
