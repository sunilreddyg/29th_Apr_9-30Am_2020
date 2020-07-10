package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      	 //Launch browser
		driver.get("https://www.naukri.com/");       //load page to browser
		driver.manage().window().maximize();	     //Maximize browser window
		
		
		
		
		WebElement Menu_item_Jobs=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		//Mouse hover on location
		new Actions(driver).moveToElement(Menu_item_Jobs).perform();
		
		
		
		Thread.sleep(2000);
		WebElement SubMenu_item_Register=driver.findElement(By.xpath("//a[@data-ga-track='Main Navigation Jobs|Register Now']"));
		//Click method using actions class
		new Actions(driver).click(SubMenu_item_Register).perform();
		
		
		/*
		 * Note:-->
		 * 		Without Peform(); method we can't end Action statements.
		 */
		

	}

}
