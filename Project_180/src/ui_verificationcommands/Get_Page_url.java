package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Page_url {

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
		
		//Capture runtime url of webpage
		String runtime_url=driver.getCurrentUrl();
		System.out.println("Currnt Window url is => "+runtime_url);
		
		//Store expected url into referenced variable
		String Exp_url="https://www.selenium.dev/";
		
		//Verify Expected url equals to runtime url
		boolean flag=runtime_url.contains(Exp_url);
		
		//Writing conditional statemenet for page url.
		if(flag==true)
		{
			System.out.println("Expected url displayed for selenium homepage");
			
			WebElement Download_Menu=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
			Download_Menu.click();
			
			//Decision to validate url of downlods page
			if(driver.getCurrentUrl().contains("downloads/"))
			{
				System.out.println("Downlaods page displayed");
			}
			else
			{
				System.out.println("Downloads page url mismatch, Page not displayed");
			}
			
			
		}
		else
		{
			System.out.println("Wrong url displayed for selenium webpage");
		}
		

	}

}
