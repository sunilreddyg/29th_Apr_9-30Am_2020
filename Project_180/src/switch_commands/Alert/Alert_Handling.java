package switch_commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alert_Handling {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> How to verify Alert presented at webapage.
		 */
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		WebElement Danger_btn=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Danger_btn.click();
		Thread.sleep(5000);
		
		
		//Conditional statement to verify alert presented
		if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
		{
			System.out.println("Alert presented");
			
			//Close alert
			driver.switchTo().alert().accept();  //Click ok button at alert window
		}
		else
		{
			System.out.println("Alert not presented");
		}
		
		
		
		

	}

}
