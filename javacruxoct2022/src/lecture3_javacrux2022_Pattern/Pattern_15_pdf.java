package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_15_pdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
* * * * *
    * * * *
        * * *
            * *
               *
            * *
        * * *
    * * * *
* * * * *
 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int row=1;
	     int star=n;
	     int space=0;
	     while(row<2*n)
	     { int j =1;
	     while(j<=space)
	     {
	    	 System.out.print("  ");
	    	 j++;
	     }
	     int i=1;
	     while(i<=star)
	    	 {System.out.print("* ");
	    	 i++;
	    	 }
	     System.out.println();
	     row++;
	     if(row<=n)
	     {star=star-1;
	     space+=2;
	     }
	     else
	     {
	    	 star++;
	    	 space-=2;}
	     }

		
	}

}
