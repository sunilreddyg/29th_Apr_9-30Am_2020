package coreajava.Arrays;

public class Static_Double_Dimensional_Array {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Double dimensional array store data into tabular format.
		 */
		
		String data[][]=new String[3][2];
		
		//1st row data
		data[0][0]="Anjan";
		data[0][1]="EMP001";
		
		//2nd row data
		data[1][0]="yamuna";
		data[1][1]="EMP002";
		
		//3rd row data
		data[2][0]="aakash";
		data[2][1]="EMP003";
		
		System.out.println("2nd row first cell data is => "+data[1][0]);
		
		
		//Get length of array
		int size=data.length;
		System.out.println("Array size is => "+size);
		

	}

}
