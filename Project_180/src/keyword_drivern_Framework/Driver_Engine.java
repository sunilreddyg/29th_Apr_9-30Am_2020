package keyword_drivern_Framework;

import org.openqa.selenium.By;

public class Driver_Engine {

	public static void main(String[] args)
	{
		
		
		Excel_keywords.excel_connection("KWD.xlsx", "Sheet1");
		//Get SheetCount
		int Rcount=Excel_keywords.sht.getLastRowNum();
		
		
		//Create object repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.set_timeout(20);
		
		
	
		
		//Iterate for number of rows
		for (int i = 1; i <= Rcount ; i++) 
		{
			
			String StepName=Excel_keywords.getcellData(i, 0);
			String Lname=Excel_keywords.getcellData(i, 1);
			String Lvalue=Excel_keywords.getcellData(i, 2);
			String keyword=Excel_keywords.getcellData(i, 3);
			String InputData=Excel_keywords.getcellData(i, 4);
			
			
			//Convert lcoators from string class to By Reference
			By Default_locator=Locators.convert_locator(Lname, Lvalue);
			
			
			switch (keyword) 
			{
		
				
			case "open_application":
				obj.load_webpage(InputData);
				break;
				
			case "enter_text":
				obj.Enter_text(Default_locator, InputData);
				break;
			
			case "select_dropdown":
				obj.Select_dropdown(Default_locator, InputData);
				break;
				
			case "click_element":
				obj.Click_element(Default_locator);
				break;
				
			case "switchto_window":
				obj.switchto_window(InputData);
				break;
				
			case "mouse_hover":
				obj.MouseHover(Default_locator);
				break;
				
			case "Verify_title":
				obj.is_title_presented(InputData);
				break;
				
			case "CaptureScreen":
				obj.Capturescreen(InputData);
				break;
				
			case "Alert_Close":
				obj.CloseAlert();
				break;
				

			default:
				break;
			}
			
			
			
		}

	}

}
