package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Invisibilityof_Element_Located {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Create object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		//Mange timeout until Roundtrip radio button Selected
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='RoundTrip']")));
		System.out.println("Round trip is Selected");
		
		
		//Mange timeout until Return Date invisible at webpage
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='ReturnDate']")));
		System.out.println("Return date is hidden");
		

	}

}
