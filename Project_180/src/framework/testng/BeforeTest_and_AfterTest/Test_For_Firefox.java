package framework.testng.BeforeTest_and_AfterTest;


import org.testng.annotations.AfterTest;


public class Test_For_Firefox
{
	
	
	  
	

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("posttest after firefox launch ");
	  }
	  
	  
}
