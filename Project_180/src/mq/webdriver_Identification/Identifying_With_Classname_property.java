package mq.webdriver_Identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Identifying_With_Classname_property 
{

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		
		//Identify Singin button with linktext
		driver.findElement(By.linkText("Sign in")).click();
		

		//IDentify location with class property
		driver.findElement(By.className("form-control")).clear();
		driver.findElement(By.className("form-control")).sendKeys("sunireddy.gajjala@outlook.com");
		
		//Identify Location with class property..
		driver.findElement(By.className("btn-block")).click();
		
		
		
	}

}
