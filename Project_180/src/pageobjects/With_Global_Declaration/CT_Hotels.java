package pageobjects.With_Global_Declaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CT_Hotels 
{
	WebDriver driver;
	
	public CT_Hotels(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;   //assigning browser controls to Global Variable.
		
	}
	
	

	
	@FindBy(xpath = "//input[@id='Tags']")
	public WebElement Where_locality_EB;
	

	
	@FindBy(xpath = "(//a[contains(.,'Hyderabad, Telangana,India')])[1]")
	public WebElement HYD_City;
	
	
	
	/*
	 * Reusable method
	 * 
	 */
	public void Search_hotel() throws Exception
	{
		Where_locality_EB.clear();
		Where_locality_EB.sendKeys("HYD");
		Thread.sleep(5000);
		HYD_City.click();
		
		
		//After search close browser.
		Thread.sleep(5000);
		driver.close();
		
	}
	
	

}
