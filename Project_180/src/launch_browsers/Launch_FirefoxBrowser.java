package launch_browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FirefoxBrowser {

	public static void main(String[] args) 
	{
		/*
		 * => Download geckodriver and setup environment variable:-->
		 * 
		 * 			=> Visit site https://github.com/mozilla/geckodriver/releases
		 * 			=> Select geckodriver version w.r.t Firefox broswser..
		 * 			=> 			Browser version 60 >=  ==> v0.26.0 
		 * 			=> Select Operating system and hotspot size to download gekcodriver
		 * 			=> After downlaod unzip file
		 * 			=> And setup environment variable before launching browser.
		 */
		
		String path="E:\\29th_Apr_9-30AM_2020\\Project_180\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver obj=new FirefoxDriver();
		obj.get("http://google.com");
		
		obj.findElement(By.xpath("//a[contains(@href,'mobiles')]")).click();

	}

}
