package corejava.Loops;

public class For_Loop_Example 
{
	public static void main(String args[])
	{
		
		
		//print numbers 1 to 10.
		for (int i = 1; i < 11; i++) 
		{
			System.out.println(i);
		}
		
		//print numbers 20 to 10
		for (int i = 20; i > 9; i--) 
		{
			System.out.println(i);
		}
		
		
		//Condut sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is => "+sum);
		
		
		
		//Print array value using for loop
		String tools[]= {"IDE","RC","WD","Appium","GRID"};
		for (int i = 0; i < tools.length; i++) 
		{
			System.out.println(tools[i]);
		}
		
		
		
		
		
		
		
	}

}
