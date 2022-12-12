package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetStringValueStudy4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//get cell type
		CellType value = mySheet.getRow(0).getCell(0).getCellType();
		System.out.println("type of cell="+value);
		System.out.println();
		
		//get string
		String value1 = mySheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("actual result="+value1);


	}

}
