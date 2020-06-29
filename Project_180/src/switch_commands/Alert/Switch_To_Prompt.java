package switch_commands.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_To_Prompt 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		WebElement Prompt_Tab=driver.findElement(By.xpath("//a[contains(.,'Alert with Textbox')]"));
		Prompt_Tab.click();
		Thread.sleep(2000);
		
		WebElement Prompt_link=driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		Prompt_link.click();
		Thread.sleep(5000);
		
		//Store alert into a referrence
		Alert alert=driver.switchTo().alert();
		
		//Type text into alert editbox
		alert.sendKeys("9030248855");
		
		//accept alert
		alert.accept();

	}

}
