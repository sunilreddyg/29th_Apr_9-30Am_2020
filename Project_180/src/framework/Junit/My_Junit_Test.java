package framework.Junit;

import org.junit.Test;

public class My_Junit_Test 
{
	
	@Test   //This annotation invoke method to run without object creation
	public void Tc001()
	{
		System.out.println("Tc001 Executed");
	}
	
	@Test
	public void Tc002()
	{
		System.out.println("Tc002 Executed");
	}
	
	@Test
	public void Tc003()
	{
		System.out.println("Tc003 Executed");
	}
	

}
