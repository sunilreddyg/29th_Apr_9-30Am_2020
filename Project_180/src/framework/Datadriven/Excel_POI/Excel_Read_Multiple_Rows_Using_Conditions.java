package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Multiple_Rows_Using_Conditions {

	public static void main(String[] args) throws IOException 
	{
		
		//Target File at Local System
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
				
		//Get Workbook using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet4");
		
		//Get Lastrow number
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows available is => "+Rcount);
		
		//Iterate for number of rows
		for (int i = 5; i <= Rcount; i++) 
		{
			
			
			//Target Excecution cell
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			//Decison to accept condition when Cell value have Y
			if(Exe_status.equals("y"))
			{
				String Username=sht.getRow(i).getCell(0).getStringCellValue();
				System.out.println(Username);
				
				
				//Get Scenario Type
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				if(Stype.equals("text"))
				{
					System.out.println("for username "+Username+" OutputCaptured gettext");
				}
				else if(Stype.equals("object"))
				{
					System.out.println("for username"+Username+"Output captured object");
				}
				else if(Stype.equals("alert"))
				{
					System.out.println("for username"+Username+"Output captured ALert");
				}
				
				
			}
			
		}
		
		
		
		

	}

}
