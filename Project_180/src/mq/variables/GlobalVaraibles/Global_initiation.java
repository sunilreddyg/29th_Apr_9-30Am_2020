package mq.variables.GlobalVaraibles;

public class Global_initiation 
{
	
	int x=30;
	
	void method1()
	{
		 x=10;      
	}
	
	void method2()
	{
		int y=10+x;
		System.out.println("total value is => "+y);
	}
	
	public static void main(String args[])
	{
		
		Global_initiation obj=new Global_initiation();
		obj.method1(); 
		obj.method2();
		
	}
}
