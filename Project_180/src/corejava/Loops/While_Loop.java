package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop {

	public static void main(String[] args) throws Exception 
	{
		
		
		//print numbers from 1 to 10
		
		int i=0;
		while(i <=10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		
		//print numbers from 10 to 1
		int j=10;
		while(j >=1)
		{
			System.out.println(j);
			j=j-1;
		}
		
		
		//While loop with false condition
		int l=100;
		while(l <=10)
		{
			System.out.println("I can't run, because above condition is false");
		}
		
		
		
		/*
		 * Explicitwait  manage dynamic timegap using while loop.
		 */
		
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		//Selenium identify location even object visible or hidden at webpage.
		WebElement Retype_Email=driver.findElement(By.name("reg_email_confirmation__"));
		
		
		/*
		 * Isdisplayed is a method it verify element visible status at webpage and return
		 * boolean value true/false.
		 */
		
		int k=0;
		while(!Retype_Email.isDisplayed())  //!--NOT
		{
			System.out.println("Element is hidden");
			Thread.sleep(1000);
			
			if(k==30)
			{
				throw new ElementNotVisibleException("Element not visible after waiting 30 seconds");
				//We can alos user break; statement instead of using throw exception
			}
			
			k=k+1;
		}
		
		
		System.out.println("Element visible at webpage");
		
		
		
		
		
		
		
			
		
		

	}

}
