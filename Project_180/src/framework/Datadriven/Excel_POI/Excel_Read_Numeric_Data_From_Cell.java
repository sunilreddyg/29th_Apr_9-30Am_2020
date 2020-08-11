package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Numeric_Data_From_Cell {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target File at Local System
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(1);
		
		//Target Numeric Cell
		double Mobile_in_Primitive_double_frmt=row.getCell(2).getNumericCellValue();
		
		/*
		 * Note:--> Get Numericcellvalue return value in double format with in primitive dattype.
		 * 			Using Wrapper class we need to convert Primitive data type value into object
		 * 			format.
		 */
		
		Double Object_Double=Mobile_in_Primitive_double_frmt;
		System.out.println("Mobile number if Double format ---> "+Object_Double);
		
	
		//Using wrapper class convert numeric value into text format
		String Mobile_in_String_Format=NumberToTextConverter.toText(Object_Double);
		System.out.println("Mobile number in String format is => "+Mobile_in_String_Format);
		
		
		//Using wrapper class convert Double format to Long format.
		long Mobile_in_num_format=Object_Double.longValue();
		System.out.println("Mobile number in number format is => "+Mobile_in_num_format);
		
	
		
		/*
		 * Note:--> We can alos convert numeric cell  into String cell manually by adding
		 * 			single code before numeric value   '9030248855
		 */
		String Mobile_num_In_String_Format=row.getCell(4).getStringCellValue();
		System.out.println(Mobile_in_num_format);
		
		
		
		
		
		
	}

}
