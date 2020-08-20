package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Text_Presented_At_Element_Value {

	public static void main(String[] args) 
	{

		/*
		 * Manage timeout until expected input presented at Editbox and Dropdown
		 */
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.paytm.com");
		driver.manage().window().maximize();
		
		
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@data-reactid='203']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("9030248855");
		
		//manage timeout until expected value presented at Editbox.
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.textToBePresentInElementValue(By.xpath("//input[@data-reactid='213']"), "Airtel"));
		System.out.println("Expected value presented at editbox");
		
		
		
		

	}

}
