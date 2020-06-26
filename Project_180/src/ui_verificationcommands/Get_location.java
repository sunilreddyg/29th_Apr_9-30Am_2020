package ui_verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_location {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement Month_Loc=driver.findElement(By.xpath("//*[@aria-label='Month']"));
		
		Point Obj_point=Month_Loc.getLocation();
		int obj_x=Obj_point.getX();
		int obj_y=Obj_point.getY();
		
		System.out.println("X coordinates are => "+obj_x);
		System.out.println("Y coordinates are => "+obj_y);
		
		
		//Verify object visible at webpage using coordinates
		if(obj_x > 0)
			System.out.println("Object is visible");
		else
			System.out.println("Object not visible");
		
		
		
		
		
		

	}

}
