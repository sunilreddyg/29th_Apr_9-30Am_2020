package launch_browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_browser {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Download  IEDriverServer.exe file.
		 * 
		 * 		=> Visit site https://www.selenium.dev/downloads/
		 * 		=> Under The Internet Explorer Driver Server select operating systems
		 * 				and click on windows 64-bit IE.
		 * 		Note:--> IEDriverServer.exe version should match with WebDriver Version.
		 * 
		 * 		=> IT download Zipformat file, unzip file and configure .exe file to
		 * 				project.
		 * 
		 * 
		 * 		=> IE Browser zoom level should be 100%
		 * 		=> All Security and privacy setting shoule be disabled.
		 * 		=> IE browser versions support 8,9,10,11 
		 */
		
		
		System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		
		
		
		
		
		
		
		
		

	}

}
