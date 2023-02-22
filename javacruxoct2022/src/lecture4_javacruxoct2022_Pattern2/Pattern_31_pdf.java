package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_31_pdf {
/*
5 4 3 2 *
5 4 3 * 1
5 4 * 2 1
5 * 3 2 1
* 4 3 2 1
* 
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int row=1;
	     int star=1;
	     int pos=1;
	     while (row<=n)
	     {
	    	 int j=n;
	    	 while(j>=star){
	    		 if(j==pos)
	    		 {System.out.print("*");
	    		 }
	    		 else
	    		 {
	    			 System.out.print(j);
	    		 }
	    		 j--;
	    		 
	    	 }
	     pos++;
	     row++;
	     System.out.println();
	     }
	}

}
