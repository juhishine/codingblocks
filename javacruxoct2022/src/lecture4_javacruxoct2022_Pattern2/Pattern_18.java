package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
		int star=1;
		int row=1;
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

	    /* for(int i=0;i<n;i++)
	     {int countspace=(i<=n/2)?i+1:i/2;
	     for(int j=n/2;j>=countspace;j--)
	    	 System.out.print("  ");
	     int starcount=(i<=n/2)?2*i+1:i;
	     for(int k=1;k<=starcount;k++)
	    	 System.out.print(" *");
	     
	     System.out.println();
	     }
	     */
	}

}
