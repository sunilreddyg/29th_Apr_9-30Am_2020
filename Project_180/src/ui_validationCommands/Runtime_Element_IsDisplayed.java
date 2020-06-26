package ui_validationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_Element_IsDisplayed {

	public static void main(String[] args) throws Exception 
	{
		
	
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  		//Launch browser
		driver.get("https://www.cleartrip.com");  	//Load webpage
		driver.manage().window().maximize();  		//maximize browser window
		Thread.sleep(5000);
	
		//target more options link
		WebElement More_options=driver.findElement(By.xpath("//a[@id='MoreOptionsLink']"));
		
		/*
		 * Testcase:-->
		 * Click More options. Expected "Class of travel" and "Preffered
		 * airlines" element should visible at webpage..
		 */
		More_options.click();
		Thread.sleep(5000);
		
		WebElement Travel_Class=driver.findElement(By.xpath(".//*[@id='Class']"));
		WebElement Airlines=driver.findElement(By.xpath("//input[@name='airline']"));
		
		
		if(Travel_Class.isDisplayed() && Airlines.isDisplayed())
		{
			System.out.println("Testpass, As expected Travelclass & Airlines objects visible at webpage");
		}
		else
		{
			System.out.println("Testfail, The travelClass & Airlines objects hidden at webpage");
		}
		
		
		
		/*
		 * TestCase:-->
		 *  => Click More options.when travel class and airlines elements are visible
		 *  => Expected "Class of travel" and "Preffered
		 * 		airlines" elements hide from webpage
		 */
		 if(Travel_Class.isDisplayed() && Airlines.isDisplayed())
		 {
			 More_options.click();
			 Thread.sleep(5000);
			 
			 //Nested conditon to verify element hide status at webpage
			 if(!Travel_Class.isDisplayed() && !Airlines.isDisplayed())
				 	System.out.println("Testpass, Both element hidden at webpage");
			 else
				 	System.out.println("Testfail, both elements visible at webpage");
		 }
		

	}

}
