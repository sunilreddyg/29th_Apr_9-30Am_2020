package mq.selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Multiple_Selection {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * Scenario:-->
		 * 		Verify Multiple selection dropdown allowd Maximum Selection.
		 * 		
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		/*
		 * Using Javascript converting single selection dropdown to Multiple selection
		 * dropdown..
		 * 		
		 * 		[Creating Single Option or multiple option is developer responsibility]
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(10000);
		
		
		
		//Get Status of dropdown multiple state
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		
		//Condition to accept on Multiple Selection type
		if(flag==true)
		{
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();
			
			//Select multiple option.
			State_Dropdown.selectByIndex(2);
			State_Dropdown.selectByIndex(4);
			State_Dropdown.selectByIndex(6);
			
			//Verify Dropdown Multiple Selecton.
			
			int Selection_Count=State_Dropdown.getAllSelectedOptions().size();
					
					//Condition to verify Selection Count
					if(Selection_Count > 1)
					{
						System.out.println("TestPass, Dropdown allowd multiple selection");
					}
					else
					{
						System.out.println("Testfail, Dropdown Not allowd multiple Selection");
					}
		
		}
		else
		{
			System.out.println("Dropdown is not a multiple selection type..");
		}
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
