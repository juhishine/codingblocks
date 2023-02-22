package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Lecture_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
		 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();

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
	    		 if(j<=star/2) // mirror is in star/2 , its mostly common 
	    			 val++;
	    		 else 
	    			 val--;
	    		 j++;
	    		 
	    	 }
	     
	     star=star+2;
	     row++;
	     space--;
	     System.out.println();
	     }
	     
	       
	 	    /* try to solve by for loop 
	 	     int val=1;
			for(int i=0;i<n;i++)
			{ 
				for(int space=1;space<=n-i;space++)
				{System.out.print("  ");
				}
			
				for(int j=1;j<=2*i+1;j++)
				{ int posval=(j>n)?val--:val++; 
					System.out.print(posval +" ");
				}
				System.out.println();
			}

	      */

	}

}
