package ui_verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page_Verification_commands {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Capture runtime title of webpage
		String runtime_title=driver.getTitle();
		System.out.println("Currnt Window title is => "+runtime_title);
		
		
		//Capture runtime url of webpage
		String runtime_url=driver.getCurrentUrl();
		System.out.println("Current window url is => "+runtime_url);
		
		
		//Capture runtime window ID
		String Window_ID=driver.getWindowHandle();
		System.out.println("Current window ID is ---> "+Window_ID);
		
		//Capture runtime page source
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		

	}

}
