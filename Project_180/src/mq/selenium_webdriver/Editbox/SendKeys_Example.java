package mq.selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Example {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("firstname"))
		.sendKeys("Pranil"+Keys.TAB
				+"Rahul"+Keys.TAB
				+"pranil_Rahul@gmail.com"+Keys.TAB
				+"Pranil_Rahul@gmail.com"+Keys.TAB
				+"Newpwd123");
		
		
		//selecting dropdown using keyboard shortcuts
		driver.findElement(By.id("day")).sendKeys("24");
		Thread.sleep(4000);
		
		//Selecting dropdown using keyboard shortcuts
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		/*
		 * Note:--> To select dropdown options, Selenium have separate commands
		 * 			SelectByvisibleText
		 * 			SelectByValue
		 * 			SelectByIndex
		 */
		
		
		
		
		
		

	}

}
