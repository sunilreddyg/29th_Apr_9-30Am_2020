package findElements.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Click_inside_A_Cell_BasedOn_Referral_Records {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		WebElement Markets=driver.findElement(By.xpath("(//a[contains(.,'markets')])[1]"));
		Markets.click();
		Thread.sleep(5000);
		
		
		//Idenity webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='dvToplooser']//table"));
		
		//Find list of rows available under webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("Number of rows available ----> "+rows.size());
		
		
		for (int i = 1; i < rows.size(); i++)   //To avoid table header iteration starts from 1
		{
			
			//Get Each dynamic row using loop increment
			WebElement EachRow=rows.get(i);
			//Get Text of each row
			String Row_Text=EachRow.getText();
			
			
			//Condition to accept on selected text found
			if(Row_Text.contains("TCS"))
			{
				//Get List of Cell Under Each Row
				List<WebElement> cells=EachRow.findElements(By.tagName("td"));
				cells.get(7).findElement(By.tagName("a")).click();  
				
				/*
				 * When link get clicked it navigates to next page, During this time
				 * if iteration continues it lead to exception.
				 */
				
				break;  //It helps to eject from loop
				
			}
			

		}
		

	}

}
