package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText_Table_Records {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Testcase:--> Verify Expected record available at webtable..
		 */
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		WebElement markets_link=driver.findElement(By.xpath("(//a[contains(.,'markets')])[1]"));
		markets_link.click();
		
		
		//Target webtable
		WebElement table=driver.findElement(By.xpath("//*[@id='pnl_Bse']/table"));
		String Gainers_text=table.getText();
		
		//Write a decision to verify expected record available at gainers table.
		if(Gainers_text.contains("KOTMAH"))
		{
			System.out.println("Testpass, Expected record available at Gainers table");
		}
		else
		{
			System.out.println("Testfail, Expected record not available at gainers table");
		}
		

	}

}
