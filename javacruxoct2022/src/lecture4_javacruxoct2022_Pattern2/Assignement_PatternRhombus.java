package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignement_PatternRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  input=3
        1
      2 3 2
    3 4 5 4 3
      2 3 2
        1
*/
		int n;
		int val=1;
		int row=1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int space=n-1;
		int length =2*n-1;
        int star=1;
	     while (row<=2*n-1)
	     {
	    	 int i=1;
	    	 while(i<=space)
	    	 {
	    		 System.out.print("  ");
	    	     i++;
	    	 }
	    	 int j=1;
	    	 int value=val;
	    	 while(j<=star)
	    	 {
	    		 System.out.print(value+" ");
	    		 if(j<=star/2) {
	    			 value++;
	    		 }
	    		 else
	    			 value--;
	    		 j++;

	    	 }
	    	 if(row>length/2)
	    	 {space++;
	    	 star=star-2;
	    	 val--;
	    	 }
	    	 else
	    	 {
	         val++;
	         space--;
	    	 star=star+2;
	    	 }
	     row++;
	     System.out.println();
	     }


	}

}
