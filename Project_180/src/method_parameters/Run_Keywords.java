package method_parameters;

import org.openqa.selenium.By;

public class Run_Keywords {

	public static void main(String[] args) 
	{
		
		//Create object for Keywords
		Keywords obj=new Keywords();
		obj.Launch_Browser("chrome");
		obj.Open_Application("http://facebook.com");
		obj.set_timeout(40);
		
		obj.Click_Link("Create New Account");
		
		obj.Enter_text("//input[@name='firstname']", "Newuser");
		obj.Enter_text("//input[@name='lastname']", "webdriver");
		
		
		obj.Enter_text(By.cssSelector("input[name='reg_email__']"), "Newuser_Webdriver@gmail.com");
		obj.Enter_text(By.name("reg_email_confirmation__"), "Newuser_Webdriver@gmail.com");
		
		obj.Select_Dropdown("//select[@id='day']", "21");
		obj.Select_Dropdown("//select[@id='month']", "Sep");
		obj.Select_Dropdown("//select[@id='year']", "2000");
		
		obj.Click_Element("//input[@value='2']");
		obj.capturescreen("Registration");
	}

}
