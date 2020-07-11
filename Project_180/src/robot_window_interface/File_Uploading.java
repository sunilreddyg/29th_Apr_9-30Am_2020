package robot_window_interface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Uploading {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  					
		driver.get("https://www.naukri.com/account/createaccount?othersrcp=16201&err=1");  		
		driver.manage().window().maximize(); 		
		
		
		WebElement Iam_Fresher=driver.findElement(By.xpath("//button[@value='fresher']"));
		Iam_Fresher.click();
		Thread.sleep(5000);
		
		
		
		WebElement upload_btn=driver.findElement(By.xpath("//input[@type='file']"));
		new Actions(driver).click(upload_btn).perform();
		

		String path="C:\\Users\\SUNIL\\Desktop\\MyResume.docx";
		
		//CopyString and add content to clipboard
		StringSelection spath=new StringSelection(path);
		//Enable System clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);
		
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		//Press Control+V
		robot.keyPress(KeyEvent.VK_CONTROL);   //Because control is down key we need release after completed actions
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
