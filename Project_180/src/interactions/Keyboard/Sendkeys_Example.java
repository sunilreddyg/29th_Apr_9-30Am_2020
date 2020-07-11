package interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Example {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  						//Launch browser
		driver.get("https://www.naukri.com/free-job-alerts");  		//Load webpage
		driver.manage().window().maximize(); 					 	//maximize browser window
		Thread.sleep(5000);
		
		
		//Click to open list of options	
		driver.findElement(By.id("cjaExp")).click();
		
		//ON active element perform a keyboard shoutcut
		new Actions(driver).pause(3000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).perform();
		
		//CLick to open list of options
		driver.findElement(By.id("cjaMinSal")).click();
		
		//ON active element perform a keyboard shoutcut
		new Actions(driver).pause(3000)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).perform();
		
	
		//Type referrece text
		driver.findElement(By.id("cjaInd")).sendKeys("BPO");
		new Actions(driver).pause(3000)
		.sendKeys(Keys.ENTER)
		.sendKeys(Keys.ESCAPE).perform();
		
		
		//Type reference text
		WebElement Job_Category=driver.findElement(By.id("cjaJob"));
		new Actions(driver).sendKeys(Job_Category, "Freshers")
		.pause(3000).sendKeys(Keys.ENTER).sendKeys(Keys.ESCAPE).perform();
		
		
		
		
		
		
		
		
	}

}
