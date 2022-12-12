package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myFile=new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");

		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		  int row = mySheet.getLastRowNum();
		  int lastcell = mySheet.getRow(row).getLastCellNum()-1;
		  
		  for(int i=0;i<=row;i++)
		  {
			for(int j=0;j<=lastcell;j++)
			{
				System.out.print(mySheet.getRow(i).getCell(j).getCellType()+" ");
			}

			  	System.out.println();
		    }
		  
		  System.out.println("=============================================");
		  
		  for(int k=0;k<=row;k++)
		  {
			  for(int l=0;l<=lastcell;l++)
			  {
				  Cell mycell = mySheet.getRow(k).getCell(l);
				  CellType datatype = mycell.getCellType();
				  
			if(datatype==CellType.STRING)
			{
				System.out.print(mycell.getStringCellValue()+" ");
			}
				  
			else if(datatype==CellType.NUMERIC)
			{
				System.out.print(mycell.getNumericCellValue()+" ");
			}
			else if (datatype==CellType.BOOLEAN)
			{
				System.out.print(mycell.getBooleanCellValue()+" ");
			}
			else if(datatype==CellType.BLANK)
			{
				System.out.print(mycell.getStringCellValue()+" ");
			}
						  
			  }
			 
			  System.out.println();
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
