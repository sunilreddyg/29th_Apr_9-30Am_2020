package framework.Datadriven.Notepad_Files;

import java.util.Scanner;

public class Read_Data_From_System_Using_Scanner {

	public static void main(String[] args) 
	{
		
		
		//Create object for scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username :-->");
		String UID=sc.nextLine();
		System.out.println("My Username is => "+UID);
		
		
		System.out.println("Enter Numeric Code -->");
		int Code=sc.nextInt();
		System.out.println("My Code is --> "+Code);

		System.out.println("Enter boolean status is -> ");
		boolean Status=sc.nextBoolean();
		System.out.println("Status is => "+Status);
		
		
		
		System.out.println("Start Iteration => ");
		int Start=sc.nextInt();
		
		System.out.println("End Iteration => ");
		int End=sc.nextInt();
		
		for (int i = Start; i < End; i++) 
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
	}

}
