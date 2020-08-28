package framework.Junit;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriver_Test2 
{
	static WebDriver driver;
	
	//This line Retrieve Current Constructor method name
	public @Rule TestName test=new TestName();
	
	@Test
	public void Tc001() 
	{
		driver.findElement(By.linkText("Sign Up")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Sign up page title verified");
	}
	
	@Test
	public void Tc002() 
	{
		driver.findElement(By.linkText("Log In")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		System.out.println("Login page title verified");
	}
	
	@Test
	public void Tc003() 
	{
		driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger title verified");
	}
	
	
	
	
	
	
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get("http://facebook.com");
	}

	@After
	public void tearDown() throws Exception 
	{
		Thread.sleep(3000);
		File Sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Sfile, new File("C:\\Users\\SUNIL\\git\\10th_July_6PM_2020\\Project_183\\screens\\"+test.getMethodName()+".png"));
	}
}
