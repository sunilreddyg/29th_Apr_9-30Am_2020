package framework.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng_Method_Dependencies
{
	
	@BeforeClass  //This annotation invoke method to run before all @Test annotation
	public void SetUp_browser()
	{
		System.out.println("Set all desired capabilites");
	}
	
	@AfterClass  //This annotation invoke method to run after all @Test annotations executed
	public void Close_browser()
	{
		System.out.println("browser closed");
		
	}

	
	@Test(priority=0)
	public void Browser_launch()
	{
		Assert.assertEquals("MQ", "MQ");
		Reporter.log("Browser launch successfull");
	}
	
	
	@Test(priority=1,dependsOnMethods={"Browser_launch"})
	public void App_Load()
	{
		Assert.assertTrue(true);
		Reporter.log("Load application successfull");
	}
	
	@Test(priority=2,dependsOnMethods={"App_Load"})
	public void User_login()
	{
		Assert.assertTrue(true);
		Reporter.log("Account login successfull");
	}
	

	@Test(priority=3,dependsOnMethods={"User_login"})
	public void ComposeEmail()
	{
		Assert.assertTrue(true);
		Reporter.log("Email sent successfull");
	}
	
	
	@Test(priority=4,dependsOnMethods={"User_login"})
	public void Search_email()
	{
		Assert.assertTrue(true);
		Reporter.log("Email found");
	}
	
	@Test(priority=5,dependsOnMethods={"User_login"})
	public void Verify_Email_At_inbox()
	{
		Assert.assertTrue(true);
		Reporter.log("email found at inbox");
	}
	
	@Test(priority=6,dependsOnMethods= {"ComposeEmail"})
	public void Verify_Email_At_Sentemails_After_Compose_Email()
	{
		Assert.assertTrue(true);
		Reporter.log("Sent mail found");
	}
	
	
	@Test(priority=7,dependsOnMethods={"Verify_Email_At_Sentemails_After_Compose_Email"})
	public void Forward_Email_from_Sent_Mails()
	{
		Assert.assertTrue(true);
		Reporter.log("Forward email");
	}
	
	
	@Test(priority=8,dependsOnMethods= {"User_login"})
	public void User_Signout()
	{
		Assert.assertTrue(true);
		Reporter.log("Account signout successfull");
	}
	

	

}
