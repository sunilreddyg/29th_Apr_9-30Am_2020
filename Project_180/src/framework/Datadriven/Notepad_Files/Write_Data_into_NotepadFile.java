package framework.Datadriven.Notepad_Files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write_Data_into_NotepadFile {

	public static void main(String[] args) throws Exception 
	{
		
		
		
		//Create new text file at local system
		FileWriter fw=new FileWriter("src\\framework\\Datadriven\\Notepad_Files\\output.txt");
		System.out.println("New file created");
		
		//Create writer
		BufferedWriter writer=new BufferedWriter(fw);
		
		//Write a Line
		writer.write("TestResult => Tc001 LoginSuccessfull");
		
		//Create New line
		writer.newLine();
		writer.write("TestResult =>  Tc002 LoginSucessfull");
		
		//Save Faile
		writer.close();

	}

}
