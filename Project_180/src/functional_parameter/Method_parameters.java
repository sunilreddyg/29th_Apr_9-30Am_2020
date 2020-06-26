package functional_parameter;

public class Method_parameters 
{
	
	public void PrintTool()
	{
		System.out.println("WebDriver");
	}
	
	
	public void GetTool(String toolname)
	{
		System.out.println(toolname);
	}
	

	public static void main(String[] args) 
	{
		/*
		 * Create object for class
		 * 		ClassName obj=new ClassName();
		 */
		Method_parameters obj=new Method_parameters();
		obj.PrintTool();
		
		//Calling method with argument [Actual parameter]
		obj.GetTool("Selenium");
		obj.GetTool("RemoteCotrol");
		obj.GetTool("Appium");
		
	}

}
