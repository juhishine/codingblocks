package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Pattern_32_pdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
1
2 * 2
3 * 3 * 3
4 * 4 * 4 * 4
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4
3 * 3 * 3
2 * 2
1

 */
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int row=1;
	     int star=1;
	     int val=1;
	     while (row<=(n*2)-1)
	     {
	    	 int i=1;
	    	 while(i<=star)
	    	 {   if(i%2==0)
	    		 System.out.print("* ");
	    	 else 
	    		 System.out.print(val+" ");
	    	 i++;
	    	 }
	     if(row<n)
	     {star+=2;
	     val++;
	     
	     }
	     else
	    	 {
	    	 star-=2;
	         val--;}
	    
	     System.out.println();
	     row++;
	     }
	     }
}

