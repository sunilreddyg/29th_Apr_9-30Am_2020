package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_Read_WebDriver_Testcase {

	public static void main(String[] args) throws IOException, Exception 
	{
		
		//Target File at Local System
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet2");
		
		//Target row using above sheet
		XSSFRow row=sht.getRow(6);
		
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Get Application url from excel
		String Outlook_url=row.getCell(0).getStringCellValue();
		driver.get(Outlook_url);
		
		
		//Get Singin Navigation button
		String SIgnin_Nav_button=row.getCell(1).getStringCellValue();
		driver.findElement(By.xpath(SIgnin_Nav_button)).click();
		Thread.sleep(5000);
		
		//Get Email Location and Emailinput from Excel
		String Email_locator=row.getCell(2).getStringCellValue();
		String Email_input=row.getCell(3).getStringCellValue();
		WebElement Email=driver.findElement(By.xpath(Email_locator));
		Email.clear();
		Email.sendKeys(Email_input);
		
		//Get Email Validation Next button from Excel
		String Email_Next_btn=row.getCell(3).getStringCellValue();
		driver.findElement(By.xpath(Email_Next_btn)).click();
		
		
		
		
		
		
		


	}

}
