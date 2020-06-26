package mq.static_methods;

public class RobotB 
{
	//Static specifier method
	public static void sleep()
	{
		System.out.println("Robot went to sleep");
	}
	
	//Static specifier method
	public static void wakeup()
	{
		System.out.println("Robot is awake");
	}
	
	
	//Main method with static access specifier
	public static void main(String[] args) 
	{
		/*
		 * Note:-->Because main method contains static access specifier, It allow any static
		 * 		   method to call without object creation.
		 */
		
		sleep();
		wakeup();
		
		//Inorder to call Static speicier method from outside class, we must Include class name
		RobotB.sleep();
		RobotB.wakeup();

	}

}
