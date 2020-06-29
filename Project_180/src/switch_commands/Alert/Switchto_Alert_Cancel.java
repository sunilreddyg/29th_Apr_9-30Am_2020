package switch_commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchto_Alert_Cancel {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		WebElement Cancel_Tab=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		Cancel_Tab.click();
		Thread.sleep(2000);
		
		WebElement Danger_btn=driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		Danger_btn.click();
		Thread.sleep(5000);
		
		
		//Store alert into a referrence
		Alert alert=driver.switchTo().alert();
		
		//Get Text at alert popup
		String alert_text=alert.getText();
		System.out.println("Text displayed at alert => "+alert_text);
		
		//Click cancel button at alert window
		alert.dismiss();

	}

}
