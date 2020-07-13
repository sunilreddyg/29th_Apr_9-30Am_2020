package robot_window_interface;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Screen_WIth_Robot {

	public static void main(String[] args) throws AWTException, IOException  
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://cleartrip.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Get default screen size of system
		Dimension Screen_size=Toolkit.getDefaultToolkit().getScreenSize();
		//Creating screen with system default size.
		BufferedImage image=robot.createScreenCapture(new Rectangle(Screen_size));
		
		//Dump screen into local system
		//IMageIO.write(Renderedimage, "ImageExtension" path);
		ImageIO.write(image, "PNG", new File("C:\\IDE_Projects\\RobotImage.png"));
		
		
		
		
		
		

	}

}
