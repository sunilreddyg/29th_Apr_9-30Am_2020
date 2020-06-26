package mq.variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser_Using_Variable {

	public static void main(String[] args) throws Exception {
		
		String Chrome_keyname="webdriver.chrome.driver";
		String chrome_Driver_path="Drivers\\chromedriver.exe";
		
		String Firefox_keyname="webdriver.gecko.driver";
		String firefox_Driver_path="Drivers\\geckodriver.exe";
		String url="http://facebook.com";
		
		WebDriver driver=null;
		
		String Browsername="firefox";
		
		if(Browsername=="chrome")
		{
			System.setProperty(Chrome_keyname, chrome_Driver_path);
			driver=new ChromeDriver();
		}
		
		
		if(Browsername=="firefox")
		{
			System.setProperty(Firefox_keyname, firefox_Driver_path);
			driver=new FirefoxDriver();
		}
		
		
		driver.get(url);
		System.out.println(url.contains(driver.getCurrentUrl()));
		
		Thread.sleep(5000);
		driver.close();


	}

}
