package findElements.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_From_WebTable_Using_SpecificRow_And_Cell_Number {

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
		
		//Get 6th row using index number
		WebElement SelectedRow=rows.get(6);
		
		//FInd list of cells under Selected Row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		System.out.println("Number of cells available is ----> "+cells.size());
		
		
		//Get cell data from Selected row
		String CompanyName=cells.get(0).getText();
		String High_Price=cells.get(3).getText();
		
		System.out.println(CompanyName+"   "+High_Price);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
