package mq.variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_And_Locator_Referrences 
{
	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//WebDriver script without any references
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		
		//WebDriver Script with WebElement reference.
		WebElement Signin_Password=driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		Signin_Password.clear();
		Signin_Password.sendKeys("Hello123456");
		
		/*
		 * Advantages:-->
		 * 			=> Without repeating location we can reuse it
		 * 			=> We can reduce lines of code
		 * 			=> We can give userfreindly names to Script
		 * 
		 * Disadvantages:-->
		 * 			After store page referrence into variable, Incase page get changed
		 * 			your refernce going to errase.And webdriver "StaleElementReference"
		 * 			exception.
		 */
		
		
		//Page object reference..
		By Locator_Signin_btn=By.xpath("//input[@data-testid='royal_login_button']");
		//driver.findElement(Locator_Signin_btn).click();
		
		Variable_With_Pageobjects obj=new Variable_With_Pageobjects();
		driver.findElement(obj.Loc_Signin_btn).click();
		
		
	}

}
