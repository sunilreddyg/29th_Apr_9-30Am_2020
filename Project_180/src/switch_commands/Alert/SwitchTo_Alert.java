package switch_commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		WebElement Danger_btn=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Danger_btn.click();
		Thread.sleep(5000);
		
		
		//Store alert into a referrence
		Alert alert=driver.switchTo().alert();
		
		//Get Text at alert popup
		String alert_text=alert.getText();
		System.out.println("Text displayed at alert => "+alert_text);
		
		//Click ok button at alert
		alert.accept();
		
		
		/*
		 * Note:-->
		 * 		Webdriver support partial handling on alerts.It means
		 * 		any alert to handling we follow same syntax.
		 */
		

	}

}
