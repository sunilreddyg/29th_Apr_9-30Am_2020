package method_parameters;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords 
{
	
	WebDriver driver;
	WebDriverWait wait;
	String Driver_path="Drivers\\";
	
	
	/*
	 * KeywordName:-->  LaunchBrowser
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	
	public void Launch_Browser(String browserName)
	{
		String browser=browserName;
		
		switch (browser) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", Driver_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default: System.out.println("Browser name mismatch");
			break;
		}
	}
	
	
	
	/*
	 * KeywordName:-->  Open application at browser window
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Open_Application(String url)
	{
		//Implicitwait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	
	/*
	 * KeywordName:-->  Set explicit wait for automation browser
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void set_timeout(int time_in_sec)
	{
		
		//Explicit timeout
	     wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	
	

	/*
	 * KeywordName:-->  Click_link
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Click_Link(String Linkname)
	{
		driver.findElement(By.linkText("Create New Account")).click();
	}
	
	
	/*
	 * KeywordName:--> EnterText
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Enter_text(String element_xpath,String input)
	{
		WebElement Editbox=driver.findElement(By.xpath(element_xpath));
		Editbox.clear();
		Editbox.sendKeys(input);
	}
	
	
	
	/*
	 * KeywordName:--> EnterText Using Locator referrence
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Enter_text(By locator,String input)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Editbox.clear();
		Editbox.sendKeys(input);
	}
	
	
	
	/*
	 * KeywordName:--> EnterText Using PageObject  [POM-Keyword]
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Enter_text(WebElement Element,String input)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(Element));
		Editbox.clear();
		Editbox.sendKeys(input);
	}
	
	

	/*
	 * KeywordName:--> Select Dropdown
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Select_Dropdown(String element_xpath,String input)
	{
		WebElement Dropdown=driver.findElement(By.xpath(element_xpath));
		new Select(Dropdown).selectByVisibleText(input);
	}
	
	
	/*
	 * KeywordName:--> Select Dropdown with locator referrence
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Select_Dropdown(By locator,String input)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Select(Dropdown).selectByVisibleText(input);
	}
	
	
	/*
	 * KeywordName:--> Select Dropdown with [POM keyword]
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Select_Dropdown(WebElement Element,String input)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOf(Element));
		new Select(Dropdown).selectByVisibleText(input);
	}
	
	
	
	/*
	 * KeywordName:-->  Click_Element [links, Radiobutton, checkbox, listbox, button]
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Click_Element(String ele_xpath)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele_xpath)));
		Element.click();
	}
	
	

	/*
	 * KeywordName:-->  Click_Element [links, Radiobutton, checkbox, listbox, button]
	 * 								[POM-keyword]
	 * Author:-->Sunil
	 * CreatedOn:--> 21 Aug
	 * ReviewedBy:--> Test Manager
	 * ParametersUsed:-->
	 * LatUpdatedDate:-->
	 */
	public void Click_Element(WebElement element)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
		Element.click();
	}
	
	
	
	/*
	 * KeywordName:--> Mousehover on element.[Using Xpath locator]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void mousehover(String Element_xpath)
	 {
		 WebElement Element=driver.findElement(By.xpath(Element_xpath));
		 new Actions(driver).moveToElement(Element).perform();
	 } 
	 
	 

	 /*
	 * KeywordName:--> Mousehover on element.[Using By parameter]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void mousehover(By locator)
	 {
		 WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		 new Actions(driver).moveToElement(Element).pause(2000).perform();
	 } 
	 
	 
	 /*
	 * KeywordName:--> Mousehover on element.[POM framework]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void mousehover(WebElement Element)
	 {
		 WebElement HoverElement=wait.until(ExpectedConditions.visibilityOf(Element));
		 new Actions(driver).moveToElement(HoverElement).pause(2000).perform();
	 } 
	 
	 
	 /*
	 * KeywordName:--> Fileupload using robot class
	 * Description:--> This keyword type path at window interface and press enter keyword
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void FileUploading(String filepath)
	 {
	 	String text=filepath;
		//Select String
		StringSelection Stext=new StringSelection(text);
		//Get default system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set content to clipboard at runtime.
		clipboard.setContents(Stext, Stext);
		
		
		//Crate object for Robot class
		Robot robot=null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
		robot.setAutoDelay(1000);
				
		//Press Ctrl+V to paste copied text into notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
				
		//Press enter key
		robot.keyPress(KeyEvent.VK_ENTER);
				
		//Release Control key
		robot.keyRelease(KeyEvent.VK_CONTROL);

	 }
	 
	 
	 
	 /*
	 * KeywordName:--> CaptureScreen using [Filename]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void capturescreen(String imagename)
	 {
		try {
			 Thread.sleep(5000);
			//creating simple date format
			SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
			//get system default date
			Date d=new Date();
			//Convert system date using default format
			String time=df.format(d);
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	 }
	 
	 
	 /*
	 * KeywordName:--> SwitchTo window
	 * Description:--> This keyword helps to switch to window with help of page title
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */	 
	 public void switchto_window(String Exp_windowtitle)
	 {
		//Get All dynamic window ID's
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		
			//Iteate for all window times
			for (String EachWindowID : Allwindow_IDS) 
			{
				//Switch to Every window
				driver.switchTo().window(EachWindowID);
				//Capture every window title
				String Runtime_title=driver.getTitle();
				
				//Condition to accept on expected window title match
				if(Runtime_title.contains(Exp_windowtitle))
				{
					break;   //Stop Iteration and get execution control out of for loop.
				}
			  }		
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
  

}
