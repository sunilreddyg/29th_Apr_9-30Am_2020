package pageobjects.With_Global_Declaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FB_Reg {

	WebDriver driver;
	
	public FB_Reg(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver; //THis line allowd otherclass browser driver in current class.
	}
	
	
	
	public void Refresh_A_Page()
	{
		driver.navigate().refresh();
	}
	

}
