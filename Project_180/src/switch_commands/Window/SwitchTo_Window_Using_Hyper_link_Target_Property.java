package switch_commands.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchTo_Window_Using_Hyper_link_Target_Property {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    //get Current window Dynamic ID
	    String MainWindowID=driver.getWindowHandle();
	    
	    
		//Switch to Frame using FrameId
	    driver.switchTo().frame("message");
	    
	    //Click on Reports link under Message frame
	    WebElement Reports=driver.findElement(By.xpath("//a[@href='Reports.html']"));
	    Reports.click();
	    Thread.sleep(3000);
		
	    
	    //Get controls back to mainpage
	    driver.switchTo().defaultContent();
	    
	    
	    //Switch to NewFrame Using FrameId
	    driver.switchTo().frame("bodyFrame");
	    
	    //Clicking Hyper link under bodyframe
	    WebElement College_Reports=driver.findElement(By.xpath("//a[@href='collegeregistrationreport.do']"));
	    College_Reports.click();  //Hyper lin open at new window
	    Thread.sleep(4000);
	    
	    
	    //Switch to New window using hyperlink target property
	    driver.switchTo().window("_new");
	    Thread.sleep(4000);
	    System.out.println("Current window title is => "+driver.getTitle());	    
	    WebElement Ac_year=driver.findElement(By.xpath("//select[@name='ac_year']"));
	    new Select(Ac_year).selectByIndex(3);
	    //Close Sub Window
	    driver.close();   //It Close Single active window...
	    
	    
	    //Get Controls back to mainpage
	    driver.switchTo().window(MainWindowID);
	    System.out.println("Current window title is => "+driver.getTitle());
	    

	}

}
