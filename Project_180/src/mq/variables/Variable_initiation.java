package mq.variables;

public class Variable_initiation 
{

	public static void main(String[] args)
	{
		
			int a=100;
			System.out.println(a);
			
			int b=200;
			b=300;
			System.out.println(b);	
			
			int c;
			c=400;
			System.out.println(c);
			
			
			
			int d;   //Globally initiated..
			if(true)
			{
				d=1000;
			}
			System.out.println("Variable value outside condition => "+d);
			
			
			//Example:--> Append local variable value to global variable
			String Surname="Gajjala";
			if(true)
			{
				String Name="Sunil";
				Surname=Surname+"-"+Name;
			}
			System.out.println(Surname);
			
			
			//Conduct Sum between numbers 1-10
			int sum = 0;
			for (int i = 1; i < 11; i++) 
			{
				sum=sum+i;
			}
			System.out.println("total value is => "+sum);
			
			
	}

}
