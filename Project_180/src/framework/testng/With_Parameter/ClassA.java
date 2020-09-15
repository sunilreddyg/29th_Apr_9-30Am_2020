package framework.testng.With_Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassA 
{
	
	
	  @Test
	  public void tc001() 
	  {
		  System.out.println("MQ");
	  }
	
	  @Test
	  @Parameters("User_name")
	  public void tc002(String name) 
	  {
		  System.out.println(name);
	  }
	  
	  
	  @Test
	  @Parameters({"User_email","User_mobile"})
	  public void tc003(String email,String mobile) 
	  {
		  System.out.println(email+"    "+mobile);
	  }
}
