package extent_reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report_Syntax 
{

	public static void main(String[] args)
	{
		
		//Store file location
		String file_path="E:\\Apr_25th_6PM_2019\\reports\\Myreports.html";
		
		//Create object for extent reports.
		ExtentReports reporter=new ExtentReports(file_path, true);
		
		
		ExtentTest test1=reporter.startTest("Tc001 Login Valid");
		
		test1.log(LogStatus.INFO, "info result updated");
		test1.log(LogStatus.PASS, "pass status updated");
		test1.log(LogStatus.SKIP, "skip status updated");
		
		reporter.endTest(test1);
		
	
		//Write your reports to html file
		reporter.flush();
		
	}

}
