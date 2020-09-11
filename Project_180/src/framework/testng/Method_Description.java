package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description 
{
	
	
  @Test(description="F1 method verifying login details")
  public void f1() 
  {
	  Reporter.log("f1 method completed");
  }
  
  
  @Test(description="F2 method verifying Registration details")
  public void f2() 
  {
	  Reporter.log("f2 method completed");
  }
  
}
