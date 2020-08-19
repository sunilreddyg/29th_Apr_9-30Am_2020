package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_Url {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		
		
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.urlToBe("https://www.selenium.dev/"));
		System.out.println("Url verified for selenium homepage");
		

		WebElement Downloads_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
		Downloads_link.click();
		
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.urlContains("downloads/"));
		System.out.println("Download page url verified");
		
		
		
		

	}

}
