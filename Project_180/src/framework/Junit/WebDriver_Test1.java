package framework.Junit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Test1 
{
	static WebDriver driver;

	
	@Test
	public void Tc001() 
	{
		driver.findElement(By.linkText("Sign Up")).click();
	}
	
	@Test
	public void Tc002() 
	{
		driver.findElement(By.linkText("Log In")).click();
	}
	
	@Test
	public void Tc003() 
	{
		driver.findElement(By.linkText("Messenger")).click();
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
		System.out.println("Screen Captured");
	}


}
