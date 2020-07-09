package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Commands {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://facebook.com");  //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		
		//Enable javascript executor at Automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Typing characters into editbox using javascript.
		js.executeScript("document.getElementById('email').value='qadarshan@gmail.com'");
		js.executeScript("document.getElementById('pass').value='Hello1234567'");
		
		
		//Javascript using Xpath
		WebElement Firstname_EB=driver.findElement(By.xpath("//input[@name='firstname']"));
		js.executeScript("arguments[0].value='Selenium'", Firstname_EB);
		
		WebElement Lastname_EB=driver.findElement(By.xpath("//input[@name='lastname']"));
		js.executeScript("arguments[0].value='WebDriver'",Lastname_EB);
		
		//Dropdown Selection Command
		js.executeScript("document.getElementById('day').value='10'");
		js.executeScript("document.getElementById('month').value='5'");
		js.executeScript("document.getElementById('year').selectedIndex='4'");
		
		//Radio button selection using javascript
		WebElement Female_Rbtn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked='true'", Female_Rbtn);
		Thread.sleep(4000);
		
		//Radio button selection using javascript...
		WebElement Male_Rbtn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()", Male_Rbtn);
		Thread.sleep(4000);

	}

}
