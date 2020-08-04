package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_All_Active_Dates_From_Date_Picker {

	public static void main(String[] args) throws Exception 
	{
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement Date_picker=driver.findElement(By.xpath("//input[@id='dpt_date']"));
		Date_picker.click();
		Thread.sleep(3000);
		
		
		//Iterate for expected number of times
		for (int i = 0; i < 4; i++) 
		{
			
			WebElement Active_month=driver.findElement(By.xpath("//table[1]"));
			//Finding list of active dates under active month
			List<WebElement> Active_Dates=Active_month.findElements(By.tagName("a"));
			
			//Iterate for number of active dates
			for (int j = 0; j < Active_Dates.size(); j++) 
			{
				
				//Design script  for   FromCity AND  ToCIty 
				
				
				//Get each date using index number
				Active_Dates.get(j).click();
				Thread.sleep(200);
				
				Date_picker.click();
				Thread.sleep(200);
				
				//Restore page references inorder to avoid staleElementReferrence exception
				Active_month=driver.findElement(By.xpath("//table[1]"));
				//Finding list of active dates under active month
				Active_Dates=Active_month.findElements(By.tagName("a"));
				
			}
			
			
			
			Thread.sleep(1000);
			WebElement Next_btn=driver.findElement(By.xpath("//a[@id='cal_showNextMonth']"));
			Next_btn.click();
			Thread.sleep(1000);
			
		}
		
		
		
		
		
		

	}

}
