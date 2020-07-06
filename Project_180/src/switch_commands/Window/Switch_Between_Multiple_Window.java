package switch_commands.Window;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_Between_Multiple_Window {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Capture current Window dynamic id
		String Main_windowID=driver.getWindowHandle();
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get all dynamic window ID's
		Set<String> All_Window_IDS=driver.getWindowHandles();
		
		//Applying foreach window to iterator for all windows
		for (String EachWindowID : All_Window_IDS) 
		{
			driver.switchTo().window(EachWindowID);
			//After switch get window title
			String Runtime_Title=driver.getTitle();
			System.out.println(Runtime_Title);
			
			if(Runtime_Title.contains("Cancel Train Bookings"))
			{
				break; //At what window it break , It keep browser controls at same  window
			}
			
		}
		
		
		System.out.println("Active window is => "+driver.getTitle());
		
		
		//Clicking link at new window
		WebElement New_link=driver.findElement(By.xpath("//strong[contains(.,'Tell us what you think')]"));
		New_link.click();
		
		
		
		
		

	}

}
