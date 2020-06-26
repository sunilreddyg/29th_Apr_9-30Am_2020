package mq.selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_InterFace {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * WebDriver is a interface class which is defined to manipulate all browser
		 * instance supported by selenium..
		 */
		
	
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();   
	    
	    
	    driver.findElement(By.id("u_0_m")).sendKeys("newuser");
	    driver.findElement(By.id("u_0_o")).sendKeys("webdriver");
	    driver.findElement(By.id("u_0_r")).sendKeys("newuserwebdriver@gmail.com");
		
		Thread.sleep(5000);
		driver.close();   //Close Sinlge focused window
		
		
		
		

		/*
		 * WebDriver Exceptions:-->
		 * 	
		 * 			1. WebDriver driver=new ChromeDriver();
		 * 
		 * 					IllegalStateException:-->
		 * 							This exception throw by webdriver when
		 * 							browser driver path not located before
		 * 							launch browser..
		 * 
		 * 			2. driver.get("http://facebook.com");
		 * 			
		 * 					SessionNotCreatedException:-->
		 * 							This exception throw by webdriver when
		 * 							browser version and browser driver version
		 * 							mismatch.
		 * 
		 * 			3. driver.get("www.facebook.com");
		 * 						InvalidSelectorException:-->
		 * 							This Exception throw by webdriver when
		 * 							url define with wrong protocal. WebDriver
		 * 							launch application with valid protocals
		 * 							are http://   or https://
		 * 							[driver.get("https://facebook.com")]
		 * 			
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
