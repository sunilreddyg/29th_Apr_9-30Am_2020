package ui_verificationcommands;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Retrieve_Editbox_Input_Value {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario: Verifying departure date match with Current System date.
		 * 		Given site url is http://spicejet.com
		 * 		When user select oneway or roundtrip button
		 * 		Then verify departure date match with today's date.
		 */
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		
		
		//Retrieve departure date from Editbox.
		WebElement Departure_Editbox=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String DDate=Departure_Editbox.getAttribute("value");
		System.out.println(DDate);
		
		
		//Get Current System Date in java
		Date d=new Date();
		System.out.println("Default System Date is => "+d);
		
		//Convert default system date as required using java
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		String new_date=sdf.format(d);
		System.out.println("New system date is => "+new_date);
		
		
		//Verify system date matches with departure date
		if(new_date.equals(DDate))
			System.out.println("Testpass, Deapature date matches with system date");
		else
			System.out.println("Testfail, Mismatch between departure date and system date");
		
		
		/*
		 * Date formatters:-->
		 * 
		 * 		yyyy =>    year   [2020]
		 * 		  yy =>    year   [20]
		 * 		  MM =>    Month  [01-12]
		 * 		MMM  =>    Month  [Jan -Dec]
		 * 		EEE  =>    week   [sun -sat]
		 * 		  dd =>    date   [01-31]
		 * 		  hh =>    hour   [01-24]
		 * 		  mm =>    minute [01-60]
		 * 		  ss =>    Seconds[01-60]
		 * 		
		 */
		
		

		/*
		 * Scenario:--> Verify switch airports scenario
		 * 		Given site url is http://cleartrip.com
		 * 		When user selected From City
		 * 		And select To City
		 * 		And Cick on Switch airports button
		 * 		Then verify Switch applied between airports.
		 * 
		 */
		
		
		
	}

}
