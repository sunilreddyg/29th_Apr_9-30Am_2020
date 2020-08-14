package framework.Datadriven.PropertyFiles;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Read_Data_From_propertyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target Fileinput
		String filepath="src\\framework\\Datadriven\\PropertyFiles\\Input.Properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		
		//Create object for repository
		Properties repository=new Properties();
		//Load input data into Repositry
		repository.load(fi);
		
		
		//Retrieve any property value by using it's key name
		String App_url=repository.getProperty("facebook.url");
		System.out.println(App_url);
		
		
		String UID=repository.getProperty("username");
		System.out.println(UID);
		
		
		String UID_locator=repository.getProperty("username_locator");
		System.out.println(UID_locator);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
