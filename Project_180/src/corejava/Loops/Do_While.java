package corejava.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While {

	public static void main(String[] args) throws Exception 
	{
		
		
		//print numbers from 1 to 10.
		int i=0;
		do {
			System.out.println(i);
			i=i+1;
		} while (i <=10);
		
		
		
		//Do-while with false condition
		int j=100;
		do {
			System.out.println(j+" -->Iterated only once");
		} while (j <=10);  //It eject loop beacuse of false condition
		
		
		
		/*
		 * Example:--> Using do-while write a program to reload page
		 * 				until expected page found..
		 */
		
		
		System.setProperty("webdriver.chrome.driver",  "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		boolean flag=false;
		int m=0;
		do {
			driver.get("http://facebook.com");
			
			try {
				new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Google"));
				flag=true;
			} catch (Exception e) {
				System.out.println("title not found after waiting 10 seconds");
			}
			
			m=m+1;
			if(m==10)
			{
				throw new Exception("break iteration after many attempts");
			}
		
		} while (flag==false);  //When flag value return true while eject loop
		
		
		
		System.out.println("Expected title found");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
