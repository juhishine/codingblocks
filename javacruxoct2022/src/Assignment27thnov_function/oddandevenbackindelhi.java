package Assignment27thnov_function;

import java.util.Scanner;

public class oddandevenbackindelhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as 
follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or
 sum of digits which are odd in that number is divisible by 3. However to check every car for the above 
 criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered 
 N will be allowed to run on Sunday?

Input Format
The first line contains N , then N integers follow each denoting the number of the car.

Constraints
N<=1000 Car No >=0 && Car No <=1000000000

Output Format
N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !

Sample Input
2
12345
12134
Sample Output
Yes
No
Explanation
1 + 3 + 5 = 9 which is divisible by 3
1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.


		 */
		//int n;
		Scanner b=new Scanner(System.in);
		//n=sc.nextInt();
		int rem=0;
		int numberofcar;
	    int i=0;
		numberofcar=b.nextInt();
	    while(i<=numberofcar)
	    {  int sumeven=0, sumodd=0;
	    	int x1=b.nextInt();
	    	while(x1>0) {
		   rem=x1%10;  //4,3,1,2,1
		   x1=x1/10;//1213,121,12,1,0
			if(rem%2==0)
				sumeven+=rem; //6
			else 
				sumodd+=rem; //5
	    	}
		if(sumeven%4 ==0||sumodd%3==0) //6/4||5/3
			System.out.println("yes");
		else
			System.out.println("no");
		i++;
	}
}
}
