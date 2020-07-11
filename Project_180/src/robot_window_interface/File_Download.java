package robot_window_interface;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Download {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		
		WebElement Latest_Version=driver.findElement(By.xpath("(//a[contains(.,'3.141.59')])[1]"));
		Latest_Version.click();
		
		
		//Create object for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Press Shift+Tab
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		
		//Press Enter Key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release shift
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		
		
		
		

	}

}
