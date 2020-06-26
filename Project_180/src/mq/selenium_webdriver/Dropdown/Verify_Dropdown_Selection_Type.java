package mq.selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Selection_Type 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:-->
		 * 		Verify State dropdown is Single selection Dropdown.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown Multiple Selection status is => "+flag);
		
		
		if(flag==true)
		{
			System.out.println("Multiple option selection type");
		}
		else
		{
			System.out.println("Single option selection type");
		}
		
		
		
		
		/*
		 * Using Javascript converting single selection dropdown to Multiple selection
		 * dropdown..
		 * 		
		 * 		[Creating Single Option or multiple option is developer responsibility]
		 */
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(10000);
		
		/*
		 * Scenario:-->
		 * 		Verify State dropdown is Multiple selection Dropdown.
		 * 		After confirmation select dropdown multiple options..
		 */
		
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown multile selelction state is =>"+flag1);
		
		
		//Write condition statement to accept on multiple selection type
		if(flag1==true)
		{
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();  //This command only works on multiple selection type..
			State_Dropdown.selectByIndex(3);
			State_Dropdown.selectByIndex(5);
			State_Dropdown.selectByIndex(8);
			
			Thread.sleep(5000);
			
			State_Dropdown.deselectByIndex(5);
		}
		else
		{
			System.out.println("Testfail,Dropdown is single option selection type");
		}
		
		
		
		/*
		 * Note:--> If you use deselection commands on single option dropdown, Selenium
		 * 			throw excetion..
		 */
		

	}

}
