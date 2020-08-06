package switch_commands.Window;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    
	    String MainWindow_ID=driver.getWindowHandle();
	    System.out.println("Facebook page window id is => "+MainWindow_ID);
	    
	    
	    WebElement Instagram_link=driver.findElement(By.xpath("//a[text()='Instagram']"));
	    Instagram_link.click(); //This link will open new window
	    
	    
	   //Get all window id's
	    Set<String> AllWindow_ID=driver.getWindowHandles();
	    
	    //Apply foreach to iterate number of windows
	    for (String EachwindowID : AllWindow_ID) 
	    {
			if(!MainWindow_ID.equals(EachwindowID))  //!--NOT
			{
				driver.switchTo().window(EachwindowID);
				break; //Break iteration and keep control at same window.
			}
		}
	    
	   
	  
	    
	    System.out.println("Current Focused window ID is --> "+driver.getWindowHandle());
	    System.out.println("Current focused window title is => "+driver.getTitle());
	    
	    
	    
		

	}

}
