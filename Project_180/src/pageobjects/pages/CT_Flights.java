package pageobjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CT_Flights 
{
	
	@FindBy(how=How.ID,using="OneWay") 
	public WebElement Oneway_Rbtn;
	
	@FindBy(xpath="//input[@id='RoundTrip']") 
	public WebElement Roundtrip_Rbtn;
	
	@FindBy(xpath = "//input[@value='MultiCity']") 
	public WebElement Multicity_Rbtn;
	
	@FindBy(xpath = "//input[@id='FromTag']") 
	public WebElement From_City_AEB;
	
	@FindBy(xpath = "//input[@id='ToTag']")
	public WebElement To_City_AEB;
	
	@FindBy(xpath = "//input[@id='DepartDate']")
	public WebElement Departure_EB;
	
	@FindBy(xpath = "//input[@id='ReturnDate']")
	public WebElement ReturnDate_EB;
	
	@FindBy(xpath = "//select[@id='Adults']")
	public WebElement Adults_Dropdown;
	
	@FindBy(xpath = "//input[@id='SearchBtn']")
	public WebElement Search_flights_btn;
	
	@FindBy(xpath = "//input[@id='SearchBtn']")
	public WebElement Flights_HYD_City;
	
	@FindBy(xpath = "//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")
	public WebElement Flights_DEL_City;
	
	@FindBy(xpath = "//a[contains(.,'Mumbai, IN - Chatrapati Shivaji Airport (BOM)')]")
	public WebElement Flights_Mumbai_City;
	
	@FindBy(xpath = "(//a[contains(.,'20')])[1]")
	public WebElement Departure_Date;
	
	@FindBy(xpath = "(//a[contains(.,'28')])[1]")
	public WebElement Arrival_Date;
	
	

}
