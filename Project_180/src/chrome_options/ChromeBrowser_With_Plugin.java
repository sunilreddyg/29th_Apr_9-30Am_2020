package chrome_options;



import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser_With_Plugin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\SUNIL\\Downloads\\extension_3_17_0_0.crx"));
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");

	}

}
