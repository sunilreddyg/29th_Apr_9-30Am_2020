package framework.Datadriven.Notepad_Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_notepad_Files {

	public static void main(String[] args) throws IOException 
	{
		
		//Target text file location
		FileReader fr=new FileReader("src\\framework\\Datadriven\\Notepad_Files\\Input.txt");
		System.out.println("file located");
		
		//Read data from file
		BufferedReader reader=new BufferedReader(fr);
		
		//Read Header
		String header=reader.readLine();
		System.out.println(header);
		
		//Read first line
		String Line1=reader.readLine();
		System.out.println(Line1);
		
		//Condition loop to read all lines from notepad file
		String Rline;
		while((Rline=reader.readLine())!=null)
		{
			//Split each line with delimeted 
			String arr[]=Rline.split("#");
			System.out.println("Username is => "+arr[0]);
			System.out.println("Password is => "+arr[1]);
			System.out.println("\n");
		}
	}

}
