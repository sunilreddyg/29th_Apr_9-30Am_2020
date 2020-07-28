package corejava.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.IntegerSyntax;

public class HashTable_Sample 
{
	
	public static void main(String args[])
	{
		
		
		Map<Integer,String> map=new Hashtable<Integer,String>();
		map.put(100, "Soap");
		map.put(101, "pen");
		map.put(104, "box");
		map.put(105, "T-Shirt");
		
		
		System.out.println("Size of map is => "+map.size());
		
		
		//Get any single value from Hashtable using keyname
		String obj=map.get(105);
		System.out.println(obj);
		
		
		//Get all values using keyset
		Set<Integer> keys=map.keySet();
		for (Integer Eachkey : keys) 
		{
			String kvalue=map.get(Eachkey);
			System.out.println(Eachkey+"   "+kvalue);
		}
		
		
		
		
		
		
		
		
		
	}

}
