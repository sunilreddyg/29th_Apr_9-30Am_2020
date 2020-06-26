package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_PageSource {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Capture Page Runtime Source
		String Runtime_pageSource=driver.getPageSource();
		
		
		//Decision to validate locatin presented at source
		if(Runtime_pageSource.contains("u_0_m"))
		{
			WebElement Firstname=driver.findElement(By.id("u_0_m"));
			Firstname.clear();
			Firstname.sendKeys("Aakash");
		}
		else
		{
			System.out.println("Element not presented at source");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
