package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action_Click_And_Hold {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		

		WebElement Doc1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
		WebElement Doc2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
		WebElement Doc3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
		WebElement Doc4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
		
		WebElement Trash_Bin=driver.findElement(By.xpath("//div[contains(@class,'trash')]"));
		
		
		new Actions(driver).clickAndHold(Doc1).moveToElement(Trash_Bin).release().perform();
		new Actions(driver).clickAndHold(Doc2).moveToElement(Trash_Bin).release().perform();
		new Actions(driver).clickAndHold(Doc3).moveToElement(Trash_Bin).release().perform();
		new Actions(driver).clickAndHold(Doc4).moveToElement(Trash_Bin).release().perform();
	}

}
