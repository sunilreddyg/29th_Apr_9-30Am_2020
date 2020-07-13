package captureScreen;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_Capture_With_WebDriver 
{

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://cleartrip.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Create folder in local utilites
		FileHandler.createDir(new File("C:\\IDE_Projects\\Screens"));
		//Copy Screent to local utilities
		FileHandler.copy(src, new File("C:\\IDE_Projects\\Screens\\NewImage.png"));
		
		
		new File("C:\\IDE_Projects\\Screens\\NewImage.png");
		System.out.println("File located");
		
	
		
		/*
		 * Disadvantages:-->
		 * 		1. Every time when program re running it overriding image.
		 * 		2. Only capturing top frame of screen..
		 * 		3. Can't capture screen when alert was presented...
		 */
		
		
		

	}

}
