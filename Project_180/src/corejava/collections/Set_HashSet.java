package corejava.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet {

	public static void main(String[] args) {
		
		
		HashSet<String> set=new HashSet<String>();
		set.add("obj1");
		set.add("obj2");
		set.add("obj3");
		set.add("obj4");
		set.add("obj5");
		set.add("obj6");
		set.add("obj3");
		
		
		//get size of objects
		int count=set.size();
		System.out.println("Object count is => "+count);
		
		//Remove single object from collection
		set.remove("obj4");
		
		
		//Verify Object Available at collection
		boolean flag=set.contains("obj5");
		System.out.println("Object status is => "+flag);
		
		//Read First Iterated value
		String Next_obj=set.iterator().next();
		System.out.println("Next iterator value is => "+Next_obj);
		
		
		//Clear all objects from collection
		set.clear();
		
		//Get Collection EMpty status
		boolean flag1=set.isEmpty();
		System.out.println("Is collection Empty:-->"+flag1);
		
		
		//Add New data to collection
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		
		//Read all Collection of objects using foreach loop.
		for (String eachobj : set)
		{
			System.out.println(eachobj);
		}
		
		
		System.out.println("\n");  //It create new line at console
		
		
		//Using While loop read collection of objects
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		

	}

}
