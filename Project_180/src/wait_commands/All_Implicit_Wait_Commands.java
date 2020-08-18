package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Implicit_Wait_Commands {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//Assinging implicit wait to automation browser.
		driver.manage().timeouts()
		.implicitlyWait(100, TimeUnit.SECONDS)
		.pageLoadTimeout(200, TimeUnit.SECONDS)
		.setScriptTimeout(200, TimeUnit.SECONDS);
		
	
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();

	}

}
