package robot_window_interface;

import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_notification_popup {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://cleartrip.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		
		//Mouse Cursor to location
		robot.mouseMove(307, 165);
		
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Selecting radio button with mouse actions.
		robot.mouseMove(540, 502);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		
		//MouseWheel
		robot.mouseWheel(100);
	}

}
