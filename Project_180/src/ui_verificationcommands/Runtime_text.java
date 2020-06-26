package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runtime_text {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Email validation with invalid Email address
		 * 			Given url http://outlook.com
		 * 			And click Signin navigation button
		 * 			when user enter invalid email address
		 * 			And click next button to proceed login
		 * 			Then receive appropriate error message at webpage.
		 * 			
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		
		WebElement Email_Editbox=driver.findElement(By.xpath("//input[@name='loginfmt']"));
		Email_Editbox.clear();
		Email_Editbox.sendKeys("qadarshan@gmail.com");
		
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(5000);
		
		
		//Identify Location of Erorr msg
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='usernameError']"));
		String Runtime_Err_msg=Error_location.getText();
		System.out.println(Runtime_Err_msg);
		
		
		String Exp_msg="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		
		if(Runtime_Err_msg.equals(Exp_msg))
		{
			System.out.println("Testpass, Expected error msg displayed at webpage");
		}
		else
		{
			System.out.println("Testfail, Expected error msg not displayed at webpage");
		}
		
		
		

	}

}
