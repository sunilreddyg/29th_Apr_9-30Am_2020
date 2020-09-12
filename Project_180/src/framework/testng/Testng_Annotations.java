package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Testng_Annotations 
{
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
  
  @Test
  public void Tc003() 
  {
	  System.out.println("Tc003 Executed");
  }
  
  @BeforeMethod //This annotation invoke every @Test annotation before.
  public void beforeMethod() 
  {
	  System.out.println("Method precondition");
  }

  @AfterMethod	//This annotation invoke after every @Test annotation 
  public void afterMethod() 
  {
	  System.out.println("Method postcondition "+"\n");
  }

  @BeforeClass //This annotation invoke mehtod to run before all @Test invoked
  public void beforeClass() 
  {
	  System.out.println("Class precondition");
  }

  @AfterClass  //This annotation invoke mehtod to run after all @Test invoked
  public void afterClass() 
  {
	  System.out.println("Class post condition");
  }

}
