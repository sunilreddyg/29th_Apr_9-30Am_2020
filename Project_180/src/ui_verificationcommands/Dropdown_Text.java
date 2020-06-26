package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Testcase:-->
		 * 			Verify respective city option displayed on State selection.
		 */
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//Select state 
		Select State_Dropdown=new Select(driver.findElement(By.xpath("//select[@id='customState']")));
		State_Dropdown.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);
		
		
		//Identify City Dropdown
		WebElement City_Dropdown=driver.findElement(By.xpath("//select[@id='customCity']"));
		String All_Cities=City_Dropdown.getText();
		//System.out.println(All_Cities);
		
		
		//Writing decision to verify expected city available at Cities list
		if(All_Cities.contains("Anantapur"))
		{
			System.out.println("Testpass, Expected city displayed");
		}
		else
		{
			System.out.println("Testfail, Expected city not displayed");
		}
		
		
		
	}

}
