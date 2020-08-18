package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit_TimeGap {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
	
	
		System.out.println("Window maximized");
		driver.findElement(By.id("email"));       
		System.out.println("facebook Element Found");
		
		
		driver.findElement(By.id("identifierId"));
		System.out.println("Gmail Element found");
		
		
		

	}

}
