package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_Click {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      	 //Launch browser
		driver.get("https://www.naukri.com/");       //load page to browser
		driver.manage().window().maximize();	     //Maximize browser window
		Thread.sleep(5000);
		
		
		
		WebElement Upload_CV=driver.findElement(By.xpath("//label[@id='wdgt-file-upload']"));
		new Actions(driver).click(Upload_CV).perform();  //Peform click on action using mouse interactions.
		
		
		
		
		
		
		
		
		
		

	}

}
