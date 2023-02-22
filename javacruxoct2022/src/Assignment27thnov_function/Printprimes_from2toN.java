package Assignment27thnov_function;

import java.util.Scanner;

public class Printprimes_from2toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		prime(n);

	}
	public static void prime(int b)
	{ int fact;int j=2;
	     for(int i=0;i<=b;i++)
		  {  fact=0;
	    	 for( j=2;j<=i;j++) 
		{
			if(i%j==0)  
				{fact++;
				}
		}	
		if(fact==1)
			System.out.println(i);
	    }
	}

}
