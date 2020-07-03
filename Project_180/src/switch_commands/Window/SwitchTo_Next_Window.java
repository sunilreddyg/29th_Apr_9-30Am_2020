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
	    Instagram_link.click();
	    
	   
	  
	    //Get all window ID's
	    Set<String> All_Window_IDS=driver.getWindowHandles();
	    //Apply foreach loop to iterator number of windows
	    for (String EachWindow_ID : All_Window_IDS) 
	    {
			if(!EachWindow_ID.equals(MainWindow_ID))
			{
				driver.switchTo().window(EachWindow_ID);
				break;
			}
		}
	    
	    
	    
	    System.out.println("Current focused window title is => "+driver.getTitle());
	    
	    
	    
		

	}

}
