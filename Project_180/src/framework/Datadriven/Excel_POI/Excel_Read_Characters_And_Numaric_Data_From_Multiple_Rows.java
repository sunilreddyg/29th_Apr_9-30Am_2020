package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Characters_And_Numaric_Data_From_Multiple_Rows {

	public static void main(String[] args) throws IOException 
	{
		
		//Target File at Local System
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
				
		//Get Workbook using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet8");
		
		
		//Get Lastrow number
		int Rcount=sht.getLastRowNum();
		
		
		//Iterate for loop number of row times
		for (int i = 1; i <= Rcount; i++)
		{
			
			XSSFCell cell=sht.getRow(i).getCell(0);
			
			
			String UID_input=null;
			
			if(cell.getCellType()==cell.CELL_TYPE_STRING)
			{
				UID_input=cell.getStringCellValue();
			}
			else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			{
				UID_input=NumberToTextConverter.toText(cell.getNumericCellValue());
			}
			else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN)
			{
				Boolean flag=cell.getBooleanCellValue();
				UID_input=flag.toString();
	        }
			else if(cell.getCellType()==cell.CELL_TYPE_BLANK)
			{
				System.out.println("Cell value is blank"+"Row numer is =>"+i);
			}
			
			System.out.println(UID_input);
			
			
		}
		
		
		
		

	}

}
