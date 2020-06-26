package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_CssValue {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:--> Verify Sensex board details
		 * 		Given site url https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx
		 * 		When user select Sensex Tab
		 * 		Then Verify Sensex Details displayed on board..
		 */

		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[@id='InvestRec']"));
		//Sensex_tab.click();
		
		
		String BG_Color=Sensex_tab.getCssValue("background-color");
		System.out.println(BG_Color);
		
		
		//COnditional statement to verify background color
		if(BG_Color.equals("rgb(231, 120, 23)"))
			System.out.println("Testpass, Background color is matching");
		else
			System.out.println("Testfail, Background color is mismatching");
		
		
		
		
		
		
		
	}

}
