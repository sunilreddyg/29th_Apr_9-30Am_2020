package framework.testng.DP;

import org.testng.annotations.Test;

public class Get_DP_Data_From_Different_Class
{
	
	/*
	 * Inorder to access Dataproiver annotaion in different class we need 
	 * 	attach Classname of DataProvider annotation.
	 */
	@Test(dataProvider="user_login",dataProviderClass=DP_InputData.class)
	public void Test_login(String UID,String PWD) 
	{
		System.out.println(UID+"  "+PWD);
	}

}
