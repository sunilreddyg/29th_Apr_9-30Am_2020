package findElements.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Read_Next_Page_Records {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		WebElement Markets=driver.findElement(By.xpath("(//a[contains(.,'markets')])[1]"));
		Markets.click();
		Thread.sleep(5000);
		
		
		WebElement Nifty_Weightage=driver.findElement(By.xpath("//a[@title='Nifty Weightage']"));
		Nifty_Weightage.click();
		Thread.sleep(5000);
		
		
		//Identify Webtable
		WebElement table=driver.findElement(By.id("gridSource"));
		
		//Find list of rows available under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Number of rows available under table is => "+rows.size());
		
		
		int count=1;
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//Target each row using loop icrement
			String RowText=rows.get(i).getText();
			System.out.println(i+"-> "+RowText);
			
			if(count==20)
			{
				WebElement Next_btn=driver.findElement(By.xpath("//th[@class='table-page:next']"));
				Next_btn.click();
				count=0;
			}
			
			count=count+1;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
