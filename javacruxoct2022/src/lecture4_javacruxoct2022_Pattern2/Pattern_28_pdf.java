package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_28_pdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* n=5
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
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
	    		 System.out.print(val +" ");
	    		 if(j<=star/2) // mirror is in star/2 , its mostly common 
	    			 val+=2;
	    		 else 
	    			 val-=2;
	    		 j++;
	    		 
	    	 }
	     
	     star=star+2;
	     row++;
	     space--;
	     System.out.println();
	     }


	}

}
