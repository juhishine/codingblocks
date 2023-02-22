package Assignment27thnov_function;

import java.util.Scanner;

/*
  Given coefficients of a quadratic equation , you need to print the nature of the roots (Real and Distinct ,
   Real and Equal or Imaginary) and the roots.
If Real and Distinct , print the roots in increasing order.
If Real and Equal , print the same repeating root twice
If Imaginary , no need to print the roots.

Note : Print only the integer part of the roots.

Input Format
First line contains three integer coefficients a,b,c for the equation ax^2 + bx + c = 0.

Constraints
-100 <= a, b, c <= 100

Output Format
Output contains one/two lines. First line contains nature of the roots .The next line contains roots(in 
non-decreasing order) separated by a space if they exist. If roots are imaginary do not print the roots. 
Output the integer values for the roots.

Sample Input
1 -11 28
Sample Output
Real and Distinct
4 7
Explanation
The input corresponds to equation ax^2 + bx + c = 0. Roots = (-b + sqrt(b^2 - 4ac))/2a , 
(-b - sqrt(b^2 - 4ac))/2a
 */

public class Revisingquadraticequations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c=sc.nextInt();
	     QuadraticEquation(a,b,c);
		}
	public static void QuadraticEquation(int a,int b, int c)
	{  
		int d =(int)Math.pow(b,2)-4*a*c;
		int root=(int)(-b+ Math.pow(d,0.5))/(2*a);
	    int root1=(int)(-b-Math.pow(d,0.5))/(2*a);
	    if(d>0)
	    {
	    	System.out.println("Real and Distinct");
	    	if(root<root1)
	    	{
	    		System.out.println(root +" "+root1);
	    	}
	    	else
	    	{
	    		System.out.println(root1 +" "+root);
	    	}
	    }

	    else if(d==0)
	    {
	    	System.out.println("Real and Equal");
	    	
	    	
	    		System.out.println(root1 +" "+root1);
	    	
	    	
	    }

	    else
	    {
	    	System.out.println("Imaginary");
	    }

		}
	}
