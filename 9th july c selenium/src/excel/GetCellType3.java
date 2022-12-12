package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellType3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		Row myRow = mySheet.getRow(5);
		Cell myCell = myRow.getCell(5);
		CellType myType = myCell.getCellType();
		System.out.println(myType);
	}

}
