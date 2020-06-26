package mq.instance_methods;

public class RobotC 
{
	
	public void walk()
	{
		System.out.println("4 km speed");
	}
	
	
	public void walk(int km)  //Functional parameter
	{
		System.out.println(km);
	}
	
	
	public int  getSpeed()
	{
		return 10;
	}
	
	
	public double getPrice(int num)
	{
		return 1000.00 * num;   //It return value to methodname.
	}
	
	

	public static void main(String[] args) 
	{
		
		//Create object for class
		RobotC obj=new RobotC();
		obj.walk();      
		obj.walk(5); 	//5 is a Actual parameter/[Argument]
		obj.walk(10); 	//10 is a Actual parameter/[Argument]
		
		int speed=obj.getSpeed();
		System.out.println("Return speed is => "+speed);
		
		double total=obj.getPrice(5);
		System.out.println("total price of robot is => "+total);
		
	}

}
