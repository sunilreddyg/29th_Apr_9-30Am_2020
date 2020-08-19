package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_the_title {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		//Manage explicit timeout until expected title found
		new WebDriverWait(driver, 50).until
		(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
		
		System.out.println("Expected title presented and timeout released");
		
		
		WebElement Downloads_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
		Downloads_link.click();
		
		
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.titleContains("Downloads"));
		System.out.println("Downloads title verified");
		

	}

}
