package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Element_Selection_State_TObe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		
		
		
		new WebDriverWait(driver, 20).until
		(ExpectedConditions.elementSelectionStateToBe(By.xpath("//input[@id='OneWay']"),false));
		System.out.println("Oneway radio button selection is false");
		
		
		new WebDriverWait(driver, 20).until
		(ExpectedConditions.elementSelectionStateToBe(By.xpath("//input[@id='OneWay']"),true));
		System.out.println("Oneway radio button selection is true");
		
		
		

	}

}
