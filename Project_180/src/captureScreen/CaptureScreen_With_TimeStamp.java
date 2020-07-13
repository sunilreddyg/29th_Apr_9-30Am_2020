package captureScreen;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_With_TimeStamp {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      	//Launch browser
		driver.get("http://naukri.com");       		//load page to browser
		driver.manage().window().maximize();	 	//Maximize browser window
		
		
		
		//Get Default system date
		Date sdate=new Date();
		System.out.println("Default system Date ==> "+sdate.toString());
		//Create simple dateformatter
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert date using simple date formatter
		String time=sdf.format(sdate);
		System.out.println(time);
		
		/*
		 * Note:--> In time format forward slash create sub folder.
		 */
		
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Copy Screent to local utilities
		FileUtils.copyFile(src, new File("Screens\\"+time+"NewImage.png"));

	}

}
