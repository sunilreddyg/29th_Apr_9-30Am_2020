package pageobjects.pages.With_Constructor;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CT_Trains {

	public CT_Trains(WebDriver driver)  //parameter will bring browser controls to this class
	{
		PageFactory.initElements(driver, this); //This line helps to identify @findby objects.
		
	}
	
	
	//@Findby lookup for object at webpage using pagefactory class.
	@FindBy(how=How.ID,using="from_station") 
	public WebElement From_AEB;
	
	@FindBy(xpath = "//li[contains(.,'Hyderabad Decan (HYB)')]")
	public WebElement From_HYD_City;
	
	@FindBy(xpath="//input[@name='to_station']")
	public WebElement To_AEB;
	
	@FindBy(xpath = "//li[contains(.,'Delhi (DLI)')]")
	public WebElement To_DIL_City;
	
	@FindBy(xpath = "//select[@id='trainClass']")
	public WebElement Travel_Class_DD;
	
	@FindBy(xpath = "//input[contains(@id,'dpt_date')]")
	public WebElement Date_DP;
	
	@FindBy(xpath="//select[@id='train_adults']")
	public WebElement Adults_Dropdown;
	
	@FindBy(xpath = "//button[@id='trainFormButton']")
	public WebElement Search_train_BTN;
	
	//Finding group of objects at webpage
	@FindBys(@FindBy(xpath="//nav[@class='trainTools']/li/a"))
	public List<WebElement> Train_Tools;	
	
	
	
	//Reusable method
	public void Search_Trains() throws Exception
	{
		From_AEB.clear();
		From_AEB.sendKeys("HYD");
		Thread.sleep(5000);
		From_HYD_City.click();
		
		To_AEB.clear();
		To_AEB.sendKeys("DEL");
		Thread.sleep(5000);
		To_DIL_City.click();
		
		new Select(Travel_Class_DD).selectByIndex(3);
		new Select(Adults_Dropdown).selectByIndex(3);
		
		Search_train_BTN.click();
		
		
	}
	
	
	
	
	
	

}
