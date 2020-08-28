package framework.Junit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BeforeMethod_And_AfterMethod 
{

	@Before //This annotation invoke method to run every @Test annoation before
	public void setUp() throws Exception 
	{
		System.out.println("Method-precondition");
	}

	@After //This annoation invoke method to run after every @Test annoation.
	public void tearDown() throws Exception 
	{
		System.out.println("Method-postcondition");
	}

	@Test
	public void Tc001() 
	{
		System.out.println("Test1 Executed");
	}
	
	@Test
	public void Tc002() 
	{
		System.out.println("Test2 Executed");
	}
	
	@Test
	public void Tc003() 
	{
		System.out.println("Test3 Executed");
	}

}
