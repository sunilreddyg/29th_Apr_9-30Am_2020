package framework.Datadriven.CsvFiles;

import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;

public class Read_Data_From_CsvFile 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file location
		FileReader fr=new FileReader("src\\framework\\CsvFiles\\Input.csv");
		System.out.println("file located");
		
		//Create object for csv file
		CSVReader reader=new CSVReader(fr);
		
		//Read next record using csvreader referrence
		String[] Headers=reader.readNext();
		
		System.out.println(Headers[0]+"   "+Headers[1]+"   "+Headers[2]);
		
		//Read first record at CsvFile
		String[] Rec1=reader.readNext();
		System.out.println(Rec1[0]+"   "+Rec1[1]+"   "+Rec1[2]);
		
		//Read first record at CsvFile
		String[] Rec2=reader.readNext();
		System.out.println(Rec2[0]+"   "+Rec2[1]+"   "+Rec2[2]);
		
		
		System.out.println("\n");
		
		//Using while loop read all csv values
		String Rline[];
		
		while((Rline=reader.readNext())!=null)
		{
			System.out.println(Rline[0]+"   "+Rline[1]+"   "+Rline[2]);
			
		}
		
		


	}

}
