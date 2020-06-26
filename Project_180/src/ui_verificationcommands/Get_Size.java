package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Size {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement Month_Loc=driver.findElement(By.xpath("//*[@aria-label='Month']"));
		
		Dimension obj_dimension=Month_Loc.getSize();
		int obj_height=obj_dimension.getHeight();
		int obj_width=obj_dimension.getWidth();
		
		System.out.println("Object Height is => "+obj_height);
		System.out.println("Object width  is => "+obj_width);
		
		//Verify object visible at webpage
		if(obj_height > 0)
			System.out.println("Object visible at webpage");
		else
			System.out.println("object not visible at webpage");
		
		

	}

}
