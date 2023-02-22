package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_6 {
	/* * * * * *
	       * * * *
	           * * *
	               * *
	                   *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	    int row=0;
	     while(row<n)
	     { 
	    	 
		     int space=2*row;
		     int i=0;
	    	 //space
	    	 while(i<space)
	    	 {
	    		 System.out.print("   ");
	    		 i++;
	    	 }
	    	 //star
	    	 int j=0;
	    	 int star=n-row;
	    	 while(j<star)
	    	 {
	    		System.out.print("* "); 
	    		j++;
	    	 }
	    	 //next row
	    	 System.out.println();
	    	 row++;
	    	 
	     }
/*
    for(int i=0;i<n;i++)
	{
    	for (int j=0;j<2*i;j++)
	     { 
		System.out.print("  ");
	     }
    for(int z=0;z<n-i;z++)
    {
	System.out.print("* ");
	}
    System.out.println();
	}
	*/	
	}
}
