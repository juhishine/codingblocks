package lecture4_javacruxoct2022_Pattern2;

import java.util.Scanner;

public class Assignment_patternwithzeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1   1=1
2	2  2>1,2=2
3	0	3    3>1,3>2,3=3
4	0	0	4  4>1,4>2,4>3,4=4
5	0	0	0	5  5>1,5>2,5>3,5>4,5=5
		*/
		Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int row=1;
		/*for(int i=1;i<=n;i++)
		{
	    for(int j=1;j<=i;j++)
	        {  
			 System.out.print(val+' '); 
		    }
	    System.out.println();
	    val++;
		}
		*/
	     int val=1;
	     while(row<=n)
	     { 
	    	 int i=1;
	         while(i<=row)
	    	 {
	        	 if(i==row||i==1)
	         System.out.print(val+" ");
	        	 else
	        		 System.out.print("0 ");
	    	 i++;
	    	 }
	    	 val++;
	     System.out.println();
	     row++;
	     }
	}

}
