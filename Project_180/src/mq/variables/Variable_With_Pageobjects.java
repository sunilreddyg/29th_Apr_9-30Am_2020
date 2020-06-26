package mq.variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Variable_With_Pageobjects 
{
	
    By Loc_Email=By.xpath("//input[@id='email']");
	By Loc_Pasword=By.xpath("//input[@id='pass']");
	By Loc_Signin_btn=By.xpath("//input[contains(@value,'Log In')]");

	
	WebDriver driver;
	String url="http://facebook.com";
	
	public void Setup_browser()
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void Load_Webpage()
	{
		driver.get(url);
	}
	
	public void User_login()
	{
		driver.findElement(Loc_Email).sendKeys("9030248855");
		driver.findElement(Loc_Pasword).sendKeys("Hello12345");
		driver.findElement(Loc_Signin_btn).click();
	}
	
	public static void main(String args[])
	{
		Variable_With_Pageobjects obj=new Variable_With_Pageobjects();
		obj.Setup_browser();
		obj.Load_Webpage();
		obj.User_login();
		
		
	}

}
