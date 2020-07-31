package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupElements {

	public static void main(String[] args) 
	{
		
		/*
		 * FindElement:--->
		 * 			FindElement is a webdriver method which helps to identify any
		 * 			single object with in webpage using ID and Name properties..
		 * 
		 * Syntax:--->
		 * 			WebElement Object=driver.findElement(By.id("propertyvalue"));
		 */
		
		/*
		 * FindElements:--->
		 * 			FindElements is a webdriver method which helps to identify group
		 * 			objects with in webpage using Tagname and classname.
		 * 
		 * 			List<WebElement> Objects=driver.findElements(By.classname("class property"));
		 * 			List<WebElement> Objects=driver.findElements(By.tagname("tagname"));
		 */
		
		
		
		/*
		 * Note:--> Don't run this program
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://sampledomain.con");
		driver.manage().window().maximize();
		
		
		WebElement Element=driver.findElement(By.id("IDProperty"));
		Element.clear();
		Element.click();
		Element.sendKeys("ABCD");
		Element.submit();
		Element.getText();
		Element.isDisplayed();
		Element.findElement(By.id("IDproperty"));
		Element.findElements(By.tagName("a"));
		
		
		
		List<WebElement> GroupElements=driver.findElements(By.tagName("a"));
		//Get one single object from groupobject using index number.
		WebElement Single_Element=GroupElements.get(3);
		
		Single_Element.clear();
		Single_Element.click();
		Single_Element.sendKeys("ABCD");
		Single_Element.submit();
		Single_Element.getText();
		Single_Element.isDisplayed();
		Single_Element.findElement(By.id("IDproperty"));
		Single_Element.findElements(By.tagName("a"));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
