package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test 
{
  @Test //Invoke method to run without object creation.
  public void Tc001() 
  {
	  Reporter.log("Tc001 Executed successfull");
  }
  
  @Test //Invoke method to run without object creation.
  public void Tc002() 
  {
	  Reporter.log("BrowserLaunch Succesfull");
	  Reporter.log("Application loaded Succesfull");
	  Reporter.log("Browser Maximized");
	  Reporter.log("CLose Browser");
	  
  }
}
