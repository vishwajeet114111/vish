package excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowAndColumn6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		File myFile=new File("E:\\9 JULY-C\\Excelsheet Reading.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		//how to read row 
		System.out.println("----------row-------------");
		for(int i=0;i<=5;i++)
		{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+" ");
			
		}
		System.out.println();
		//how to read column
		System.out.println("----------column-------------");
		for(int i=0;i<=7;i++)
		{
		String value = mySheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value+" ");
			
		}
		
		//how to read all row & column
		System.out.println("----------all excelsheet-------------");
		
		for(int i=0;i<=2;i++)//for reading row
		{
			for(int j=0;j<=2;j++)//for reading column
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
			}

}
