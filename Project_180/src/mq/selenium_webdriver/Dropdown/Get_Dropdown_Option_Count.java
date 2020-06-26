package mq.selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Dropdown_Option_Count {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		Select Adutls_Dropdown=new Select(driver.findElement(By.id("Adults")));
		Select Childrens_Dropdown=new Select(driver.findElement(By.id("Childrens")));
		
		int Max_count=9;
		
		//Select Adult Options
		Adutls_Dropdown.selectByVisibleText("5");
		Thread.sleep(5000);
		
		//Get Options count at childrens dropdown
		int Childrens_Count=Childrens_Dropdown.getOptions().size();
		
		//Condition to verify Childrens Count
		if(Childrens_Count==Max_count-4)
		{
			System.out.println("Testpass, Childrens count displayed as per Adults count");
		}
		else
		{
			System.out.println("Testfail, Childrens count mismatch, And count displayed is => "+Childrens_Count);
		}
		

	}

}
