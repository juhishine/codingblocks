package Assignment27thnov_function;

import java.util.Scanner;

public class Conversionanytoany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Take sb (source number system base), db (destination number system base) and sn (number in source 
		 * format). Write a function that converts sn to its counterpart in destination
		   number system. Print the value returned.sample input 
8
2 
33*/
		Scanner sc=new Scanner(System.in);
		int source=sc.nextInt();
		int destination=sc.nextInt();
		int number=sc.nextInt();
		System.out.println(conversionAny(source,destination,number));
	}
	public static int conversionAny(int s, int d, int n)
	{   int rem=0;
	int mul=1;
	int sum=0;
		while(n>0)
		{  rem=n%10;
		   sum+=rem*mul;
		   mul=mul*s;//mul=1;
		   n=n/10;
		}
		int rema=0;int multiply=1;int value=0;
		while(sum>0)
		{
			rema=sum%d;
			value+=rema*multiply;
			multiply=multiply*10;
			sum=sum/d;
		}
		return value;
	}

}
