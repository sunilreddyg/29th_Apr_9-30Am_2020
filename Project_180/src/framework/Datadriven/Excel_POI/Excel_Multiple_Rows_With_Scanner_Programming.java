package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Multiple_Rows_With_Scanner_Programming {

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
		
		
		//Create object for Scanner [This syntax allow to read input from console]
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give Start Iteration => ");
		int Start=sc.nextInt();
		
		System.out.println("Give End Iteration =>");
		int End=sc.nextInt();
		
		for (int i = Start; i <= End; i++) 
		{
			
			String Username=sht.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Username);
			
		}
		

	}

}
