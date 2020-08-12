package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
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
		
		
		//Row and Cell Count Methods
		int LRow_Num=sht.getLastRowNum();  //Return last row number where data contains.
		int FRow_num=sht.getFirstRowNum(); //Return in which row data was started
		
		System.out.println("In Excel Data starts at  => "+FRow_num);
		System.out.println("In Excel Data Ends at  => "+LRow_Num);
		
		//To get Cell count data,  first we need target requried row
		int Lcell_num=sht.getRow(5).getLastCellNum();   //Return first cell data count
		int Fcell_num=sht.getRow(5).getFirstCellNum();  //Return last cell data count.
		
		System.out.println("Start cell data number is => "+Fcell_num);
		System.out.println("Last cell data number is => "+Lcell_num);
		
		
		//Iterate cells using for loop
		for (int i = Fcell_num; i < Lcell_num; i++) 
		{
			
			String CellData=sht.getRow(6).getCell(i).getStringCellValue();
			System.out.println("=> "+CellData);
			
		}

		
		
		
		
		
		

	}

}
