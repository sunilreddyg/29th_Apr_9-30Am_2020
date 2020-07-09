package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Runtime_Changes {

	public static void main(String[] args) throws InterruptedException 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Identif Webelement
		WebElement Email_editbox=driver.findElement(By.id("email"));
		
		//Disable Element
		js.executeScript("arguments[0].disabled=true;",Email_editbox);
		Thread.sleep(10000);
				
				
		//Enabled element
		js.executeScript("arguments[0].disabled=false;",Email_editbox);
		Thread.sleep(5000);
				
				
		//Hide element from webpage
		js.executeScript("arguments[0].style.visibility='hidden';",Email_editbox);
		Thread.sleep(5000);
				
		//Visibility of element
		js.executeScript("arguments[0].style.visibility='visible';",Email_editbox);
		Thread.sleep(5000);
				
				
		//Convert Single dropdown selection into multiple selection dropdown
		WebElement Month_DD=driver.findElement(By.id("month"));
		js.executeScript("arguments[0].setAttribute('multiple','multiple')", Month_DD);

	}

}
