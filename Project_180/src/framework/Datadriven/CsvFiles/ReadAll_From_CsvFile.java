package framework.Datadriven.CsvFiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadAll_From_CsvFile {

	public static void main(String[] args) throws IOException {
		
		//Target file location
		FileReader fr=new FileReader("src\\framework\\CsvFiles\\Input.csv");
		System.out.println("file located");
		
		//Create object for csv file
		CSVReader reader=new CSVReader(fr);
		
		//Read all method
		List<String[]> all=reader.readAll();
		
	
		//Target 2nd rocord using index number
		String[] line2=all.get(2);
		System.out.println(line2[0]+"   "+line2[1]+"   "+line2[2]);
		
		
		//Apply foreach to iterate for all records under file
		for (String[] Eachline : all) 
		{
			System.out.println(Eachline[0]+"   "+Eachline[1]+"    "+Eachline[2]);
		}
		
		
		

	}

}
