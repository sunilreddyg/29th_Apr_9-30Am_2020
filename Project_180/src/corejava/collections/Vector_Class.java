package corejava.collections;

import java.util.Vector;

public class Vector_Class {

	public static void main(String[] args) 
	{
		
		
		Vector<String> vec=new Vector<String>();
		vec.add(0, "arjun");
		vec.add(1, "akash");
		vec.add(2,"hari");
		vec.add(3,"babu");
		
		System.out.println("Size of ovjects is => "+vec.size());
		
		
		
		
		//Read all object using foreach
		for (String eachobj : vec) 
		{
			System.out.println(eachobj);
		}

	}

}
