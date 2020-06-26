package ui_validationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IS_Displayed_For_Static_Methods {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();  //Launch browser
		driver.get("https://www.gmail.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
								
		
		//Identify Email Editbox
		WebElement Email_EB=driver.findElement(By.id("identifierId"));
		
		//This condition prevent writing text at editbox when element is hidden..
		if(Email_EB.isDisplayed())
		{
			Email_EB.clear();
			Email_EB.sendKeys("qadarshan@gmail.com");
		}
		else
		{
			System.out.println("Email location not visible at webpage");
		}
		
		
		Thread.sleep(5000);  //Static timegap to load password
		//Identifying password element
		WebElement Password_EB=driver.findElement(By.name("password"));
		
		//This condition prevent writing text at editbox when element is hidden..
		if(Password_EB.isDisplayed())
		{
			Password_EB.clear();
			Password_EB.sendKeys("Hello123456");
		}
		else
		{
			System.out.println("Password not visible at webpage");
		}
		

		/*
		 * Note:--> We can alos can identify element visibile &  disabled
		 * 			feature using below exception.
		 * 
		 * 
		 * ElementNotvisibleException   
		 * 			==> When user perform action on hidden element  
		 * InvalidElementstateException 
		 * 			==> When user perform action on disabled element
		 */

	}

}
