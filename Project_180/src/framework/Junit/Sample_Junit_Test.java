package framework.Junit;

import org.junit.Test;

public class Sample_Junit_Test 
{

	@Test   //This annoation invoke method to run without object creation
	public void login() 
	{
		System.out.println("Test1 executed");
	}

	
	//Method should run from main method Using object creation
	public void App_launch() 
	{
		System.out.println("Test2 executed");
	}
	
	
	@Test  //This Annoation Ignore method execution
	public void Browser_open()
	{
		System.out.println("Test3 executed");
	}

}
