package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_betWeen_Frames {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://epass.apcfss.in/");
	    driver.manage().window().maximize();
	    
	    //Switching controls to frame with frameID
	    driver.switchTo().frame("menuFrame");
	    
	    WebElement Fee_Structure=driver.findElement(By.xpath("//a[@href='FeestructureReport.do']"));
	    Fee_Structure.click();
	    Thread.sleep(10000);
	    
	    //Get Controls from menu frame to webpage
	    driver.switchTo().defaultContent();
	    //Switch to frame with ID
	    driver.switchTo().frame("bodyFrame");
	   
	    //Selecting university at bodyframe
	    Select University=new Select(driver.findElement(By.xpath("//select[@id='univ']")));
	    University.selectByIndex(3);
	    
	    

	}

}
