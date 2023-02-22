package Assignment27thnov_function;

import java.util.Scanner;

public class Printseries_firstN1termsoftheseries3nplus2whicharenotmultiplesofN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		pseries(number1,number2);
	}
	public static void pseries(int n1,int n2)
	{
		int count =1;
		int i=1;
		while(count<n1+1)//1<11
		{

		    int num = (3*i)+2;
		    i++;
		    if((num%n2)==0)
		    {
               
		    }
		    else
		    {   System.out.println(num);
		        count++;
		    }

		  }
		}
	}

