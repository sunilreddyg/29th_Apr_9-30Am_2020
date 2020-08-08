package pageobjects.pages.With_Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.pages.CT_HOME;

public class Run_CT_Trais_PageObjects {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		CT_HOME ct_home=PageFactory.initElements(driver, CT_HOME.class);
		ct_home.Trains.click();
		
		
		//In this CT_Trains class pagefactory assigned under class constructor
		CT_Trains ct_trains=new CT_Trains(driver);
		ct_trains.Search_Trains();
		
		
		
		
		
		
		
		
	}

}
