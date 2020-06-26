package ui_verificationcommands.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_Attribute {

	public static void main(String[] args) 
	{
		
		/*
		 * Scenario:--> Verifying deapartue date readonly behaviour.
		 * 		Given url is http://spicejet.com
		 * 		Then verify Departue Editbox is readonly..
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		WebElement Departue_EB=driver.findElement(By.xpath("//input[contains(@id,'date1')]"));
		String Runtime_Value=Departue_EB.getAttribute("readonly");
		System.out.println(Runtime_Value);
		
		//Decison to prove editbox  readonly behaviour
		if(Runtime_Value.equals("true"))
			System.out.println("Test pass,As expected Depareture editbox is readonly");
		else
			System.out.println("Testfail, Departure editbox return as Writable..");
		
		
		
		

	}

}
