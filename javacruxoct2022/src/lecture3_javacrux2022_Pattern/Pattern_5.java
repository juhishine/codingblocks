package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_5 {
	/*    *
	     **
	    ***
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
       for(int i=0;i<n;i++) 
       {for(int j=0;j<i;j++)
         {
         			System.out.print("  ");
         }
         for(int z=n-i;z>0;z--)
         {System.out.print("* ");
         }
          System.out.println();
    	   }
    	   
	     /*int row=1;
	     int star=1;
	     int space=n-1;
	     while(row<=n)
	     { 
	    	 int i=1;
	    	 //space
	    	 while(i<=space)
	    	 {
	    		 System.out.print("  ");
	    		 i++;
	    	 }
	    	 //star
	    	 int j=1;
	    	 while(j<=star)
	    	 {
	    		System.out.print("* "); 
	    		j++;
	    	 }
	    	 //next row
	    	 System.out.println();
	    	 row++;
	    	 space--;
	    	 star++;
	     }
	     */
	     }
	     

	}


