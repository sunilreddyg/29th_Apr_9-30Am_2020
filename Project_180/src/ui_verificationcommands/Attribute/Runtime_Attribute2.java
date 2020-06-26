package ui_verificationcommands.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_Attribute2 
{
	public static void main(String args[]) throws Exception
	{
		
		/*
		 * Scenario: Verifying Rountrip selection at flight booking scenario
		 * 		Given url is http://makemytrip.com
		 * 		When trip type selected oneway
		 * 		And tap on return date
		 * 		Then Selection move to oneway to roundtrip..
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		WebElement Oneway_Rbtn=driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']"));
		String Runtime_class=Oneway_Rbtn.getAttribute("class");
		
		if(Runtime_class.equals("selected"))
		{
			System.out.println("Condition ok,Oneway is Selected");
			
			WebElement ReturnDate=driver.findElement(By.xpath("//p[@data-cy='returnDefaultText']"));
			ReturnDate.click();
			Thread.sleep(3000);
			
			
			WebElement Roundtrip_Rbtn=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			String Return_Class=Roundtrip_Rbtn.getAttribute("class");
			
			if(Return_Class.equals("selected"))
				System.out.println("Testpass, Roundtrip is Selected");
			else
				System.out.println("TestFail, Roundtrip is not Selected");
		}
		else
		{
			System.out.println("Condition failed One way radio button is not selected");
		}
		
		
	}

}
