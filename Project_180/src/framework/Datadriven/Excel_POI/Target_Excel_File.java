package framework.Datadriven.Excel_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Target_Excel_File 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		/*
		 * Why fileinputstream:-->
		 * 		Fileinputstream can read data in object oriented format such as Raw files
		 * 		[Audio,Image,Video,text ---etc]
		 */
		
		//Read binary file from local system
		FileInputStream fi=new FileInputStream("TestData\\Sample_TestData.xlsx");
		System.out.println("File located");
		
		
		
		//Create output file at local system
		FileOutputStream fo=new FileOutputStream("TestData\\Output.xlsx");
		
		
		
		/*
		 * IOmethods Read File from local system.
		 */
		File file=new File("TestData\\Sample_TestData.xlsx");
		System.out.println("FIle located");

	}

}
