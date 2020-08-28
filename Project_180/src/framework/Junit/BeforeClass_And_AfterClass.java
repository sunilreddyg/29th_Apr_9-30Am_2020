package framework.Junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	@BeforeClass //Invoke before execution of first @Test annotation
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("PreCondition");
	}

	@AfterClass //Invoke after execution of last @Test annotation
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("PostCondition");
	}
	
	//Note:--> We get test result only @Test annotated method.

	@Test
	public void Tc001() 
	{
		System.out.println("Tc001 Executed");
	}
	
	
	@Test
	public void Tc002() 
	{
		System.out.println("Tc002 Executed");
	}
	
	
	
	

}
