package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Ignore 
{
	
  @Test(enabled=false)  //This property Ignore test execution
  public void f1() 
  {
	  
	  Reporter.log("f1 Method executed");
  }
  
  @Test  //Invoke method to run without object creation
  public void f2() 
  {
	  Reporter.log("f2 method executed");
	  
  }
  
  
}
