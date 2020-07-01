package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//switch to frame with FrameID/Name
		driver.switchTo().frame("modal_window");
		
		
		WebElement Email=driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("qadarshan@gmail.com");
		
		
		WebElement TripID=driver.findElement(By.id("tripidSecond"));
		TripID.clear();
		TripID.sendKeys("Hello123456");
		
		
		//Get controls back to mainpage
		driver.switchTo().defaultContent();
		

		WebElement Flights_link=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
		Flights_link.click();
		
		
		
		
	}

}
