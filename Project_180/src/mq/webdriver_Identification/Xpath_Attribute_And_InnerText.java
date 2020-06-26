package mq.webdriver_Identification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_Attribute_And_InnerText {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("software testing");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(text(),' Fresher')]")).click();
	}

}
