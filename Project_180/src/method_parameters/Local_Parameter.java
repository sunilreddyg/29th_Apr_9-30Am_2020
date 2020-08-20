package method_parameters;

public class Local_Parameter 
{
	
	public void Print_tool()
	{
		String name="RemoteControl";
		System.out.println(name);
	}
	
	
	public void Print_tool(String toolname)   //Functional parameter
	{
		String name=toolname;
		System.out.println(name);
	}
	
	
	public void Print_tool(String toolname,double price)   //Functional parameters
	{
		String name=toolname;
		System.out.println(name+"   "+price);
	}
	
	
	public void Print_tool(double price,String toolname)   //Functional parameters
	{
		String name=toolname;
		System.out.println(name+"   "+price);
	}
	
	
	

	public static void main(String[] args) 
	{
		
		//Create object for class
		Local_Parameter obj=new Local_Parameter();
		obj.Print_tool();
		
		//Calling method with Actual Parameter/Argument
		obj.Print_tool("WebDriver");
		obj.Print_tool("IDE");
		obj.Print_tool("Appium");
		
		//Calling method with multiple actual parameters
		obj.Print_tool("IDE", 100.00);
		obj.Print_tool("RC", 200.00);
		
		//Calling method with multiple parameters
		obj.Print_tool(300.00, "webdriver");
	}

}
