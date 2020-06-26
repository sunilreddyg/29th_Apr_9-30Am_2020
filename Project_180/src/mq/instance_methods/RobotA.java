package mq.instance_methods;

public class RobotA 
{
	//Constructor of class [or] class instance
	public RobotA() 
	{
		System.out.println("Turn on RobotA");
	}
	
	//Instant Method
	public void walk()
	{
		System.out.println("walk executed");
	}
	
	//Instant method
	public void Run()
	{
		System.out.println("Run executed");
	}

	//Main method
	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to call any instant method from main method we should create object
		 * for class.
		 * 			Classname obj=new Classname();
		 * 			obj.methodname();
		 */
		
		new RobotA();    //new keyword only access instance of public class
		
		
		//With help of class instance call instant method.
		new RobotA().walk();
		new RobotA().Run();
		
		//Classobject creation with variable reference
		RobotA obj=new RobotA();
		obj.walk();
		obj.Run();
		
			

	}

}
