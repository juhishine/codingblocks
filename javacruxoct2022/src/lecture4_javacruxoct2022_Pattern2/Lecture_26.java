package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Lecture_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	/*	for(int i=1;i<=n;i++)
		{
	    	for (int j=0;j<n-i-1;j++)
		     { 
			System.out.print("  ");
		     }
	    for(int z=0;z<i*2+1;z++)
	    {
			 System.out.print("* " );

		}
	    System.out.println();
		}
*/
	     
	    /* 
		for(int i=0;i<n;i++)
		{ 
			for(int space=1;space<=n-i;space++)
			{System.out.print("  ");
			}
			int val=1;
			for(int j=1;j<=2*i+1;j++)
			{System.out.print(val +" ");
			val++;
			}
			System.out.println();
		}

	     */
	     int space=n-1;
	     int row=1;
	     int star=1;
	     while (row<=n)
	     {
	    	 int i=1;
	    	 while(i<=space)
	    	 {System.out.print("  ");
	    	 i++;
	    	 }
	    	 int j=1;
	    	 int val=1;
	    	 while(j<=star)
	    	 {
	    		 System.out.print(val+" ");
	    		 val++;
	    		 j++;
	    	 }
	     
	     star=star+2;
	     row++;
	     space--;
	     System.out.println();
	     }
	     
	}
	}
	    	 
	     
	


