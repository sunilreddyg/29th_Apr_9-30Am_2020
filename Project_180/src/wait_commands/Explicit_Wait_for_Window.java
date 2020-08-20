package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_for_Window 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //Implicit wait
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//This link open page at separate window/tab
		WebElement Instagram=driver.findElement(By.linkText("Instagram"));
		Instagram.click();
		
		//Manage timeout until expected number of windows open.
		new WebDriverWait(driver, 10).until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("Expected number of window open");
		
		
		
		

	}

}
