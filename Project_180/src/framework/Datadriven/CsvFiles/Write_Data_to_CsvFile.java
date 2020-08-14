package framework.Datadriven.CsvFiles;

import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class Write_Data_to_CsvFile {

	public static void main(String[] args) throws Exception 
	{
		
		//Target file location
		String filepath="src\\framework\\CsvFiles\\output.csv";
		//Create Filewrite
		FileWriter fw=new FileWriter(filepath);
		System.out.println("Csv output file created");
		
		//Create object for csvwriter
		CSVWriter writer=new CSVWriter(fw);
		
		//Line1 data with in array format
		String line1[]= {"Result1","TestPass"};
		writer.writeNext(line1);
		
		//Line1 data with in array format
		String line2[]= {"Result2","TestPass"};
		writer.writeNext(line2);
		
		
		//Write and save data...
		writer.close();


	}

}
