package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WebDriver_Testcase 
{
  WebDriver driver;
  String driver_path="Drivers\\geckodriver.exe";
  String url="http://facebook.com";
  
  
  
    @Test
	void Verify_Signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
		Reporter.log("Expected title presented => "+driver.getTitle());
	}
	
	@Test
	void Verify_SignIn_link() 
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");
		Reporter.log("Expected title presented => "+driver.getTitle());
	}
	
	@Test
	void Verify_Messenger_link() 
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assert.assertEquals(driver.getTitle(), "Messenger");
		Reporter.log("Expected title presented => "+driver.getTitle());
	}
	
	
	@Test
	void Verify_Games_link() 
	{
		driver.findElement(By.xpath("//a[@href='/games/']")).click();
		Assert.assertEquals(driver.getTitle(), "Games");
		Reporter.log("Expected title presented => "+driver.getTitle());
	}
	
	

  @BeforeMethod
  public void beforeMethod()
  {
	  driver.get(url);
  }

  @AfterMethod //It invoke each test after
  public void afterMethod(Method testname) throws Exception 
  {
	  File srfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(srfile, new File("C:\\Users\\SUNIL\\git\\23rd_June_11AM_2020\\Project_181\\Screens\\"+testname.getName()+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
