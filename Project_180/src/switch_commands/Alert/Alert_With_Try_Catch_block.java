package switch_commands.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_With_Try_Catch_block {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		WebElement Danger_btn=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		Danger_btn.click();
		Thread.sleep(5000);
		
		
		try {
			
			driver.switchTo().alert().accept();
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Run continued");
		
		
		

	}

}
