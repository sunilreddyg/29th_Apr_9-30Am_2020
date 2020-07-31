package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement Hotels_link=driver.findElement(By.xpath("//a[@title='Find hotels in destinations around the world']"));
		Hotels_link.click();
		
		//Identify location of footer area
		WebElement Footer_Area=driver.findElement(By.xpath("//div[@class='col col18']//ul[@class='inline clearFix']"));
		
		//Find List of links under footer area..
		List<WebElement> Footer_links=Footer_Area.findElements(By.tagName("a"));
		System.out.println("Number of footer links available is => "+Footer_links.size());
		
		
		//Iterate for number of links
		for (int i = 0; i < Footer_links.size(); i++) 
		{
			
			//Get Each link
			WebElement Eachlink=Footer_links.get(i);
			System.out.println(Eachlink.getText());
			Eachlink.click();   
			Thread.sleep(2000);
			
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			
			//Restore page references inorder to avoid "StaleElementReference" Exception
			Footer_Area=driver.findElement(By.xpath("//div[@class='col col18']//ul[@class='inline clearFix']"));
			Footer_links=Footer_Area.findElements(By.tagName("a"));
			
		}
		
		
		
		

	}

}
