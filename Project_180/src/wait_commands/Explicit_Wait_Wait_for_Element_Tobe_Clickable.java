package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_Wait_for_Element_Tobe_Clickable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		
		
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.elementToBeClickable
				(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"))).click();
		System.out.println("Download link received clickable behaviour..");
		
		
		
		
		

	}

}
