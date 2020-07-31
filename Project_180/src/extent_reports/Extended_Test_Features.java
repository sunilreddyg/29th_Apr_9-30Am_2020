package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extended_Test_Features {

	public static void main(String[] args)
	{
		String file_path="E:\\Apr_25th_6PM_2019\\reports\\myresult_Features.html";
		ExtentReports reports=new ExtentReports(file_path, true);
		
		ExtentTest test=reports.startTest("Test Login", "Login with invalid data")
				.assignCategory("regression")
				.assignAuthor("Sunil");
		

		reports.endTest(test);
		
		
		//Add child test
		
		ExtentTest parent = reports.startTest("Parent");

		ExtentTest child1 = reports.startTest("Child 1");
		child1.log(LogStatus.INFO, "Info");

		ExtentTest child2 = reports.startTest("Child 2");
		child2.log(LogStatus.PASS, "Pass");

		parent.appendChild(child1).appendChild(child2);
		    
		reports.endTest(parent);
		
		reports.flush();

	}

}
