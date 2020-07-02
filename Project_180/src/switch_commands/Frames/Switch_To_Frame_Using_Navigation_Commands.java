package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_To_Frame_Using_Navigation_Commands {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
	    driver.manage().window().maximize();
	    
	    
	    //Switch to frame using naviagte method
	    driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");

	    WebElement Email=driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("qadarshan@gmail.com");
		
		
		WebElement TripID=driver.findElement(By.id("tripidSecond"));
		TripID.clear();
		TripID.sendKeys("Hello123456");
		
		
		//Navigate back 
		driver.navigate().back();
		Thread.sleep(5000);
		
		
		//Get controls back to mainpage
		driver.switchTo().defaultContent();
		

		WebElement Flights_link=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
		Flights_link.click();
	    
	    
	}

}
