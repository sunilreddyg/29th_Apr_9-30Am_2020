package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Product_Search {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/mobiles/mi~brand/pr?sid=tyy%2C4io&otracker=nmenu_sub_Electronics_0_Mi&page=1");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		
		WebElement Next_btn=driver.findElement(By.xpath("//span[contains(.,'Next')]"));
		
		
		int i=1;
		do {
			
			
			
			//FInding product table
			WebElement Products_Table=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]"));
			//Finding list of products under table
			List<WebElement> Products=Products_Table.findElements(By.className("bhgxx2"));
			System.out.println("Size of Product is -> "+Products.size());
			
			//Iterate for number of products
			for (int j = 1; j < Products.size()-2; j++) 
			{
				
				String ProductName=Products.get(j).findElement(By.className("_3wU53n")).getText();
				System.out.println(ProductName);
				Thread.sleep(200);
				
				
				
			}
			
			
			
			WebElement Footer_Links_Area=driver.findElement(By.xpath("//nav[@class='_1ypTlJ']"));
			i=i+1;
			//Data wrapping convert integer value to string
			Integer val=i;
			String link=val.toString();
			
			Footer_Links_Area.findElement(By.linkText(link)).click();
			Thread.sleep(5000);
			
			Footer_Links_Area=driver.findElement(By.xpath("//nav[@class='_1ypTlJ']"));
			
		} while (Next_btn.isDisplayed());   //On Next btn hidden loop will eject
		

	}

}
