package mq.selenium_webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_And_PartialLInktext 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
	
		Thread.sleep(10000);  //Static timegap to close advertise window
		
		 /*
		 * Click link with original linkname
		 * 
		 * 	Link HtmlSource:--->
		 * 			<a href="/about" title="About Us" >About Us</a>
		 * 
		 */
		driver.findElement(By.linkText("About Us")).click();
		
		/*
		 * click link with original linkname
		 * Link HtmlSource:-->
		 * 			<a href="/jobs">Jobs</a>
		 */
		driver.findElement(By.linkText("Jobs")).click();
		
		
		/*
		 * click link with original linkname
		 * Linke HtmlSource:-->
		 * 			<a href="/jobs/openings">Job Openings</a>
		 */
		driver.findElement(By.linkText("Job Openings")).click();
		
		
		/*
		 * click link with partial linktext
		 * HtmlSource:-->
		 * 			<a href="https://www.cleartrip.com/jobs/openings/product-designer-2/">
		 * 				<strong>Product Designer</strong>
		 * 	        	<span class="location">Bangalore</span>	
		 *		    </a>
		 */
		driver.findElement(By.partialLinkText("Product Designer")).click();
		
		
		/*
		 * click link with link  text
		 * 
		 * Htmlsource:-->
		 * 		<a rel="bToolTip" title="Flights" href="/flights">
		 * 			<span class="productIcon flights">Flights</span>
		 *      </a>
		 */
		driver.findElement(By.linkText("Flights")).click();
		

	}

}
