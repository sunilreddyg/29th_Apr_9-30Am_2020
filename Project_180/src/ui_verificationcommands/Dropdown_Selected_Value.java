package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selected_Value 
{

	public static void main(String[] args) throws Exception 
	
	{
		
		/*
		 * Example:--> How to verify requried option selected at dropdown.
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		

		//Select Number of adults travelling
		WebElement Adults_Dropdown=driver.findElement(By.xpath("//select[@name='adults']"));
		new Select(Adults_Dropdown).selectByVisibleText("4");
		Thread.sleep(2000);
		
		//Retrieve dropdown selected value
		String Selected_value=Adults_Dropdown.getAttribute("value");
		System.out.println(Selected_value);
		
		

	}

}
