package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_timeout_WIth_TimeGap {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		
		
		
		long Start_Time=System.currentTimeMillis();
		
		
	
		try {
			
			//Manage explicit timeout until expected title found
			new WebDriverWait(driver, 50).until
			(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
			System.out.println("Expected Title presented");
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		long End_time=System.currentTimeMillis();
		long Total=End_time-Start_Time;
		System.out.println("Total Released Time is -> "+(Total/1000));
		
		
		
		
		

	}

}
