package mq.selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Selecting drodpown with visible option name
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("15");
		
		//Selcting dropdown with Option Value Property
		new Select(driver.findElement(By.id("month"))).selectByValue("8");
		
		//Selecting dropdown with index number
		new Select(driver.findElement(By.id("year"))).selectByIndex(26);
	

	}

}
