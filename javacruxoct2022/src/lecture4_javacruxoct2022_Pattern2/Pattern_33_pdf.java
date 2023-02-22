package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_33_pdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*n=10
                  0
                9 0 9
              8 9 0 9 8
            7 8 9 0 9 8 7
          6 7 8 9 0 9 8 7 6
        5 6 7 8 9 0 9 8 7 6 5
      4 5 6 7 8 9 0 9 8 7 6 5 4
    3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
 */
		int n =10;
		int value=10;
		int star=0;
	     int space=n-1;
	     int row=1;
	     while(row<=n)//1<=10
	     {
	    	 int i =1;
	         while(i<=space)//1<=9,8,7,6,5,4,3,2,1,0
	    	 {
	         System.out.print("  ");
	    	 i++;
	    	 }	       
	        	  int val=value;//10//9
	        	  for(int j=1;j<=star;j++)
	        		  {System.out.print(val++ + " ");
	        		  }
	        	  int v=n-1;
	        	  System.out.print(0+ " ");
	        	  for(int j=1;j<=star;j++)
	        		  {System.out.print(v-- + " ");
                  }
	        	  System.out.println();
	        	  star++;
	        	  value--;//9
	        	  space--;
	         row++;
            }
	     }
	     
	}
	
