package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Tagname 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Example:--> Get tagname of element at runtime..
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement Month_Loc=driver.findElement(By.xpath("//*[@aria-label='Month']"));
		String Month_Tagname=Month_Loc.getTagName();
		
		if(Month_Tagname.equals("select"))
		{
			new Select(Month_Loc).selectByVisibleText("Dec");
		}
		else
		{
			System.out.println("Month Element is not a dropdown, Becuase it doesn't contain select tag");
		}
		
		
		
		
		
		

	}

}
