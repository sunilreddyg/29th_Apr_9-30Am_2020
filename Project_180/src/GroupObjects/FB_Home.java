package pageobjects.GroupObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FB_Home {

	public FB_Home(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//This syntax helps to identify group of objects..
	@FindBy(xpath="//select[@class='_9407 _5dba _8esg']")
	public List<WebElement> All_Dropdowns;
	
	
	
	
	
	/*
	 * @FindBys:--> When required webelement objects both contains email and pass
	 * 
	 * 					And-Comparision
	 */
	@FindBys
	(
			{
			@FindBy(how=How.ID,using="email"),
			@FindBy(how=How.ID,using="pass")
			}
	) List<WebElement> Two_Category_Objects;
	
	
	
	/*
	 * @FindAll:--> when required webelement objects with any one category
	 * 				OR-Comparision.
	 */
	@FindAll
	(
			{
			@FindBy(how=How.ID,using="email"),
			@FindBy(how=How.ID,using="pass")
			}
	) List<WebElement> All_Category_Objects;
	
	
	
	
	
	

}
