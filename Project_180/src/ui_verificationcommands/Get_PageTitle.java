package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_PageTitle {

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:--> Navigating to Download page
		 * 
		 * 	Given url is  http://selenium.dev
		 * 	When user click on download button
		 * 	Then Software display download webpage
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://selenium.dev");
		driver.manage().window().maximize();
		
		//Capture runtime title of webpage
		String runtime_title=driver.getTitle();
		System.out.println("Currnt Window title is => "+runtime_title);
		
		//Storing expected title into referenced variable.
		String Exp_title="SeleniumHQ Browser Automation";
		
		// Verify expected title matching with Runtime title 
		boolean flag=runtime_title.equals(Exp_title);
		
		if(flag==true)
		{
			System.out.println("title presented for selenium homepage");
			
			WebElement Download_Menu=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			Download_Menu.click();
			
			//Decision to validate title of downlods page
			if(driver.getTitle().contains("Downloads"))
			{
				System.out.println("Downlaods page displayed");
			}
			else
			{
				System.out.println("Downloads page title mismatch, Page not displayed");
			}
			
		}
		else
		{
			System.out.println("Wrong title presented for selenium homepage");
		}
		 
		
		
		
		
		

	}

}
