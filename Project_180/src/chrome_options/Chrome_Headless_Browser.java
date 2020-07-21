package chrome_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Headless_Browser {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeOptions caps=new ChromeOptions();
		caps.setHeadless(true);
		//caps.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(caps);
		System.out.println("browser launched");
		
		driver.get("http://facebook.com");
		System.out.println("Facebook page load successfull");
		
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		
		
		
		/*
		 * FAQ:--> How to run chrome with headless browser?.
		 * 		ChromeOptions caps=new ChromeOptions();
		 *		caps.setHeadless(true);
		 * 		WebDriver driver=new ChromeDriver(caps);
		 */
		
		
		
		
		
	}

}
