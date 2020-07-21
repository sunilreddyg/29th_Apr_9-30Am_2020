package chrome_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Start_Maximized {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeOptions caps=new ChromeOptions();
		caps.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(caps);
		driver.get("http://facebook.com");

	}

}
