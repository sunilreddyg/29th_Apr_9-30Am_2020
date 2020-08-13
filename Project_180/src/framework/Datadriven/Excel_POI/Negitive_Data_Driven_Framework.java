package framework.Datadriven.Excel_POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negitive_Data_Driven_Framework {

	public static void main(String[] args) throws IOException, Exception 
	{
		
		//Target File at Local System
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
				
		//Get Workbook using above fileinput stream
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using above workbook
		XSSFSheet sht=book.getSheet("Sheet5");
		
		//Get Lastrow number
		int Rcount=sht.getLastRowNum();
		System.out.println("Number of rows available is => "+Rcount);
		
		
		
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		//iterate for number of rows
		for (int i = 6; i <= Rcount; i++) 
		{
			
			
			String Exe_Status=sht.getRow(i).getCell(6).getStringCellValue();
			//Condition to accept only execution status meet yes
			if(Exe_Status.equals("y"))
			{
				
				String Tcname=sht.getRow(i).getCell(0).getStringCellValue();
				
				//Load url to browser window
				driver.get("https://outlook.com");
				
				//Get Siginnbutton location from Excel
				String Signin_btn=sht.getRow(6).getCell(1).getStringCellValue();
				driver.findElement(By.xpath(Signin_btn)).click();
				Thread.sleep(5000);
				
				//Get email location from excel
				String Email_location=sht.getRow(6).getCell(2).getStringCellValue();
				String Email_input=sht.getRow(i).getCell(3).getStringCellValue();
				
				WebElement Email_EB=driver.findElement(By.xpath(Email_location));
				Email_EB.clear();
				Email_EB.sendKeys(Email_input);
				Thread.sleep(2000);
				
				//Get Next button location from excel
				String Next_btn=sht.getRow(6).getCell(4).getStringCellValue();
				driver.findElement(By.xpath(Next_btn)).click();
				Thread.sleep(8000);
				
				
				//Get scenario type and expected result from excel
				String Stype=sht.getRow(i).getCell(7).getStringCellValue();
				String Exp_result=sht.getRow(i).getCell(5).getStringCellValue();
				
				
				if(Stype.equals("text"))
				{
					//Get current page visible text
					String Page_Visible_Text=driver.findElement(By.tagName("body")).getText();
					Thread.sleep(2000);
					
				
					//Verify current page contains expected result
					if(Page_Visible_Text.contains(Exp_result))
					{
						System.out.println(Tcname+"      "+"Testpass");
						sht.getRow(i).createCell(8).setCellValue("Testpass");
					}
					else
					{
						System.out.println(Tcname+"      "+"Testfail");
						sht.getRow(i).createCell(8).setCellValue("TestFail");
					}
					
				}
		
				
				
				if(Stype.equals("object"))
				{
					//Is displayed verify object visible status and return boolean value true/false.
					boolean flag=driver.findElement(By.id(Exp_result)).isDisplayed();
					if(flag==true)
					{
						System.out.println(Tcname+"      "+"Testpass");
						sht.getRow(i).createCell(8).setCellValue("Testpass");
					}
					else
					{
						System.out.println(Tcname+"      "+"Testfail");
						sht.getRow(i).createCell(8).setCellValue("TestFail");
					}
					
				}
				
				
				
				
			}
			
			
		}
		
		
		//This one we have to write outside a loop
		FileOutputStream fo=new FileOutputStream("TestData\\OP.xlsx");
		book.write(fo);  //
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
