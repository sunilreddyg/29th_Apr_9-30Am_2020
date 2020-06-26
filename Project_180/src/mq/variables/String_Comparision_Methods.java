package mq.variables;

public class String_Comparision_Methods 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 			=> String store set of characters
		 * 			=> String is not only a datatype and also called as Class.
		 * 			=> String contains set of methods to validate stored characters.
		 */
		
		
		
		/*
		 * Equals:-->
		 * 			Method compare any two string matching and return boolean value 
		 * 			true/false, Equal comparision is case sensitive.
		 */
		String Exp_res="Account Created";
		String Act_res="account created";
		
		
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("Equal comparision is => "+flag);
		
		/*
		 * Compare Two String with double equals   Act==Exp
		 */
		if(Act_res==Exp_res)
			System.out.println("Comparision equal");
		else
			System.out.println("Comparision is not equal");
		
		
		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify equal comparision between two strings, By ignoring
		 * 		case sensitive.
		 */
		 boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		 System.out.println("EqualIgnore case comparision is => "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify sub sequent characters avaialble at string, And return
		 * 		boolean value true/false.
		 */
		 String Status="Account 100 Created Successfull";
		 boolean flag2=Status.contains("Successfull");
		 System.out.println("Sub String available status is => "+flag2);
		 
		 
		 
		 /*
		  * sub-String:-->
		  * 	Method retrieve sub string characters from main String.
		  */
		 String Act_Num="0000234577882333";
		 
		 //Get last 6 digit account number
		 String Last_Digits=Act_Num.substring(10);
		 System.out.println("Last Digit account number is => "+Last_Digits);
		 
		//Get Middle Digits from account number
		 String Middle_Digits=Act_Num.substring(6, 10);
		 System.out.println("Middle digit account number is => "+Middle_Digits);
		 
		 
		 
		 /*
		  * length:-->
		  * 		Method return number of characters count with in integer 
		  * 		format.
		  */
		 String Mobile="9030248855";
		 int len=Mobile.length();
		 System.out.println("Mobile number length is => "+len);
		 
		 if(len==10)
			 System.out.println("Mobile number available in ten digits");
		 else
			 System.out.println("Mobile number not available in ten digits");
		 
		 
		 /*
		  * Empty:-->
		  * 		Method verify empty status of string and return boolean value
		  * 		true/false.
		  */
		 String var1="MQ";
		 String var2="";
		 
		 System.out.println("Empty Stauts of Var1:--> "+var1.isEmpty());
		 System.out.println("Empty Stauts of Var2:--> "+var2.isEmpty());
		 
		 
		 /*
		  * To-Lowercase:-->
		  * 		Method convert uppercase characters to lowercase.
		  */
		 String Result="Account Status";
		 String New_Result=Result.toLowerCase();
		 System.out.println("Characters in lowercase => "+New_Result);
		 
		 
		 
		 /*
		  * To_Uppercase:-->
		  * 	Method convert lowercase characters to uppercase
		  */
		 String zipcode="def34353";
		 String New_Zipcode=zipcode.toUpperCase();
		 System.out.println("Characters in Uppercase => "+New_Zipcode);
		 
		 
		 /*
		  * CharAt:-->
		  * 	Method Return single character using index position.
		  */
		 String toolname="WebDriver";
		 char ch=toolname.charAt(3);
		 System.out.println("SIngle character is => "+ch);
		 
		 
		 /*
		  * Starts-with:-->
		  * 		Method verify diven string starts with expected characters
		  * 		and return boolean value
		  */
		 String IFSC_CODE="HDFC00001234";
		 boolean flag3=IFSC_CODE.startsWith("HDFC");
		 System.out.println("IFSC-code starts with status is => "+flag3);
		 
		 /*
		  * Ends-with:-->
		  * 		Method verify given string ends with expected characters
		  * 		and returb boolean value ture/false.
		  */
		 String CityName="Hyderbad, (HYD)";
		 boolean flag4=CityName.endsWith("(HYD)");
		 System.out.println("Cityname ends with statu is => "+flag4);

	}

}
