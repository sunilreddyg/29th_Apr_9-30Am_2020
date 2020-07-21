package chrome_options;


import java.util.Arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_popup_blocking {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
	
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://naukri.com");


	}

}
