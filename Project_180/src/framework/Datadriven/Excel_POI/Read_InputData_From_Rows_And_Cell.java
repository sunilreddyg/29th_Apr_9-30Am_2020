package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_InputData_From_Rows_And_Cell 
{

	public static void main(String[] args) throws IOException {
		
		
		//Read binary file from local system
		FileInputStream fi=new FileInputStream("TestData\\Sample_TestData.xlsx");
		System.out.println("File located");
		
		//Get Access of workbook using above fileinputStream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get access of sheets under workbook
		XSSFSheet sht=book.getSheet("SheetA");
		System.out.println("Sheet A Targeted with Name of Sheet");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//get Cell Data
		XSSFCell UID_Cell=row.getCell(0);
		XSSFCell PWD_Cell=row.getCell(1);
		
		//Read Data from Cell.  [getStringCellvalue read characters from cell]
		String Username=UID_Cell.getStringCellValue();
		String Password=PWD_Cell.getStringCellValue();
		
		System.out.println(Username+"   "+Password);
		
		
		
		//Read data from cell
		String Result=sht.getRow(1).getCell(2).getStringCellValue();
		System.out.println("TestResult is => "+Result);
		
		
		/*
		 * 
		 * getStringCellValue:-->
		 * 			Method read characters from cell 
		 * getNumericCellValue:-->
		 * 			Method read number from cell and return in double format
		 * getDateCellValue:-->
		 * 			Method read data value from cell and return in Date format
		 * getBooleanvalue:-->
		 * 			Method read boolean value true/false from cell. 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
