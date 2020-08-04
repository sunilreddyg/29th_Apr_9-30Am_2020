package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Required_Data_From_Data_Picker {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement Date_picker=driver.findElement(By.xpath("//input[@id='dpt_date']"));
		Date_picker.click();
		
		String Exp_month="October 2020";
		String Exp_Date="12";
		
		
		//For loop to iterate expected number of times
		for (int i = 0; i < 4; i++) 
		{
			
			//Identifying month header
			WebElement Month_header=driver.findElement(By.xpath("(//th[@class='month'])[1]"));
			//Get Innertext of month header
			String Act_Month=Month_header.getText();
			
			
			if(Act_Month.equals(Exp_month))
			{
				  driver.findElement(By.linkText(Exp_Date)).click();
				  break;
			}
			
		
			
			Thread.sleep(2000);
			WebElement Next_btn=driver.findElement(By.xpath("//a[@id='cal_showNextMonth']"));
			Next_btn.click();
			
			
		}
		
		
		
		

	}

}
