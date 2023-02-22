package Assignment27thnov_function;

import java.util.Scanner;
/*
 Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9 - t.

Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.

Input Format
The first line contains a single integer x (1 ≤ x ≤ 10^18) — the number that Luke Skywalker gave to Chewbacca.

Constraints
x <= 100000000000000000

Output Format
Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.

Sample Input
4545
Sample Output
4444
 */

public class Chewbaccaandnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long place=1;
		long rem;long num=0;
		long value=0;
	    rem=n%10; 

	while(n!=0){
	        
	        rem = n%10;
	        if(rem > 9-rem){
				if(rem==9 && (n/10)==0){
					// do nothing
				}else
	            	rem = 9-rem;
	        }
	        num = num + rem*place;      //for New number
	        n/=10;
	        place*=10;
	    }
	System.out.println(num);
	    }
	    }