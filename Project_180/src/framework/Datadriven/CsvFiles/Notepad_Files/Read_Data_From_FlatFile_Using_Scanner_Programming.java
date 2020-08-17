package framework.Datadriven.Notepad_Files;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Data_From_FlatFile_Using_Scanner_Programming {

	public static void main(String[] args) throws IOException
	{
		
		
		FileReader file=new FileReader("src\\framework\\Datadriven\\Notepad_Files\\Input.txt");
		System.out.println("file located");
		
		//Create object for Scanner
		Scanner sc=new Scanner(file);
		System.out.println("file located");
		
		
		String Header=sc.nextLine();
		System.out.println(Header);
		
		
		//Using Condition loop read all lines from Notepad file
		while(sc.hasNext())
		{
			String Rline=sc.nextLine();
			//Split each line with delimeted 
			String arr[]=Rline.split("#");
			System.out.println("Username is => "+arr[0]);
			System.out.println("Password is => "+arr[1]);
			System.out.println("\n");
		}
		
		
		

	}

}
