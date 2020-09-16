package framework.testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DP_InputData 
{
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) 
  {
	  System.out.println(n+"   "+s);
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  
  @Test(dataProvider="user_login")
  public void Test_login(String UID,String PWD)
  {
	  System.out.println(UID+"   "+PWD);
  }
  
  
  @DataProvider  //Inorder to access outside class we must declare with static access specifier.
  public static Object[][] user_login() 
  {
    return new Object[][] {
      new Object[] {"user1","pwd1"},
      new Object[] {"user2","pwd2"},
      new Object[] {"user3","pwd3"},
      new Object[] {"user4","pwd4"},
      new Object[] {"user5","pwd5"},
    };
  }
}
