package pageobjects.Runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.pages.CT_Flights;
import pageobjects.pages.CT_HOME;

public class POM_Runner {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		/*
		 * Inorder to access @findBy object from differnet class we should
		 * follow pagefactory object creation.
		 */
		CT_HOME ct_home=PageFactory.initElements(driver, CT_HOME.class);
		ct_home.Flights.click();
		
		CT_Flights ct_flights=PageFactory.initElements(driver, CT_Flights.class);
		ct_flights.Roundtrip_Rbtn.click();
		
		//Select Departure City
		ct_flights.From_City_AEB.clear();
		ct_flights.From_City_AEB.sendKeys("HYD");
		Thread.sleep(5000);
		ct_flights.Flights_HYD_City.click();
		
		//Select arrival city
		ct_flights.To_City_AEB.clear();
		ct_flights.To_City_AEB.sendKeys("DEL");
		Thread.sleep(5000);
		ct_flights.Flights_DEL_City.click();
		
		
		
		
		
		
		

	}

}
