package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Data_From_Multiple_rows {

	public static void main(String[] args) throws IOException
	{
		//Target File at Local System
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet3");
		
		
		//Get numer of rows data available with in sheet
		int Rcount=sht.getLastRowNum();
		System.out.println("Data available in number of rows is -> "+Rcount);
		
		
		//Iterate for number of rows
		for (int i = 5; i <= Rcount ; i++) 
		{
			
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"   "+PWD);
			
		}
		
		
		
		
		
		
		

	}

}
