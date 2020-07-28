package corejava.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {

	public static void main(String[] args) {
		

		List<String> list=new LinkedList<String>();
		list.add("obj1");
		list.add("obj2");
		list.add("obj3");
		list.add("obj4");
		list.add("obj5");
		list.add("obj6");
		list.add("obj3");
		
		
		
		//get size of objects
		int count=list.size();
		System.out.println("Object count is => "+count);
		
		//Remove single object from collection
		list.remove("obj4");
		
		
		//Verify Object Available at collection
		boolean flag=list.contains("obj5");
		System.out.println("Object status is => "+flag);
		
		//Read First Iterated value
		String Next_obj=list.iterator().next();
		System.out.println("Next iterator value is => "+Next_obj);
		
		
		//Clear all objects from collection
		list.clear();
		
		//Get Collection EMpty status
		boolean flag1=list.isEmpty();
		System.out.println("Is collection Empty:-->"+flag1);
		
		
		//Add New data to collection
		list.add("bindu");
		list.add("anitha");
		list.add("raja");
		list.add("javahar");
		list.add("vikki");
		
		
		/*
		 * Note:--> Because list store objects inorder, We can get any 
		 * 			singel object using index number.
		 */
		String index_obj=list.get(3);
		System.out.println("Listinterface index object is => "+index_obj);
		
		
		//Read all list of object using for loop.
		for (int i = 0; i < list.size(); i++) 
		{
			 String each=list.get(i);
			 System.out.println(each);
		}
		
	
		System.out.println("\n");  //It create new line at console
		
		
		//Read list of object using foreach loop
		for (String eachobj : list) 
		{		
				System.out.println(eachobj);
		}
		
		
		System.out.println("\n");  //It create new line at console
		
		
		
		//Read list of object using Iterations
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
