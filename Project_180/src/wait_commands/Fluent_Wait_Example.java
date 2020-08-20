package wait_commands;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class Fluent_Wait_Example {

	public static void main(String[] args) 
	{
		
	
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //Implicit wait
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		/*
		 * Note:--> Fluentwait usefull to manage frequent timegaps.
		 * 			During fluentwait we also add exception 
		 */
		
		
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		 WebElement element = wait.until(new Function<WebDriver, WebElement>()  
		 		{
				     public WebElement apply(WebDriver driver) 
				     {
				       return driver.findElement(By.id("email"));
				     }
				  });
		 
		 element.clear();
		 element.sendKeys("9030248855");
		 
		
		
		

	}

}
