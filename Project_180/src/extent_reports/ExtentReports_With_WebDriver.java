package extent_reports;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_With_WebDriver {

	public static void main(String[] args) throws Exception 
	{
		
		//Store file location
		String file_path="E:\\Apr_25th_6PM_2019\\reports\\MyResult.html";
		String scree_path="E:\\Apr_25th_6PM_2019\\reports\\screens\\";
		//Create object for extent reports.
		ExtentReports reporter=new ExtentReports(file_path, true);
		
		ExtentTest test=reporter.startTest("Tc0013-Outlook Signin valid Email");
				
				//Set runtime environment variable for chromedriver
				System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				test.log(LogStatus.INFO, "browser launched and window maximized");
				
				driver.get("http://outlook.com");
				test.log(LogStatus.INFO, "Entered url succesfully into browser window");
				
				driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader'][contains(.,'Sign in')]")).click();
				test.log(LogStatus.INFO, "Signin button get clicked");
				
				
				driver.findElement(By.xpath("//input[@id='i0116']")).clear();
				driver.findElement(By.xpath("//input[@id='i0116']")).sendKeys("sunilreddy.gajjala@outlook.com");
				test.log(LogStatus.INFO, "Enter valid email into Username Editbox");
				
				driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
				test.log(LogStatus.INFO, "click next button");
				
				Thread.sleep(5000);
				
				//Caputre screen
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File(scree_path+"Signin_valid.png"));
				
				
				//Identify password
				WebElement Password_EB=driver.findElement(By.xpath("//input[@id='i0118']"));
				if(Password_EB.isDisplayed())
				{
					test.log(LogStatus.PASS, "password visible at webpage",test.addScreenCapture(scree_path+"Signin_valid.png"));
				}
				else
				{
					test.log(LogStatus.FAIL, "password not visible at webpage",test.addScreenCapture(scree_path+"Signin_valid.png"));
				}
				
				
				
		reporter.endTest(test);
		//Write output file to html file
		reporter.flush();
	}

}
