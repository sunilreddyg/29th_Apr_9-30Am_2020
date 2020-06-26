package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_Page_VisibleText {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Email validation with invalid Email address
		 * 			Given url http://outlook.com
		 * 			And click Signin navigation button
		 * 			when user enter valid email address
		 * 			And click next button to proceed login
		 * 			Then navigate to password entry page.
		 * 			
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
	
		//Identify Signin Button
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
	
		//Identify email 
		WebElement Email_editbox=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email_editbox.clear();
		Email_editbox.sendKeys("sunilreddy.gajjala@outlook.com");  //Entered valid email
		
		//Click Next button
		WebElement Next_btn=driver.findElement(By.xpath("//input[contains(@id,'idSIButton9')]"));
		Next_btn.click();
		Thread.sleep(5000);
		
		
		//Identify webpage
		WebElement Page=driver.findElement(By.tagName("body"));
		String Page_Visible_text=Page.getText();
		System.out.println(Page_Visible_text);
		
		
		//Write decision to verify expected text visible at webpage
		if(Page_Visible_text.contains("Enter password"))
		{
			System.out.println("Testpass, Expected text visible at webapge");
		}
		else
		{
			System.out.println("Expected text not visible at webpage");
		}
		
		

	}

}
