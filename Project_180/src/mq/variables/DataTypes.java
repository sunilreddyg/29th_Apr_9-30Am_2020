package mq.variables;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		/*
		 * byte:-->
		 * 			=> Byte is a integer data type
		 * 			=> Default value of byte is zero.
		 * 			=> Max value store by byte is 127.
		 */
		byte a=127;
		byte b=126;
		System.out.println(a+b+" ==> is Total");       //Conduct Sum between Numbers
		System.out.println("Total value is => "+a+b);  //Concortinate between Numbers
		
		System.out.println("byte value is => "+a);
		
		
		
		/*
		 * short:-->
		 * 			=> short is a integer data type
		 * 			=> Default value of short is zero.
		 * 			=> Max value store by short is 32767.
		 */
		short x=32767;
		System.out.println("maximum value of short is => "+x);
		
		
		
		/*
		 * int:-->
		 * 		=> Int is numeric datatype
		 * 		=> Default value of int is zero.
		 * 		=> Max value store by int is 2,147,483, 647
		 */
		int num=2147483647;
		System.out.println("numeric value is --> "+num);
		
		
		/*
		 * boolean:-->
		 * 		=> Boolean accept true/false
		 * 		=> Default value of boolean is false..
		 */
		 boolean flag=true;
		 System.out.println("Status of flag is => "+flag);
		 
		 
		 /*
		  * double:--> 
		  * 	=> Double accept decimal numbers
		  * 	=> Default value is zero
		  * 	=> Double accept 15 significant decimals.
		  */
		double m=123.000123456789;
		System.out.println("Double value is => "+m);
		
		
		 /*
		  * float:-->
		  * 	=> Float accept decimal numbers
		  * 	=> Maximum decimal value accepted 7
		  * 	=> Default valuei is 0
		  * 	=> We must append f characters at end of float value, Otherwise
		  * 		it store as double value.
		  */
		 float n=123.12001f;
		 System.out.println("Float value is -> "+n);
		 
		 
		 
		 /*
		  * char:-->
		  * 	=> Char accept single character
		  * 	=> We should define character in single code
		  * 	
		  */
		 char group='A';
		 System.out.println("Char value is => "+group);
		 
		 
		 /*
		  * String:--> 
		  * 		=> String is a non primitive datatype
		  * 		=> It accept set of characters to store inside double codes.
		  * 		=> Default value of String is null.
		  */
		 String name="Sunil Reddy";
		 String email="sunil.gajjala@gmail.com";
		 String mobile="9030248855";
		 
		 System.out.println(name+"     "+email+"     "+mobile);
		 System.out.println(name+"\t"+email+"\t"+mobile);  //Escape sequences
		 

	}

}
