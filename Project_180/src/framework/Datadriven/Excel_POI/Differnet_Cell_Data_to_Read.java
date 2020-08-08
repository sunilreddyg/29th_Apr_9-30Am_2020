package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Differnet_Cell_Data_to_Read {

	public static void main(String[] args) throws IOException 
	{
		
		//Read binary file from local system
		FileInputStream fi=new FileInputStream("TestData\\Sample_TestData.xlsx");
		System.out.println("File located");
		
		//Get Access of workbook using above fileinputStream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get access of sheets under workbook
		XSSFSheet sht=book.getSheet("SheetB");
		System.out.println("Sheet B Targeted with Name of Sheet");
		
		//Read characters from Cell
		String Text=sht.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Cell value in Text format is => "+Text);
		
		//Read Numbers from cell
		double Num=sht.getRow(1).getCell(1).getNumericCellValue();
		System.out.println("Cell Value in Numeric Format is => "+Num);
		
		//Read Date from Cell
		Date date=sht.getRow(1).getCell(2).getDateCellValue();
		System.out.println("Cell value in date format is => "+date.toString());
		
		//Read boolean value from cell
		boolean flag=sht.getRow(1).getCell(3).getBooleanCellValue();
		System.out.println("cell value in boolean format is => "+flag);
		
		
		


	}

}
