package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_30_pdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Done
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1

 */

			Scanner sc=new Scanner(System.in);
		     int n=sc.nextInt();
		     int row=1;
		     int star=n;
		     while (row<=n)
		     {
		    	 int j=1;
		    	 int k=0;
		    	 int val=n;
		    	 while(j<=star)
		    	 {
		    		 System.out.print(val +" ");
		    		 j++;
		    		 val--;
		    		 
		    	 }
		     
		     row++;
		     System.out.println();
		     }
	}

}
