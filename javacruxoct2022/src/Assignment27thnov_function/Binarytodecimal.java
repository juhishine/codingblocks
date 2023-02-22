package Assignment27thnov_function;
import java.util.*;

public class Binarytodecimal {
	/*
Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
101010
Sample Output
42
Explanation
For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	    int sumb=btod(n);
        System.out.println(sumb);
	}
	public static int btod(int  b)
	{int  sum=0;
	int rem=0;
	int mul=1;
		while(b>0)
		{
			
			rem=b%10;
			sum=sum+rem*mul;
			b=b/10;
            mul=mul*2;
		}
return sum;
    }
}