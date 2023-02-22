package lecture3_javacrux2022_Pattern;

import java.util.Scanner;

public class Pattern_10_pdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* n=5 done

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			  for(int z=0;z<n-i;z++)
			    {
				System.out.print("  ");//0,1,2,3,4
				}
	    	for (int j=1;j<=2*i-1;j++)
		     { 
			System.out.print("* ");//9,7,5,3,2,1
		     }
	  
	    System.out.println();
		}
		/*
	     int row=1;
	     int star=2*n-1;
	     int space=0;
	     
	     while(row<=n)
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
	     star=star-2;
	     space++;
	     }
*/
	}

}
