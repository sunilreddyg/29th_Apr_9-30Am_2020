package switch_commands.Window;

import java.util.HashSet;
import java.util.Set;

import javax.net.ssl.HandshakeCompletedEvent;

public class Set_Interface {

	public static void main(String[] args) 
	{


		/*
		 * Set is a unorder collection of objects, And Set doesn't allow
		 * duplicate values to store.
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("three");
		
		
		for (String eachobj : set) 
		{
			if(eachobj.equals("four"))
			{
				System.out.println("Found Required object");
				break;
			}
		}
		
		
		
		
		
		
		
	}

}
