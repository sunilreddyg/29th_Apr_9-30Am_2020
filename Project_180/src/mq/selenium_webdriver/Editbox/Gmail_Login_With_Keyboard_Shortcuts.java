package mq.selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_With_Keyboard_Shortcuts 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		

		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
		
		Thread.sleep(5000);  //Static timegap to load password element
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello123456"+Keys.ENTER);
		
		

	}

}
