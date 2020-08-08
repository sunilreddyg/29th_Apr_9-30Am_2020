package pageobjects.With_Global_Declaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Hotels {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/hotels");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		CT_Hotels obj=new CT_Hotels(driver);
		obj.Search_hotel();

	}

}
