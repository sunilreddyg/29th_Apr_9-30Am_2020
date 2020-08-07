package pageobjects.GroupObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Group_Objects {



	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		FB_Home fb=new FB_Home(driver);
		int count=fb.All_Dropdowns.size();
		System.out.println("@FindBy Group count is => "+count);
		
		
		int Count1=fb.Two_Category_Objects.size();
		System.out.println("@FindBy Group count is => "+Count1);
		

		int Count2=fb.All_Category_Objects.size();
		System.out.println("@FindBy group count is => "+Count2);
	}

}
