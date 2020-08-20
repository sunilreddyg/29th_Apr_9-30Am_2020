package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_For_Frames {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Frames.html");
			driver.manage().window().maximize();
			
			//Wait for frame to load and apply switch to it.
			new WebDriverWait(driver, 50).until
			(ExpectedConditions.frameToBeAvailableAndSwitchToIt("singleframe"));
			System.out.println("Frame presented and switch applied");
			
			WebElement Frame_Editbox=driver.findElement(By.xpath("//input[@type='text']"));
			Frame_Editbox.clear();
			Frame_Editbox.sendKeys("Frame Automated");
	}

}
