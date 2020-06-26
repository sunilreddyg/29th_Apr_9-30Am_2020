package mq.selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_login {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("login1")).sendKeys("sunilreddy@rediffmail.com");
		
		driver.findElement(By.name("passwd")).clear();
		driver.findElement(By.name("passwd")).sendKeys("Hello123456");
		
		driver.findElement(By.name("proceed")).click();
		

	}

}
