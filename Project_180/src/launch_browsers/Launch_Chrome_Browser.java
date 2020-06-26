package launch_browsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser {

	public static void main(String[] args) 
	{
		
		
		/*
		 * => Download ChromeDriver and setup environment variable:-->
		 * 
		 * 			=> Visit site https://chromedriver.chromium.org/downloads
		 * 			=> Select chromedriver version w.r.t chrome browser..
		 * 						chrome browser 81 = chromedriverdriver 81
		 * 			=> Click on ChromeDriver version
		 * 			=> Select Operating system to downlaod chromDriver.
		 * 			
		 * 	
		 * 
		 */
		
	
		String path="E:\\29th_Apr_9-30AM_2020\\Project_180\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://facebook.com");
		
		
		

	}

}
