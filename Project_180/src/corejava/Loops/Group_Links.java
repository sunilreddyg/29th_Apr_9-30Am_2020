package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Group_Links {

	public static void main(String[] args) throws Exception 
	{
		//Set runtime environment variable for chromedriver
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String links[]={"Sign Up","Log In","Messenger","About","Games"};
		
		//iterate for expected array length 
		for (int i = 0; i < links.length; i++) 
		{
			driver.findElement(By.linkText(links[i])).click();
	
			
			driver.navigate().back();
			Thread.sleep(2000);
		}
		
		
		
		
		//Select all dropdown options usind index 
		for (int i = 1; i < 13; i++) 
		{
			new Select(driver.findElement(By.id("month"))).selectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		

	}

}
