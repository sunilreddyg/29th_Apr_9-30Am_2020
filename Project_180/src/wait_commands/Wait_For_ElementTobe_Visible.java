package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_ElementTobe_Visible {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		driver.manage().window().maximize();
		
		
		
			
		WebElement Download_link=new WebDriverWait(driver, 20).until
		(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]")));
		System.out.println("Download link visible at webpage");
		Download_link.click();
		
	
		WebElement Releases_link=driver.findElement(By.xpath("//p[@class='releases-button']"));
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(Releases_link)).click();
		
		
	}

}
