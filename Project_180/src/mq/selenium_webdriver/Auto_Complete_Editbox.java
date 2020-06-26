package mq.selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_Complete_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Selecting radio button   [In WebDriver click() command select radio button]
		driver.findElement(By.id("RoundTrip")).click();
		
		
		//Identify editbox and type referral text init
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);  //TImeout to load departure cites to display
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		
		//Identify arrival editbox and type referral text init
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000);   //TImeout to load arrival cities to display
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		//Select Departue Date From DatePicker
		Thread.sleep(3000);  //Timeout to auto-populate calender after arrival city selection
		driver.findElement(By.linkText("29")).click();
		
		
		//Type Return date,  [Only when it is writable mode] 
		Thread.sleep(3000);  //Timeout to auto-populate calender after Departue date selected
		//Clear existing Date.
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Tue, 25 Aug, 2020");
		
		/*
		 * Note:--> Type accept by date-picker only when it is in writable mode.
		 */
		
		//Select adult dropdown
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("5");
		
		
		//Click More options link [It Bring class of travel and preffered airlines to visible]
		driver.findElement(By.partialLinkText("More options:")).click();
		Thread.sleep(4000); //Timeout to load Classof Travel and airlines objects.
		
		//Selecting class of travel dropdown
		new Select(driver.findElement(By.id("Class"))).selectByVisibleText("Business");
		
		
		//Click on Search button
		driver.findElement(By.id("SearchBtn")).click();
		

	}

}
