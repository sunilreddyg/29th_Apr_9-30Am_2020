package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Text_Presented_At_Element_Located {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		
		
		
		//Manage timeout until expected text presented at location.
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.textToBePresentInElementLocated
				(By.xpath("//h1[contains(.,'Search flights')]"), "Search flights"));
		System.out.println("Expected text presented at location");
		
		

	}

}
