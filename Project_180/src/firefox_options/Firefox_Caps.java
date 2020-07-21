package firefox_options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_Caps 
{

	public static void main(String[] args) 
	{
		
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(options);
		System.out.println("browser launched");
		

	}

}
