package captureScreen;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DumpFile_Using_FIle_Utils {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://naukri.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
				
				
		/*
		 * => In WebDriver after capture screen shot, We must dump
		 * 	  into local utilities.Inorder to access local utilities
		 * 	  we need to download and configure Apache commonsIO files
		 * 	  into project..
		 * 
		 * 	=> Download apache commonsio file..
		 * 	=> http://commons.apache.org/proper/commons-io/download_io.cgi
		 * 	=> Under binaries download  commons-io-2.6-bin.zip
		 * 	=> Unzip file and conifigure all executable jar files to project..
		 */
		
				
		//Capture screen anc convert into file format
		File src_file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src_file, new File("C:\\IDE_Projects\\Screens\\NewImage2.png"));
		
		/*
		 * .PNG:--> Portal network graphic  [Image extension]
		 * 				[we can also follow other extension  jpg,bmp ---etc]
		 */
		
		
				
				
				/*
				 * Disadvantages:-->
				 * 		1. Every time when program re running it overriding image.
				 * 		2. Only capturing top frame of screen..
				 * 		3. Can't capture screen when alert was presented...
				 */

	}

}
