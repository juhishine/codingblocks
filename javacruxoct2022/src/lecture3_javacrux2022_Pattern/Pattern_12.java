package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  
		 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
	    	for (int j=0;j<n-i-1;j++)
		     { 
			System.out.print("  ");
		     }
	    for(int z=0;z<i*2+1;z++)
	    {
		 if(z%2==0)
			 System.out.print("* ");
		 else
			 System.out.print("! ");

		}
	    System.out.println();
		}


	}

}
