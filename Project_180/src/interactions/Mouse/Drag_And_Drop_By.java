package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_By {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/free_dragging/");
		driver.manage().window().maximize();
		
		
		
		WebElement Element1=driver.findElement(By.xpath("//div[contains(@class,'draggable')]"));
		new Actions(driver).dragAndDropBy(Element1, 1000, 0).perform();
		
		
		
		
		
		
		
		
		

	}

}
