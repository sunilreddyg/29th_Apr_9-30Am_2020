package coreajava.Arrays;

public class Static_SIngle_Dimensional_Array 
{

	public static void main(String[] args) 
	{
		
		
		//Set of integers to store in array
		int num[]=new int[4];
		num[0]=100;
		num[1]=101;
		num[2]=102;
		num[3]=103;
		System.out.println(num[2]);
		
		
		//set of strings to store in array.
		String browser[]=new String[3];
		browser[0]="firefox";
		browser[1]="chrome";
		browser[2]="edge";

		
		System.out.println(browser[2]);
		System.out.println("size of array is => "+browser.length);
		
		
		//Store set of different values int array.
		Object val[]=new Object[4];
		val[0]="Arun";
		val[1]=25;
		val[2]=25000.00;
		val[3]='O';
		
		System.out.println(val[0]);
		System.out.println(val[1]);
		
		
		
		//Get length of array
		int size=val.length;
		System.out.println("Array size is => "+size);

	}

}
