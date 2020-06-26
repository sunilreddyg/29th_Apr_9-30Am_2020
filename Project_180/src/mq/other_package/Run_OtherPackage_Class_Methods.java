package mq.other_package;

import mq.instance_methods.RobotA;
import mq.static_methods.RobotB;

public class Run_OtherPackage_Class_Methods {

	public static void main(String[] args) 
	{
		
		/*
		 * Rules to call other package methods and varaibles.
		 * 1. Inorder to access any method/variable outside package, programmer 
		 * 		must declare method/variable with public modifier..
		 * 
		 * 2. Inorder to access any method/variable outside package, Programmer
		 * 		must import other package referals to current class.
		 */
	
		//Calling Instant Methods
		RobotA obj=new RobotA();
		obj.walk();
		obj.Run();
		
		
		//Calling Static Methods
		RobotB.sleep();
		RobotB.wakeup();
		
		
	}

}
