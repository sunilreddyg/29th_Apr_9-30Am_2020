package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_OPtions {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		Select Month_Dropdown=new Select(driver.findElement(By.id("month")));
		List<WebElement> All_Options=Month_Dropdown.getOptions();
		
		//Iterate for number of dropdown options
		for (int i = 1; i < All_Options.size(); i++) 
		{
			All_Options.get(i).click();
			System.out.println(All_Options.get(i).getText());
			Thread.sleep(200);
			
		}
		
		
		
		//Seleting All dropdown option without using GetOption Commands
		WebElement Year_Dropdown=driver.findElement(By.id("year"));
		List<WebElement> All_years=Year_Dropdown.findElements(By.tagName("option"));
		//Apply foreach loop to iterate list of option
		for (WebElement EachYear : All_years)
		{
			EachYear.click();
			System.out.println(EachYear.getText());
			Thread.sleep(200);
		}
		
		
		
		
	}

}
