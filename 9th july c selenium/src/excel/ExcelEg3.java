package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		//last number of rows
		int lastRowNum = mySheet.getLastRowNum();
		System.out.println("last rows num is "+lastRowNum);
		
		//total number of row 
		int totalNumRows = lastRowNum+1;
		System.out.println("total rows are "+totalNumRows);
		
		//total number of cell/column
		short lastCellNum = mySheet.getRow(1).getLastCellNum();		
		System.out.println("Last cell number is "+lastCellNum);
		
		short totalNumofcells = lastCellNum;
		System.out.println("total cell are "+totalNumofcells);
		
		int totalcell= mySheet.getRow(totalNumofcells).getLastCellNum()-1;
		System.out.println(totalcell);
		for(int i=0;i<=totalcell;i++)
		{
			System.out.print(mySheet.getRow(0).getCell(i).getStringCellValue()+" ");
			
		}
		System.out.println();
		System.out.println("===========================================");
		//row
		for(int i=0;i<=lastRowNum;i++)
		{
			System.out.println(mySheet.getRow(i).getCell(0).getStringCellValue());
		}
		System.out.println();
		//all excel sheet
		for(int i=0;i<=lastRowNum;i++)
		{
			for(int j=0;j<=totalcell;j++)
			{
				System.out.print(mySheet.getRow(i).getCell(j).getStringCellValue()+" ");
			}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
