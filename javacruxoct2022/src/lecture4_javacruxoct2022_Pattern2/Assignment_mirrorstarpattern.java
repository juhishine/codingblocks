package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_mirrorstarpattern {
	/*
      *
    * * *
  * * * * *
    * * *
      *
dec space , inc star, inc space, dec star
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int star=1;
		int row=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int space=n/2;
	     while (row<=n)
	     {
	    	 int i=1;
	    	 while(i<=space)
	    	 {
	    		 System.out.print("  ");
	    	 i++;
	    	 }
	    	 int j=1;
	    	 while(j<=star)
	    	 {
	    		 System.out.print("* ");
	    		 j++;	 
	    	 }
	     if(row>n/2)
	     {
	    	 space++;
	    	 star-=2;
	     }
	     else
	     {
	    	 space--;
	         star+=2;
	     }
	     row++;
	     System.out.println();
	     }
	}

}
