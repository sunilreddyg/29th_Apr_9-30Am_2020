package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_Excel_Workbook_And_Sheet 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Read binary file from local system
		FileInputStream fi=new FileInputStream("TestData\\Sample_TestData.xlsx");
		System.out.println("File located");
		
		//Get Access of workbook using above fileinputStream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get access of sheets under workbook
		XSSFSheet shtA=book.getSheet("SheetA");
		System.out.println("Sheet A Targeted with Name of Sheet");
		
		//Get access of sheet using index number
		XSSFSheet shtB=book.getSheetAt(1);
		System.out.println("Sheet B targeted with index of sheet");
		
		int SheetCount=book.getNumberOfSheets();
		System.out.println("Number of Sheets available at Workbook --> "+SheetCount);
		
		
	}

}
